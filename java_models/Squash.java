// Made with Blockbench 5.2.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


public class Squash<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "squash"), "main");
	private final ModelPart body;
	private final ModelPart brow;

	public Squash(ModelPart root) {
		this.body = root.getChild("body");
		this.brow = this.body.getChild("brow");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 0).addBox(-8.0F, -10.0F, -8.0F, 16.0F, 10.0F, 16.0F, new CubeDeformation(0.0F))
		.texOffs(64, 0).addBox(-8.0F, -10.0F, -8.0F, 16.0F, 10.0F, 16.0F, new CubeDeformation(0.5F))
		.texOffs(56, 26).addBox(-7.0F, -18.0F, -7.0F, 14.0F, 8.0F, 14.0F, new CubeDeformation(0.5F))
		.texOffs(0, 26).addBox(-7.0F, -18.0F, -7.0F, 14.0F, 8.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = body.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(26, 46).addBox(0.0F, -4.0F, -1.0F, 0.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -18.0F, 0.0F, 0.331F, -0.1486F, 0.3656F));

		PartDefinition cube_r2 = body.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(26, 46).addBox(0.0F, -4.0F, -1.0F, 0.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -18.0F, 0.0F, 2.0025F, -1.2091F, -1.612F));

		PartDefinition brow = body.addOrReplaceChild("brow", CubeListBuilder.create().texOffs(0, 48).addBox(-6.0F, -1.0F, -1.0F, 12.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -13.0F, -7.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}
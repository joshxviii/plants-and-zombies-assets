// Made with Blockbench 5.1.6
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


public class IceShroom<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "iceshroom"), "main");
	private final ModelPart body;
	private final ModelPart cap;
	private final ModelPart head;

	public IceShroom(ModelPart root) {
		this.body = root.getChild("body");
		this.cap = this.body.getChild("cap");
		this.head = this.body.getChild("head");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cap = body.addOrReplaceChild("cap", CubeListBuilder.create().texOffs(0, 0).addBox(-5.0F, -1.0F, -5.0F, 10.0F, 2.0F, 10.0F, new CubeDeformation(0.0F))
		.texOffs(0, 27).addBox(-2.0F, -8.0F, -2.0F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -7.0F, 0.0F));

		PartDefinition cube_r1 = cap.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(18, 35).addBox(-0.5F, -6.0F, -0.5F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, -1.0F, -0.5F, 0.0F, 0.0F, 1.0036F));

		PartDefinition cube_r2 = cap.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(18, 35).addBox(-1.5F, -6.0F, -0.5F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.0F, 1.5F, -1.0036F, 0.0F, 0.0F));

		PartDefinition cube_r3 = cap.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(18, 35).addBox(-1.5F, -6.0F, -1.5F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, -1.0F, 0.5F, 0.0F, 0.0F, -1.0036F));

		PartDefinition cube_r4 = cap.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(18, 35).addBox(-0.5F, -6.0F, -1.5F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.0F, -1.5F, 1.0036F, 0.0F, 0.0F));

		PartDefinition cube_r5 = cap.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(16, 27).addBox(-1.5F, -5.0F, -1.5F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.25F, -1.0F, -2.25F, 0.3655F, -0.147F, 0.3655F));

		PartDefinition cube_r6 = cap.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(16, 27).addBox(-1.5F, -5.0F, -1.5F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.25F, -1.0F, -2.25F, 0.3655F, 0.147F, -0.3655F));

		PartDefinition cube_r7 = cap.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(16, 27).addBox(-1.5F, -5.0F, -1.5F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.25F, -1.0F, 2.25F, -0.3655F, -0.147F, -0.3655F));

		PartDefinition cube_r8 = cap.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(16, 27).addBox(-1.5F, -5.0F, -1.5F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.25F, -1.0F, 2.25F, -0.3655F, 0.147F, 0.3655F));

		PartDefinition head = body.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 12).addBox(-4.0F, -7.0F, -4.0F, 8.0F, 7.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}
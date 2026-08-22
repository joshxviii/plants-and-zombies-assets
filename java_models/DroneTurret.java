// Made with Blockbench 5.1.6
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


public class DroneTurret<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "droneturret"), "main");
	private final ModelPart body;
	private final ModelPart hat;
	private final ModelPart propeller;
	private final ModelPart head;
	private final ModelPart jaw;

	public DroneTurret(ModelPart root) {
		this.body = root.getChild("body");
		this.hat = this.body.getChild("hat");
		this.propeller = this.body.getChild("propeller");
		this.head = this.body.getChild("head");
		this.jaw = this.head.getChild("jaw");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offset(0.0F, 16.0F, -1.0F));

		PartDefinition hat = body.addOrReplaceChild("hat", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition helmet_r1 = hat.addOrReplaceChild("helmet_r1", CubeListBuilder.create().texOffs(0, 16).addBox(-4.5F, -4.0F, -4.5F, 9.0F, 4.0F, 9.0F, new CubeDeformation(0.0F))
		.texOffs(16, 0).addBox(-4.5F, 0.0F, -6.5F, 9.0F, 0.0F, 12.0F, new CubeDeformation(0.0F))
		.texOffs(0, 34).addBox(-1.0F, -8.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(3, 38).addBox(-0.5F, -6.0F, 0.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-1.5F, -5.0F, -5.5F, 3.0F, 5.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.75F, 0.0F, -0.0872F, 0.0038F, 0.0435F));

		PartDefinition propeller = body.addOrReplaceChild("propeller", CubeListBuilder.create().texOffs(14, 12).addBox(-11.0F, -0.5F, -11.0F, 22.0F, 0.0F, 22.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition head = body.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 48).addBox(-4.0F, 0.0F, -4.0F, 8.0F, 6.0F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(52, 7).addBox(-4.0F, 6.0F, 1.0F, 8.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(83, 4).addBox(-3.5F, 6.0F, -3.75F, 7.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(0, 32).addBox(-4.0F, 0.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.5F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create().texOffs(83, 5).addBox(-3.5F, -1.0F, -4.75F, 7.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(52, 0).addBox(-4.0F, 0.0F, -5.0F, 8.0F, 2.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(0, 64).addBox(-4.0F, -6.0F, -5.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.5F)), PartPose.offset(0.0F, 6.0F, 1.0F));

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
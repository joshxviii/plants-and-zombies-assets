// Made with Blockbench 5.2.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


public class RaZombie<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "razombie"), "main");
	private final ModelPart root;
	private final ModelPart head;
	private final ModelPart nemas;
	private final ModelPart hat;
	private final ModelPart body;
	private final ModelPart right_arm;
	private final ModelPart locator_right_hand;
	private final ModelPart left_arm;
	private final ModelPart locator_left_hand;
	private final ModelPart right_leg;
	private final ModelPart locator_right_leg;
	private final ModelPart left_leg;
	private final ModelPart locator_left_leg;

	public RaZombie(ModelPart root) {
		this.root = root.getChild("root");
		this.head = this.root.getChild("head");
		this.nemas = this.head.getChild("nemas");
		this.hat = this.head.getChild("hat");
		this.body = this.root.getChild("body");
		this.right_arm = this.root.getChild("right_arm");
		this.locator_right_hand = this.right_arm.getChild("locator_right_hand");
		this.left_arm = this.root.getChild("left_arm");
		this.locator_left_hand = this.left_arm.getChild("locator_left_hand");
		this.right_leg = this.root.getChild("right_leg");
		this.locator_right_leg = this.right_leg.getChild("locator_right_leg");
		this.left_leg = this.root.getChild("left_leg");
		this.locator_left_leg = this.left_leg.getChild("locator_left_leg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition root = partdefinition.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offset(0.0F, 4.6667F, 0.0F));

		PartDefinition head = root.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(32, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.5F)), PartPose.offset(0.0F, -4.6667F, 0.0F));

		PartDefinition nemas = head.addOrReplaceChild("nemas", CubeListBuilder.create(), PartPose.offset(0.0F, -8.075F, -0.0375F));

		PartDefinition cube_r1 = nemas.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(77, 26).mirror().addBox(0.0F, -3.0F, 0.0F, 2.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(77, 14).mirror().addBox(2.0F, -5.0F, 0.0F, 2.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(85, 26).addBox(14.0F, -3.0F, 0.0F, 2.0F, 7.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(85, 14).addBox(12.0F, -5.0F, 0.0F, 2.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-8.0F, 4.75F, -2.0F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r2 = nemas.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(65, 14).addBox(-1.0F, -1.0F, -7.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(64, 0).addBox(-5.0F, -2.0F, -5.0F, 10.0F, 4.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1745F, 0.0F, 0.0F));

		PartDefinition hat = head.addOrReplaceChild("hat", CubeListBuilder.create(), PartPose.offset(0.0F, -8.0F, 0.0F));

		PartDefinition body = root.addOrReplaceChild("body", CubeListBuilder.create().texOffs(16, 16).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(16, 32).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.25F)), PartPose.offset(0.0F, -4.6667F, 0.0F));

		PartDefinition right_arm = root.addOrReplaceChild("right_arm", CubeListBuilder.create().texOffs(40, 16).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(40, 32).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.25F)), PartPose.offset(-5.0F, -2.6667F, 0.0F));

		PartDefinition locator_right_hand = right_arm.addOrReplaceChild("locator_right_hand", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, 9.75F, -1.5F, -2.0944F, 3.1416F, 0.0F));

		PartDefinition left_arm = root.addOrReplaceChild("left_arm", CubeListBuilder.create().texOffs(32, 48).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(48, 48).mirror().addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.25F)).mirror(false), PartPose.offset(5.0F, -2.6667F, 0.0F));

		PartDefinition locator_left_hand = left_arm.addOrReplaceChild("locator_left_hand", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0F, 9.75F, -1.5F, 2.0944F, 0.0F, 0.0F));

		PartDefinition right_leg = root.addOrReplaceChild("right_leg", CubeListBuilder.create().texOffs(0, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(0, 32).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.25F)), PartPose.offset(-1.9F, 7.3333F, 0.0F));

		PartDefinition locator_right_leg = right_leg.addOrReplaceChild("locator_right_leg", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition left_leg = root.addOrReplaceChild("left_leg", CubeListBuilder.create().texOffs(16, 48).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(0, 48).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.25F)), PartPose.offset(1.9F, 7.3333F, 0.0F));

		PartDefinition locator_left_leg = left_leg.addOrReplaceChild("locator_left_leg", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		root.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}
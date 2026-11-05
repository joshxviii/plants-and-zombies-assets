// Made with Blockbench 5.2.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


public class Goat<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "goat"), "main");
	private final ModelPart root;
	private final ModelPart head;
	private final ModelPart body;
	private final ModelPart right_hind_leg;
	private final ModelPart left_hind_leg;
	private final ModelPart right_front_leg;
	private final ModelPart left_front_leg;

	public Goat(ModelPart root) {
		this.root = root.getChild("root");
		this.head = this.root.getChild("head");
		this.body = this.root.getChild("body");
		this.right_hind_leg = this.root.getChild("right_hind_leg");
		this.left_hind_leg = this.root.getChild("left_hind_leg");
		this.right_front_leg = this.root.getChild("right_front_leg");
		this.left_front_leg = this.root.getChild("left_front_leg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition root = partdefinition.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition head = root.addOrReplaceChild("head", CubeListBuilder.create().texOffs(12, 16).addBox(0.0F, 2.0F, -5.0F, 0.0F, 5.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(0, 30).addBox(-4.5F, -3.25F, -1.25F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(6, 30).addBox(2.5F, -3.25F, -1.25F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(28, 39).addBox(0.49F, -4.25F, -1.25F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(28, 7).addBox(0.49F, -7.25F, -1.25F, 2.0F, 3.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(36, 39).addBox(-2.49F, -4.25F, -1.25F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(32, 25).addBox(-2.49F, -7.25F, -1.25F, 2.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -10.0F, -4.0F));

		PartDefinition cube_r1 = head.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(20, 15).addBox(-3.0F, -3.0F, -2.0F, 5.0F, 5.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(28, 0).addBox(-2.0F, -2.0F, -5.0F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.25F, -1.25F, 0.7854F, 0.0F, 0.0F));

		PartDefinition body = root.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, 0.0F, 0.0F, 4.0F, 5.0F, 10.0F, new CubeDeformation(0.0F))
		.texOffs(0, 5).addBox(0.0F, 5.0F, 0.0F, 0.0F, 2.0F, 10.0F, new CubeDeformation(0.0F))
		.texOffs(0, 33).addBox(-1.0F, 1.5F, -1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -10.0F, -4.0F));

		PartDefinition right_hind_leg = root.addOrReplaceChild("right_hind_leg", CubeListBuilder.create().texOffs(0, 25).addBox(0.5F, 2.0F, 0.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 17).addBox(0.5F, -2.0F, -2.0F, 2.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-3.5F, -5.0F, 5.0F));

		PartDefinition left_hind_leg = root.addOrReplaceChild("left_hind_leg", CubeListBuilder.create().texOffs(8, 25).addBox(0.5F, 2.0F, 0.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(20, 25).addBox(0.5F, -2.0F, -2.0F, 2.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.5F, -5.0F, 5.0F));

		PartDefinition right_front_leg = root.addOrReplaceChild("right_front_leg", CubeListBuilder.create().texOffs(32, 32).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.0F, -5.0F, -3.0F));

		PartDefinition left_front_leg = root.addOrReplaceChild("left_front_leg", CubeListBuilder.create().texOffs(20, 33).addBox(-0.5F, 0.0F, -1.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.5F, -5.0F, -3.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		root.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}
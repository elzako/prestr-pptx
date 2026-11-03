package com.aspose.slides;

public class SummaryZoomSection extends SectionZoomFrame implements ISummaryZoomSection {
   private String n5;
   private String l6;
   private float k5;
   private float u3;
   private float a6;
   private float u9;

   @Override
   public final String getTitle() {
      return this.n5;
   }

   @Override
   public final void setTitle(String value) {
      this.n5 = value;
   }

   @Override
   public final String getDescription() {
      return this.l6;
   }

   @Override
   public final void setDescription(String value) {
      this.l6 = value;
   }

   final float k5() {
      return this.k5;
   }

   final void n5(float var1) {
      this.k5 = var1;
   }

   final float u9() {
      return this.u3;
   }

   final void u3(float var1) {
      this.u3 = var1;
   }

   final float x8() {
      return this.a6;
   }

   final void a6(float var1) {
      this.a6 = var1;
   }

   final float y4() {
      return this.u9;
   }

   final void u9(float var1) {
      this.u9 = var1;
   }

   SummaryZoomSection(r0g parentImmediate) {
      super(parentImmediate);
      this.setReturnToParent(true);
      this.a6(100.0F);
      this.u9(100.0F);
   }
}

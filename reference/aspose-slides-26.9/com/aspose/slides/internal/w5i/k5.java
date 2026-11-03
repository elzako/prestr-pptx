package com.aspose.slides.internal.w5i;

import com.aspose.slides.internal.b3z.s7;

public class k5 extends com.aspose.slides.internal.d0e.a6 {
   public k5() {
      this.u9 = "marker";
   }

   public final com.aspose.slides.internal.b3z.a6 a0() {
      return com.aspose.slides.internal.b3z.a6.n5(this.l6.k5("refX"), com.aspose.slides.internal.b3z.a6.k5(0.0F));
   }

   public final com.aspose.slides.internal.b3z.a6 d2() {
      return com.aspose.slides.internal.b3z.a6.n5(this.l6.k5("refY"), com.aspose.slides.internal.b3z.a6.k5(0.0F));
   }

   public final com.aspose.slides.internal.b3z.a6 d5() {
      return com.aspose.slides.internal.b3z.a6.n5(this.l6.k5("markerWidth"), com.aspose.slides.internal.b3z.a6.k5(3.0F));
   }

   public final void l6(com.aspose.slides.internal.b3z.a6 var1) {
      this.l6.l6("markerWidth", var1.toString());
   }

   public final com.aspose.slides.internal.b3z.a6 s3() {
      return com.aspose.slides.internal.b3z.a6.n5(this.l6.k5("markerHeight"), com.aspose.slides.internal.b3z.a6.k5(3.0F));
   }

   public final void k5(com.aspose.slides.internal.b3z.a6 var1) {
      this.l6.l6("markerHeight", var1.toString());
   }

   public final String p8() {
      return this.l6.k5("orient", "0");
   }

   public final void s7(String var1) {
      this.l6.l6("orient", var1);
   }

   public final String f2() {
      return this.l6.k5("markerUnits", "strokeWidth");
   }

   public final void x8(String var1) {
      this.l6.l6("markerUnits", var1);
   }

   public final boolean i1() {
      return "strokeWidth".equals(this.f2());
   }

   public final s7 e5() {
      return s7.n5(this.l6.k5("viewBox"));
   }

   public final void n5(s7 var1) {
      this.l6.l6("viewBox", var1.toString());
   }

   public final com.aspose.slides.internal.b3z.k5 b3() {
      return com.aspose.slides.internal.b3z.k5.n5(this.l6.k5("preserveAspectRatio"));
   }
}

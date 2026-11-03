package com.aspose.slides;

class v4y {
   private n2z n5;
   private int l6;
   private boolean k5;
   private final l5 u3;

   public final boolean n5() {
      return this.k5;
   }

   public final int l6() {
      return this.l6;
   }

   public final void n5(int var1) {
      this.l6 = var1;
      this.k5 = false;
   }

   public v4y(l5 var1) {
      this.u3 = var1;
      this.n5 = new n2z(null, var1.d2(), this);
      this.k5 = var1.c8().k5().getTextFrameForOverriding() == null
         || com.aspose.slides.ms.System.n1.k5(var1.c8().k5().getTextFrameForOverriding().getTextFrameFormat().getRotationAngle());
   }

   public final String k5() {
      if (this.u3.c8().getDisplayUnit() == 10) {
         return com.aspose.slides.ms.System.d1.n5(new String[]{"x", com.aspose.slides.ms.System.d2.u9(this.u3.c8().n5().n5())});
      } else if (this.u3.c8().k5().getTextFrameForOverriding() == null) {
         return this.h0();
      } else {
         return com.aspose.slides.ms.System.d1.n5(this.u3.c8().k5().getTextFrameForOverriding().getText())
            ? this.h0()
            : this.u3.c8().k5().getTextFrameForOverriding().getText();
      }
   }

   private int u9() {
      return this.u3.c8().getDisplayUnit();
   }

   final com.aspose.slides.internal.o9b.n3 u3() {
      Chart var1 = this.u3.d2().n3();
      return var1.n5(this.u3.c8().k5().getTextFormat());
   }

   public final com.aspose.slides.internal.o9b.c8 a6() {
      Chart var1 = this.u3.d2().n3();
      com.aspose.slides.internal.o9b.c8 var2 = new com.aspose.slides.internal.o9b.c8();
      if (var1.getStyle() + 1 > 40) {
         var1.n5((byte)1).n5(var2);
      } else {
         var1.n5((byte)0).n5(var2);
      }

      var1.n5(this.u3.c8().k5().getTextFormat(), var2.o8()).n5(var2);
      return var2;
   }

   private String h0() {
      switch (this.u9()) {
         case 0:
            return "None";
         case 1:
            return "Hundreds";
         case 2:
            return "Thousands";
         case 3:
         case 4:
         case 6:
         case 7:
         default:
            return "None";
         case 5:
            return "Millions";
         case 8:
            return "Billions";
         case 9:
            return "Trillions";
      }
   }
}

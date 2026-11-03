package com.aspose.slides;

class w3q {
   private Trendline l6;
   private String k5;
   private com.aspose.slides.internal.o9b.n3 u3;
   private String a6;
   private float u9;
   private g3y h0;
   private com.aspose.slides.internal.o9b.c8 c8 = new com.aspose.slides.internal.o9b.c8();
   private boolean t2 = true;
   com.aspose.slides.internal.o9b.w1 n5;

   public w3q(Trendline var1, g3y var2) {
      this.n5 = com.aspose.slides.internal.o9b.w1.n5.u3();
      this.l6 = var1;
      n1g var3 = var2.t2();
      Chart var4 = var3.n3();
      this.h0 = var2;
      TextFrame var5 = (TextFrame)var1.getTextFrameForOverriding();
      this.n5(var4.n5((byte)(var3.n3().getStyle() + 1 > 40 ? 1 : 0)).o8());
      this.n5(var4.n5(var1.getTextFormat(), this.l6().o8()).o8());
      this.k5 = var2.k5();
      this.u3 = var4.n5(var1.getTextFormat());
      if (com.aspose.slides.ms.System.n1.k5(this.u9) && var5 != null) {
         this.u9 = ((TextFrameFormat)var5.getTextFrameFormat()).getRotationAngle();
      }

      this.u9 = com.aspose.slides.ms.System.n1.k5(this.u9) ? 0.0F : this.u9 * -1.0F;
      this.a6 = var5 != null && !"".equals(var5.getText()) ? com.aspose.slides.ms.System.d1.n5(var5.t2(), "\r", com.aspose.slides.ms.System.p8.k5()) : "";
   }

   final g3y n5() {
      return this.h0;
   }

   public final com.aspose.slides.internal.o9b.c8 l6() {
      return this.c8.o8();
   }

   public final void n5(com.aspose.slides.internal.o9b.c8 var1) {
      this.c8 = var1.o8();
   }

   public final Trendline k5() {
      return this.l6;
   }

   public final String u3() {
      if (com.aspose.slides.ms.System.d1.n5(this.l6.getTrendlineName())) {
         switch (this.l6.getTrendlineType()) {
            case 0:
               return com.aspose.slides.ms.System.d1.n5(new String[]{"Expon.(", this.k5, ")"});
            case 1:
               return com.aspose.slides.ms.System.d1.n5(new String[]{"Linear(", this.k5, ")"});
            case 2:
               return com.aspose.slides.ms.System.d1.n5(new String[]{"Log.(", this.k5, ")"});
            case 3:
               return com.aspose.slides.ms.System.d1.n5(new String[]{com.aspose.slides.ms.System.e2.l6(this.l6.getPeriod()), " per. Mov. Avg.(", this.k5, ")"});
            case 4:
               return com.aspose.slides.ms.System.d1.n5(new String[]{"Poly.(", this.k5, ")"});
            case 5:
               return com.aspose.slides.ms.System.d1.n5(new String[]{"Power(", this.k5, ")"});
            default:
               return "";
         }
      } else {
         return this.l6.getTrendlineName();
      }
   }

   final void n5(boolean var1) {
      if (this.t2 != var1) {
         this.t2 = var1;
         if (this.n5() != null && this.n5().n5() != var1) {
            this.n5().n5(var1);
         }
      }
   }

   public final String a6() {
      return this.a6;
   }

   public final com.aspose.slides.internal.o9b.n3 u9() {
      return this.u3;
   }

   public final float h0() {
      return this.u9;
   }
}

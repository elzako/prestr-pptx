package com.aspose.slides;

class b9y {
   private String l6;
   private com.aspose.slides.internal.o9b.n3 k5;
   private com.aspose.slides.internal.o9b.n3 u3;
   n2z n5;
   private float a6;
   private ChartTitle u9;
   private n1g h0;

   b9y(ChartTitle var1, n1g var2, boolean var3) {
      Chart var4 = (Chart)var1.getChart();
      this.h0 = var2;
      this.u9 = var1;
      TextFrame var5 = (TextFrame)var1.getTextFrameForOverriding();
      this.n5 = new n2z((Format)var1.getFormat(), var2, var1);
      this.a6 = ((TextFrameFormat)var1.getTextFormat().getTextBlockFormat()).getRotationAngle();
      if (com.aspose.slides.ms.System.n1.k5(this.a6) && var5 != null) {
         this.a6 = ((TextFrameFormat)var5.getTextFrameFormat()).getRotationAngle();
         if (com.aspose.slides.ms.System.n1.k5(this.a6) && var5.getTextFrameFormat().getTextVerticalType() != -1) {
            this.a6 = 0.0F;
         }
      }

      this.a6 = com.aspose.slides.ms.System.n1.k5(this.a6) ? this.a6 : this.a6 * -1.0F;
      boolean var6 = ((DocumentProperties)var2.n3().getPresentation().getDocumentProperties()).u9();
      if (var3 && var5 == null && (var4.getChartData().getSeries().size() == 1 || var4.getType() == 26) && var6) {
         this.l6 = var2.y4().get_Item(0).k5();
      } else if (var5 != null) {
         if (this.h0().n3().k5()) {
            this.l6 = var5.t2();
         } else {
            this.l6 = com.aspose.slides.ms.System.d1.n5(var5.t2(), "\r", com.aspose.slides.ms.System.p8.k5());
         }
      } else {
         this.l6 = var3 ? "Chart Title" : "Axis Title";
      }

      this.k5 = var4.n5(var1.getTextFormat());
      if (var5 != null) {
         this.u3 = var4.n5(var1.getTextFormat(), var5);
      }
   }

   public final String n5() {
      return this.l6;
   }

   public final com.aspose.slides.internal.o9b.n3 l6() {
      return this.k5;
   }

   public final com.aspose.slides.internal.o9b.c8 k5() {
      Chart var1 = this.h0.n3();
      int var2 = var1.getStyle() + 1 > 40 ? 1 : 0;
      com.aspose.slides.internal.o9b.c8 var3 = var1.n5((byte)var2).o8();
      return var1.n5(this.u9.getTextFormat(), var3.o8());
   }

   public final float u3() {
      return this.a6;
   }

   public final void n5(float var1) {
      this.a6 = var1;
   }

   final com.aspose.slides.internal.o9b.n3 a6() {
      return this.u3;
   }

   private com.aspose.slides.internal.o9b.n3 c8() {
      com.aspose.slides.internal.o9b.n3 var1 = this.a6();
      if (var1 == null) {
         var1 = this.l6();
      }

      return var1;
   }

   final com.aspose.slides.internal.o9b.c8 u9() {
      Chart var1 = this.h0.n3();
      int var2 = var1.getStyle() + 1 > 40 ? 1 : 0;
      com.aspose.slides.internal.o9b.c8 var3 = var1.n5((byte)var2).o8();
      var1.n5(this.u9.getTextFormat(), var3.o8()).n5(var3);
      return var1.n5(var3.o8(), this.u9.getTextFrameForOverriding());
   }

   final n1g h0() {
      return this.h0;
   }

   final com.aspose.slides.internal.o9b.p8 n5(com.aspose.slides.internal.o9b.f2 var1) {
      return h6l.n5(this.n5(), this.u3(), this.c8(), 1, this.h0, var1.a6());
   }

   final void n5(n1g var1) {
      if (!com.aspose.slides.ms.System.n1.k5(this.u9.getX()) && !com.aspose.slides.ms.System.n1.k5(this.u9.getY())) {
         com.aspose.slides.internal.o9b.y2 var2 = this.n5.n5.n3();
         var2.k5(com.aspose.slides.internal.v6g.k5.u3(var1.y1() + var1.c4() * this.u9.getX(), 13));
         var2.u3(com.aspose.slides.internal.v6g.k5.u3(var1.a0() + var1.y2() * this.u9.getY(), 13));
         var2.k5(var2.s7() < 0 ? 0 : var2.s7());
         var2.u3(var2.x8() < 0 ? 0 : var2.x8());
         if (var2.u9() > var1.y1() + var1.c4()) {
            var2.k5(com.aspose.slides.internal.v6g.k5.u3(var1.y1() + var1.c4() - var2.t2(), 13));
         }

         var2.u3(this.n5.n5);
      }

      this.n5.n5();
      h6l.n5(
         com.aspose.slides.internal.o9b.y1.n5(this.n5.n5).y4(),
         this.n5(),
         com.aspose.slides.ms.System.n1.k5(this.u3()) ? 0 : com.aspose.slides.internal.v6g.k5.u3(this.u3(), 13),
         this.c8(),
         this.u9().o8(),
         1,
         2,
         var1
      );
   }

   final void n5(n1g var1, float var2) {
      if (!com.aspose.slides.ms.System.n1.k5(this.u9.getX()) && !com.aspose.slides.ms.System.n1.k5(this.u9.getY())) {
         com.aspose.slides.internal.o9b.y2 var3 = this.n5.n5.n3();
         var3.k5(com.aspose.slides.internal.v6g.k5.u3(var1.y1() + var1.c4() * this.u9.getX(), 13));
         var3.u3(com.aspose.slides.internal.v6g.k5.u3(var1.a0() + var1.y2() * this.u9.getY(), 13));
         var3.k5(var3.s7() < 0 ? 0 : var3.s7());
         var3.u3(var3.x8() < 0 ? 0 : var3.x8());
         if (var3.u9() > var1.y1() + var1.c4()) {
            var3.k5(com.aspose.slides.internal.v6g.k5.u3(var1.y1() + var1.c4() - var3.t2(), 13));
         }

         var3.u3(this.n5.n5);
      }

      this.n5.n5();
      j9e.n5(
         com.aspose.slides.internal.o9b.y1.n5(this.n5.n5).y4(),
         this.n5(),
         com.aspose.slides.ms.System.n1.k5(this.u3()) ? 0 : com.aspose.slides.internal.v6g.k5.u3(this.u3(), 13),
         this.c8(),
         this.u9().o8(),
         1,
         2,
         var1,
         var2
      );
   }
}

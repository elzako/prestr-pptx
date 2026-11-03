package com.aspose.slides;

class n2z {
   private final n1g a6;
   private Object u9;
   private Format h0;
   com.aspose.slides.internal.o9b.y2 n5 = new com.aspose.slides.internal.o9b.y2();
   com.aspose.slides.internal.o9b.y1 l6 = new com.aspose.slides.internal.o9b.y1();
   com.aspose.slides.internal.o9b.y1 k5 = new com.aspose.slides.internal.o9b.y1();
   com.aspose.slides.internal.o9b.y1 u3 = new com.aspose.slides.internal.o9b.y1();

   private Format l6() {
      return this.h0;
   }

   private void n5(Format var1) {
      this.h0 = var1;
   }

   n2z(Format var1, n1g var2, Object var3) {
      this.n5(var1);
      this.a6 = var2;
      this.u9 = var3;
   }

   final void n5() {
      com.aspose.slides.internal.o9b.c8 var1 = this.u9().o8();
      com.aspose.slides.internal.o9b.c8 var2 = this.k5().o8();
      if (this.a6.n3().k5()) {
         boolean var3 = w5k.n5(
            this.l6.y4(), this.a6.o0().y4(), this.a6, this.l6().getEffect3D(), this.l6().getFill(), this.l6().getLine(), var2.o8(), var1.o8()
         );
         if (!var3) {
            w5k.l6(var1.o8(), var2.o8(), this.a6, this.l6.y4(), this.l6());
            w5k.n5(var1.o8(), var2.o8(), this.a6, this.l6.y4(), this.l6());
         }
      } else {
         boolean var4 = w5k.n5(
            com.aspose.slides.internal.o9b.y1.n5(this.n5).y4(),
            this.a6.o0().y4(),
            this.a6,
            this.l6().getEffect3D(),
            this.l6().getFill(),
            this.l6().getLine(),
            var2.o8(),
            var1.o8()
         );
         if (!var4) {
            w5k.l6(var1.o8(), var2.o8(), this.a6, com.aspose.slides.internal.o9b.y1.n5(this.n5).y4(), this.l6());
            w5k.n5(var1.o8(), var2.o8(), this.a6, com.aspose.slides.internal.o9b.y1.n5(this.n5).y4(), this.l6());
         }
      }
   }

   private com.aspose.slides.internal.o9b.c8 k5() {
      if (!com.aspose.slides.internal.v6g.k5.l6(this.u9, ChartPlotArea.class) && !com.aspose.slides.internal.v6g.k5.l6(this.u9, IChartPlotArea.class)) {
         return com.aspose.slides.internal.o9b.c8.u3.o8();
      }

      boolean var1 = ChartTypeCharacterizer.is3DChart(((ChartPlotArea)this.u9).getChart().getType());
      return var1 ? this.a6() : this.u3();
   }

   private com.aspose.slides.internal.o9b.c8 u3() {
      int var1 = this.a6.n3().getStyle() + 1;
      if (!com.aspose.slides.internal.v6g.k5.l6(this.u9, ChartPlotArea.class) && !com.aspose.slides.internal.v6g.k5.l6(this.u9, IChartPlotArea.class)) {
         return com.aspose.slides.internal.o9b.c8.u3.o8();
      } else if (var1 <= 32) {
         return com.aspose.slides.internal.o9b.c8.u3.o8();
      } else if (var1 <= 34) {
         com.aspose.slides.internal.o9b.c8 var5 = this.a6.n3().n5((byte)0).o8();
         w5k.n5(var5.o8(), 0.5).n5(var5);
         return com.aspose.slides.internal.o9b.c8.n5(255, var5.o8());
      } else if (var1 <= 40) {
         int var4 = var1 - 34;
         com.aspose.slides.internal.o9b.c8 var3 = this.a6.n3().n5((byte)var4).o8();
         w5k.n5(var3.o8(), 0.2).n5(var3);
         return com.aspose.slides.internal.o9b.c8.n5(255, var3.o8());
      } else {
         com.aspose.slides.internal.o9b.c8 var2 = this.a6.n3().n5((byte)0).o8();
         w5k.n5(var2.o8(), 0.95).n5(var2);
         return com.aspose.slides.internal.o9b.c8.n5(255, var2.o8());
      }
   }

   private com.aspose.slides.internal.o9b.c8 a6() {
      int var1 = this.a6.n3().getStyle() + 1;
      return var1 <= 40 ? com.aspose.slides.internal.o9b.c8.u3.o8() : this.a6.n3().n5((byte)0).o8();
   }

   private com.aspose.slides.internal.o9b.c8 u9() {
      return com.aspose.slides.internal.o9b.c8.u3.o8();
   }
}

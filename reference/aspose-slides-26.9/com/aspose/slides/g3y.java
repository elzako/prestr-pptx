package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;

class g3y {
   private List<t9z> n5 = new List<>();
   private ChartSeries l6;
   private n1g k5;
   private p3o u3;
   private t9z a6;
   private List<w3q> u9 = new List<>();
   private boolean h0 = true;
   private double c8;

   final boolean n5() {
      return this.h0;
   }

   final void n5(boolean var1) {
      if (this.h0 != var1) {
         this.h0 = var1;
         if (this.k5 != null && this.k5.n5() != var1) {
            this.k5.n5(var1);
         }
      }
   }

   g3y(ChartSeries var1, n1g var2) {
      if (ChartTypeCharacterizer.e2(var1.getType())) {
         var1.t2();
      }

      this.l6 = var1;
      this.k5 = var2;
      this.u3 = new p3o(var2, var1.getMarker(), this);
      if (var1.getTrendLines() != null) {
         for (int var3 = 0; var3 < var1.getTrendLines().getCount(); var3++) {
            this.u9.addItem(new w3q((Trendline)var1.getTrendLines().get_Item(var3), this));
         }
      }

      int var8 = var1.getDataPoints().size();
      this.a6 = new t9z(null, this);
      boolean var4 = ((ChartData)var2.n3().getChartData()).l6().k5() != 2;

      for (int var5 = 0; var5 < var8; var5++) {
         ChartDataPoint var6 = (ChartDataPoint)var1.getDataPoints().get_Item(var5);
         if (ChartTypeCharacterizer.isSeriesUsesValueCoordinate(var1.getType())) {
            if (!var4) {
               IDoubleChartValue var7 = var1.getDataPoints().get_Item(var5).getValue();
               if (var7.getDataSourceType() == 0 && var7.getAsCell() == null) {
                  continue;
               }

               this.n5.addItem(new t9z((ChartDataPoint)var1.getDataPoints().get_Item(var5), this));
            } else {
               if (var6.c8()) {
                  continue;
               }

               this.n5.addItem(new t9z((ChartDataPoint)var1.getDataPoints().get_Item(var5), this));
               if (var1.getDataPoints().get_Item(var5).getValue().getDataSourceType() == 0 && var6.t2().n5() == null) {
                  this.n5.get_Item(this.n5.size() - 1).l6(true);
               }
            }
         }

         if (ChartTypeCharacterizer.isSeriesUsesYValueCoordinate(var1.getType())) {
            IDoubleChartValue var9 = var1.getDataPoints().get_Item(var5).getYValue();
            if (var9.getDataSourceType() == 0) {
               if (!var4) {
                  if (var9.getDataSourceType() == 0 && var9.getAsCell() == null) {
                     continue;
                  }

                  this.n5.addItem(new t9z((ChartDataPoint)var1.getDataPoints().get_Item(var5), this));
               } else {
                  this.n5.addItem(new t9z((ChartDataPoint)var1.getDataPoints().get_Item(var5), this));
                  if (var6.x8().n5() == null
                     || com.aspose.slides.internal.v6g.k5.l6(var6.x8().n5(), Double.class)
                        && com.aspose.slides.ms.System.d2.k5(com.aspose.slides.internal.v6g.k5.u3(var6.x8().n5(), double.class))) {
                     this.n5.get_Item(this.n5.size() - 1).l6(true);
                  }

                  if (var6.u3().m1() && var6.s7().n5() == null) {
                     this.n5.get_Item(this.n5.size() - 1).l6(true);
                  }

                  if (var6.s7().n5() != null && "#N/A".equals(var6.s7().n5().toString())
                     || com.aspose.slides.internal.v6g.k5.l6(var6.s7().n5(), Double.class)
                        && com.aspose.slides.ms.System.d2.k5(com.aspose.slides.internal.v6g.k5.u3(var6.s7().n5(), double.class))) {
                     this.n5.get_Item(this.n5.size() - 1).l6(true);
                  }
               }
            } else {
               this.n5.addItem(new t9z((ChartDataPoint)var1.getDataPoints().get_Item(var5), this));
            }
         }

         if (var1.getType() == 74 || var1.getType() == 75) {
            this.n5.addItem(new t9z((ChartDataPoint)var1.getDataPoints().get_Item(var5), this));
         }
      }
   }

   public final int l6() {
      return this.k5.y4().indexOf(this);
   }

   public final void n5(double var1) {
      this.c8 = var1;
   }

   final boolean n5(int[] var1) {
      for (int var5 : var1) {
         if (this.l6.getType() == var5) {
            return true;
         }
      }

      return false;
   }

   public final String k5() {
      boolean var1 = ((ChartData)this.k5.n3().getChartData()).l6().k5() != 2;
      if (this.l6.getName().getDataSourceType() != 0 || !var1) {
         StringChartValue var2 = (StringChartValue)this.l6.getName();
         ChartCellCollection var3 = com.aspose.slides.internal.v6g.k5.n5(var2.getData(), ChartCellCollection.class);
         return com.aspose.slides.ms.System.d1.n5(this.l6.getName().toString()) && var3 != null && var3.getCount() == 0
            ? com.aspose.slides.ms.System.d1.n5(new String[]{"Series", com.aspose.slides.ms.System.a3.l6(this.l6() + 1)})
            : this.l6.getName().toString();
      } else if (!com.aspose.slides.ms.System.d1.n5(this.l6.x8())) {
         return this.l6.x8();
      } else {
         return com.aspose.slides.ms.System.d1.n5(this.l6.n3())
            ? com.aspose.slides.ms.System.d1.n5(new String[]{"Series", com.aspose.slides.ms.System.a3.l6(this.l6() + 1)})
            : "";
      }
   }

   public final boolean u3() {
      return true;
   }

   public final List<w3q> a6() {
      return this.u9;
   }

   public final ChartSeries u9() {
      return this.l6;
   }

   public final com.aspose.slides.internal.o9b.c8 h0() {
      int var1 = (int)this.l6.n5().n5();
      return this.k5.n3().a6()[var1];
   }

   public final List<t9z> c8() {
      return this.n5;
   }

   public final n1g t2() {
      return this.k5;
   }

   public final p3o s7() {
      return this.u3;
   }

   public final t9z x8() {
      return this.a6;
   }

   public final void n5(com.aspose.slides.internal.o9b.w1 var1, com.aspose.slides.internal.o9b.w1 var2) {
      w5k.n5(var1.u3(), var2.u3(), this.h0().o8(), (LineFormat)this.l6.getFormat().getLine(), this.t2());
   }

   public final void n5(com.aspose.slides.internal.o9b.y1 var1) {
      w5k.n5(
         com.aspose.slides.internal.o9b.c8.u3.o8(),
         com.aspose.slides.internal.o9b.c8.u3.o8(),
         this.k5,
         var1.y4(),
         (LineFormat)this.l6.getFormat().getLine(),
         (FillFormat)this.l6.getFormat().getFill(),
         this.l6.getFormat().getEffect(),
         1.0F
      );
      w5k.n5(com.aspose.slides.internal.o9b.c8.u3.o8(), this.k5, var1.y4(), (LineFormat)this.l6.getFormat().getLine(), this.l6.getFormat().getEffect());
   }

   public final void n5(com.aspose.slides.internal.x4g.s7 var1) {
      w5k.n5(com.aspose.slides.internal.o9b.c8.u3.o8(), com.aspose.slides.internal.o9b.c8.u3.o8(), this.t2(), var1, (Format)this.l6.getFormat());
   }

   private double n5(com.aspose.slides.internal.o9b.w1[] var1) {
      float var2 = var1[0].l6();
      float var3 = var1[0].k5();
      float var4 = var2;
      float var5 = var3;

      for (com.aspose.slides.internal.o9b.w1 var9 : var1) {
         if (var9.l6() < var2) {
            var2 = var9.l6();
         }

         if (var9.k5() < var3) {
            var3 = var9.k5();
         }

         if (var9.l6() > var4) {
            var4 = var9.l6();
         }

         if (var9.k5() > var5) {
            var5 = var9.k5();
         }
      }

      return com.aspose.slides.ms.System.q1.l6(var4 - var2, var5 - var3) - 2.0F;
   }

   public final void l6(com.aspose.slides.internal.x4g.s7 var1) {
      Format var2 = new Format(((Format)this.l6.getFormat()).getParent_Immediate());
      var2.n5(this.l6.getFormat());
      var2.getLine().setWidth(com.aspose.slides.ms.System.q1.k5(var2.getLine().getWidth(), this.n5(var1.a6())));
      w5k.n5(com.aspose.slides.internal.o9b.c8.u3.o8(), com.aspose.slides.internal.o9b.c8.u3.o8(), this.t2(), var1, var2);
   }

   public final void l6(com.aspose.slides.internal.o9b.y1 var1) {
      w5k.n5(com.aspose.slides.internal.o9b.c8.u3.o8(), this.u9().c8().o8(), this.t2(), var1.y4(), (Format)this.l6.getFormat());
   }

   public final void k5(com.aspose.slides.internal.x4g.s7 var1) {
      w5k.n5(com.aspose.slides.internal.o9b.c8.u3.o8(), this.u9().c8().o8(), this.t2(), var1, (Format)this.l6.getFormat());
   }

   final void u3(com.aspose.slides.internal.x4g.s7 var1) {
      Format var2 = new Format(((Format)this.l6.getFormat()).getParent_Immediate());
      var2.n5(this.l6.getFormat());
      var2.getLine().setWidth(com.aspose.slides.ms.System.q1.k5(var2.getLine().getWidth(), this.n5(var1.a6())));
      w5k.n5(com.aspose.slides.internal.o9b.c8.u3.o8(), this.u9().c8().o8(), this.t2(), var1, var2);
   }

   public final void l6(com.aspose.slides.internal.o9b.w1 var1, com.aspose.slides.internal.o9b.w1 var2) {
      com.aspose.slides.internal.o9b.c8 var3 = this.k5.n3().n5((byte)(this.k5.n3().getStyle() + 1 > 40 ? 1 : 0)).o8();
      w5k.n5(
         var1.u3(),
         var2.u3(),
         var3.o8(),
         (LineFormat)com.aspose.slides.internal.v6g.k5.n5(this.l6.getParentSeriesGroup(), ChartSeriesGroup.class).l6().getLine(),
         this.t2()
      );
   }

   public final void n5(com.aspose.slides.internal.o9b.c8 var1, com.aspose.slides.internal.x4g.s7 var2, LineFormat var3, float var4) {
      w5k.n5(var1.o8(), com.aspose.slides.internal.o9b.c8.u3.o8(), this.t2(), var2, var3, this.l6.getFormat().getEffect(), var4);
   }

   public final void k5(com.aspose.slides.internal.o9b.w1 var1, com.aspose.slides.internal.o9b.w1 var2) {
      com.aspose.slides.internal.o9b.c8 var3 = this.k5.n3().n5((byte)(this.k5.n3().getStyle() + 1 > 40 ? 1 : 0)).o8();
      w5k.n5(
         var1.u3(),
         var2.u3(),
         var3.o8(),
         (LineFormat)com.aspose.slides.internal.v6g.k5.n5(this.l6.getParentSeriesGroup(), ChartSeriesGroup.class).k5().getLine(),
         this.t2()
      );
   }

   public final void u3(com.aspose.slides.internal.o9b.w1 var1, com.aspose.slides.internal.o9b.w1 var2) {
      com.aspose.slides.internal.o9b.c8 var3 = this.k5.n3().n5((byte)(this.k5.n3().getStyle() + 1 > 40 ? 1 : 0)).o8();
      w5k.n5(
         var1.u3(),
         var2.u3(),
         var3.o8(),
         (LineFormat)com.aspose.slides.internal.v6g.k5.n5(this.l6.getParentSeriesGroup(), ChartSeriesGroup.class).getHiLowLinesFormat().getLine(),
         this.t2()
      );
   }

   public final void n5(com.aspose.slides.internal.o9b.y1 var1, boolean var2) {
      com.aspose.slides.internal.o9b.c8 var3 = com.aspose.slides.internal.o9b.c8.u3.o8();
      com.aspose.slides.internal.o9b.c8 var4 = com.aspose.slides.internal.o9b.c8.u3.o8();
      int var5 = this.k5.n3().getStyle() + 1;
      Format var6 = var2
         ? (Format)this.l6.getParentSeriesGroup().getUpDownBars().getUpBarsFormat()
         : (Format)this.l6.getParentSeriesGroup().getUpDownBars().getDownBarsFormat();
      if (var6.getLine().getFillFormat().getFillType() != 0) {
         if (var1.s7() > var6.getLine().getWidth() / 2.0) {
            var1.l6(var1.s7() - (float)var6.getLine().getWidth() / 2.0F);
         }

         if (var1.k5() < 1.0F) {
            var1.n5(1.0F);
         }

         if (var5 <= 16) {
            this.k5.n3().n5((byte)0).n5(var3);
         } else if (var5 <= 32) {
            com.aspose.slides.internal.o9b.c8.u3.n5(var3);
         } else if (var5 <= 34) {
            this.k5.n3().n5((byte)0).n5(var3);
         } else if (var5 <= 40) {
            int var7 = this.k5.n3().getStyle() - 30;
            com.aspose.slides.internal.o9b.c8 var8 = this.k5.n3().n5((byte)var7).o8();
            k3o.l6(var8.o8(), 0.25).n5(var8);
            com.aspose.slides.internal.o9b.c8.n5(255, var8.o8()).n5(var3);
         } else {
            com.aspose.slides.internal.o9b.c8.u3.n5(var3);
         }

         w5k.n5(var3.o8(), com.aspose.slides.internal.o9b.c8.u3.o8(), this.t2(), var1.y4(), var6);
      }

      this.l6(var2).n5(var4);
      w5k.n5(com.aspose.slides.internal.o9b.c8.u3.o8(), var4.o8(), this.t2(), var1.y4(), var6);
   }

   public final void n5(com.aspose.slides.internal.x4g.s7 var1, float var2) {
      j9e.n5(
         com.aspose.slides.internal.o9b.c8.u3.o8(),
         this.u9().c8().o8(),
         this.k5,
         var1,
         (LineFormat)this.l6.getFormat().getLine(),
         (FillFormat)this.l6.getFormat().getFill(),
         1.0F,
         var2
      );
   }

   public final void l6(com.aspose.slides.internal.x4g.s7 var1, float var2) {
      j9e.n5(
         com.aspose.slides.internal.o9b.c8.u3.o8(),
         com.aspose.slides.internal.o9b.c8.u3.o8(),
         this.k5,
         var1,
         (LineFormat)this.l6.getFormat().getLine(),
         (FillFormat)this.l6.getFormat().getFill(),
         1.0F,
         var2
      );
   }

   public final boolean a6(com.aspose.slides.internal.x4g.s7 var1) {
      if (var1 == null) {
         return false;
      }

      IThreeDFormat var2 = this.l6.getFormat().getEffect3D();
      FillFormat var3 = (FillFormat)this.l6.getFormat().getFill();
      LineFormat var4 = (LineFormat)this.l6.getFormat().getLine();
      return w5k.n5(var1, var1.s7().y4(), this.k5, var2, var3, var4, com.aspose.slides.internal.o9b.c8.u3.o8(), com.aspose.slides.internal.o9b.c8.u3.o8());
   }

   public final boolean l6(com.aspose.slides.internal.o9b.y1 var1, boolean var2) {
      int var3 = this.k5.n3().getStyle() + 1;
      Format var4 = var2
         ? (Format)this.l6.getParentSeriesGroup().getUpDownBars().getUpBarsFormat()
         : (Format)this.l6.getParentSeriesGroup().getUpDownBars().getDownBarsFormat();
      com.aspose.slides.internal.o9b.c8 var5 = com.aspose.slides.internal.o9b.c8.u3.o8();
      if (var4.getLine().getFillFormat().getFillType() != 0) {
         if (var1.s7() > var4.getLine().getWidth() / 2.0) {
            var1.l6(var1.s7() - (float)var4.getLine().getWidth() / 2.0F);
         }

         if (var1.k5() < 1.0F) {
            var1.n5(1.0F);
         }

         if (var3 <= 16) {
            this.k5.n3().n5((byte)0).n5(var5);
         } else if (var3 <= 32) {
            com.aspose.slides.internal.o9b.c8.u3.n5(var5);
         } else if (var3 <= 34) {
            this.k5.n3().n5((byte)0).n5(var5);
         } else if (var3 <= 40) {
            int var6 = this.k5.n3().getStyle() - 30;
            com.aspose.slides.internal.o9b.c8 var7 = this.k5.n3().n5((byte)var6).o8();
            k3o.l6(var7.o8(), 0.25).n5(var7);
            com.aspose.slides.internal.o9b.c8.n5(255, var7.o8()).n5(var5);
         } else {
            com.aspose.slides.internal.o9b.c8.u3.n5(var5);
         }
      }

      com.aspose.slides.internal.x4g.s7 var15 = new com.aspose.slides.internal.x4g.s7();

      try {
         var15.l6(var1.y4());
         com.aspose.slides.internal.o9b.c8 var16 = this.l6(var2).o8();
         IThreeDFormat var8 = var4.getEffect3D();
         FillFormat var9 = (FillFormat)var4.getFill();
         LineFormat var10 = (LineFormat)var4.getLine();
         return w5k.n5(var15, var1.y4(), this.k5, var8, var9, var10, var16.o8(), var5.o8());
      } finally {
         if (var15 != null) {
            var15.dispose();
         }
      }
   }

   private com.aspose.slides.internal.o9b.c8 l6(boolean var1) {
      com.aspose.slides.internal.o9b.c8 var2 = com.aspose.slides.internal.o9b.c8.u3.o8();
      int var3 = this.k5.n3().getStyle() + 1;
      com.aspose.slides.internal.o9b.c8 var4 = this.k5.n3().n5((byte)0).o8();
      if (var1) {
         if (var3 == 1) {
            k3o.n5(var4.o8(), 0.25).n5(var2);
            return com.aspose.slides.internal.o9b.c8.n5(255, var2.o8());
         }

         if (var3 == 2) {
            k3o.n5(var4.o8(), 0.05).n5(var2);
            return com.aspose.slides.internal.o9b.c8.n5(255, var2.o8());
         }

         if (var3 <= 8) {
            this.k5.n3().n5((byte)var3).n5(var2);
            k3o.n5(var2.o8(), 0.25).n5(var2);
            return com.aspose.slides.internal.o9b.c8.n5(255, var2.o8());
         }

         if (var3 == 9) {
            k3o.n5(var4.o8(), 0.25).n5(var2);
            return com.aspose.slides.internal.o9b.c8.n5(255, var2.o8());
         }

         if (var3 == 10) {
            k3o.n5(var4.o8(), 0.05).n5(var2);
            return com.aspose.slides.internal.o9b.c8.n5(255, var2.o8());
         }

         if (var3 <= 16) {
            int var8 = var3 - 7;
            this.k5.n3().n5((byte)var8).n5(var2);
            k3o.n5(var2.o8(), 0.25).n5(var2);
            return com.aspose.slides.internal.o9b.c8.n5(255, var2.o8());
         }

         if (var3 == 17) {
            k3o.n5(var4.o8(), 0.25).n5(var2);
            return com.aspose.slides.internal.o9b.c8.n5(255, var2.o8());
         }

         if (var3 == 18) {
            k3o.n5(var4.o8(), 0.05).n5(var2);
            return com.aspose.slides.internal.o9b.c8.n5(255, var2.o8());
         }

         if (var3 <= 24) {
            int var7 = var3 - 15;
            this.k5.n3().n5((byte)var7).n5(var2);
            k3o.n5(var2.o8(), 0.25).n5(var2);
            return com.aspose.slides.internal.o9b.c8.n5(255, var2.o8());
         }

         if (var3 == 25) {
            k3o.n5(var4.o8(), 0.25).n5(var2);
            return com.aspose.slides.internal.o9b.c8.n5(255, var2.o8());
         }

         if (var3 == 26) {
            k3o.n5(var4.o8(), 0.05).n5(var2);
            return com.aspose.slides.internal.o9b.c8.n5(255, var2.o8());
         }

         if (var3 <= 32) {
            int var6 = var3 - 23;
            this.k5.n3().n5((byte)var6).n5(var2);
            k3o.n5(var2.o8(), 0.25).n5(var2);
            return com.aspose.slides.internal.o9b.c8.n5(255, var2.o8());
         }

         if (var3 <= 40) {
            this.k5.n3().n5((byte)1).n5(var2);
            return com.aspose.slides.internal.o9b.c8.n5(255, var2.o8());
         }

         if (var3 == 41) {
            k3o.n5(var4.o8(), 0.25).n5(var2);
            return com.aspose.slides.internal.o9b.c8.n5(255, var2.o8());
         }

         if (var3 == 42) {
            this.k5.n3().n5((byte)1).n5(var2);
            return com.aspose.slides.internal.o9b.c8.n5(255, var2.o8());
         }

         if (var3 <= 48) {
            int var5 = var3 - 39;
            this.k5.n3().n5((byte)var5).n5(var2);
            k3o.n5(var2.o8(), 0.25).n5(var2);
            return com.aspose.slides.internal.o9b.c8.n5(255, var2.o8());
         }
      } else {
         if (var3 == 1) {
            k3o.n5(var4.o8(), 0.85).n5(var2);
            return com.aspose.slides.internal.o9b.c8.n5(255, var2.o8());
         }

         if (var3 == 2) {
            k3o.n5(var4.o8(), 0.95).n5(var2);
            return com.aspose.slides.internal.o9b.c8.n5(255, var2.o8());
         }

         if (var3 <= 8) {
            this.k5.n3().n5((byte)var3).n5(var2);
            k3o.l6(var2.o8(), 0.25).n5(var2);
            return com.aspose.slides.internal.o9b.c8.n5(255, var2.o8());
         }

         if (var3 == 9) {
            k3o.n5(var4.o8(), 0.85).n5(var2);
            return com.aspose.slides.internal.o9b.c8.n5(255, var2.o8());
         }

         if (var3 == 10) {
            k3o.n5(var4.o8(), 0.95).n5(var2);
            return com.aspose.slides.internal.o9b.c8.n5(255, var2.o8());
         }

         if (var3 <= 16) {
            int var13 = var3 - 7;
            this.k5.n3().n5((byte)var13).n5(var2);
            k3o.l6(var2.o8(), 0.25).n5(var2);
            return com.aspose.slides.internal.o9b.c8.n5(255, var2.o8());
         }

         if (var3 == 17) {
            k3o.n5(var4.o8(), 0.85).n5(var2);
            return com.aspose.slides.internal.o9b.c8.n5(255, var2.o8());
         }

         if (var3 == 18) {
            k3o.n5(var4.o8(), 0.95).n5(var2);
            return com.aspose.slides.internal.o9b.c8.n5(255, var2.o8());
         }

         if (var3 <= 24) {
            int var12 = var3 - 15;
            this.k5.n3().n5((byte)var12).n5(var2);
            k3o.l6(var2.o8(), 0.25).n5(var2);
            return com.aspose.slides.internal.o9b.c8.n5(255, var2.o8());
         }

         if (var3 == 25) {
            k3o.n5(var4.o8(), 0.85).n5(var2);
            return com.aspose.slides.internal.o9b.c8.n5(255, var2.o8());
         }

         if (var3 == 26) {
            k3o.n5(var4.o8(), 0.95).n5(var2);
            return com.aspose.slides.internal.o9b.c8.n5(255, var2.o8());
         }

         if (var3 <= 32) {
            int var11 = var3 - 23;
            this.k5.n3().n5((byte)var11).n5(var2);
            k3o.l6(var2.o8(), 0.25).n5(var2);
            return com.aspose.slides.internal.o9b.c8.n5(255, var2.o8());
         }

         if (var3 == 33) {
            k3o.n5(var4.o8(), 0.85).n5(var2);
            return com.aspose.slides.internal.o9b.c8.n5(255, var2.o8());
         }

         if (var3 == 34) {
            k3o.n5(var4.o8(), 0.95).n5(var2);
            return com.aspose.slides.internal.o9b.c8.n5(255, var2.o8());
         }

         if (var3 <= 40) {
            int var10 = var3 - 31;
            this.k5.n3().n5((byte)var10).n5(var2);
            k3o.l6(var2.o8(), 0.25).n5(var2);
            return com.aspose.slides.internal.o9b.c8.n5(255, var2.o8());
         }

         if (var3 == 41) {
            k3o.n5(var4.o8(), 0.85).n5(var2);
            return com.aspose.slides.internal.o9b.c8.n5(255, var2.o8());
         }

         if (var3 == 42) {
            var4.n5(var2);
            return com.aspose.slides.internal.o9b.c8.n5(255, var2.o8());
         }

         if (var3 <= 48) {
            int var9 = var3 - 39;
            this.k5.n3().n5((byte)var9).n5(var2);
            k3o.l6(var2.o8(), 0.25).n5(var2);
            return com.aspose.slides.internal.o9b.c8.n5(255, var2.o8());
         }
      }

      return com.aspose.slides.internal.o9b.c8.u3;
   }
}

package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.ms.System.IDisposable;

public class AxesManager extends DomObject<Chart> implements IAxesManager {
   private com.aspose.slides.internal.k4y.q2c n5;
   private Axis l6;
   private Axis k5;
   private Axis u3;
   private Axis a6;
   private Axis h0;
   private boolean c8;
   private boolean t2;
   private boolean s7;
   private boolean x8;
   private boolean n3;

   @Override
   public final IAxis getHorizontalAxis() {
      if (this.c8) {
         if (this.l6 == null) {
            this.l6 = new Axis(this);
            this.l6.setPosition(0);
         }

         return this.l6;
      } else {
         return null;
      }
   }

   @Override
   public final IAxis getSecondaryHorizontalAxis() {
      if (this.t2) {
         if (this.k5 == null) {
            this.a6();
         }

         return this.k5;
      } else {
         return null;
      }
   }

   @Override
   public final IAxis getVerticalAxis() {
      if (this.s7) {
         if (this.u3 == null) {
            this.u3 = new Axis(this);
            this.u3.setPosition(1);
         }

         return this.u3;
      } else {
         return null;
      }
   }

   @Override
   public final IAxis getSecondaryVerticalAxis() {
      if (this.x8) {
         if (this.a6 == null) {
            this.a6();
         }

         return this.a6;
      } else {
         return null;
      }
   }

   private void a6() {
      this.k5 = new Axis(this);
      this.k5.setPosition(3);
      this.a6 = new Axis(this);
      this.a6.setPosition(2);
      n5(this.a6, this.k5);
   }

   @Override
   public final IAxis getSeriesAxis() {
      if (this.n3) {
         if (this.h0 == null) {
            this.h0 = new Axis(this);
         }

         return this.h0;
      } else {
         return null;
      }
   }

   AxesManager(Chart parentImmediate) {
      super(parentImmediate);
   }

   final Chart n5() {
      return this.u9;
   }

   final void l6() {
      this.n5().x8();
      this.k5();
   }

   final void k5() {
      IChartSeriesCollection var1 = this.n5().getChartData().getSeries();
      if (var1.size() != 1 && var1.size() != 0) {
         if (var1.size() > 1) {
            List var10 = new List();
            List var3 = new List();
            IGenericEnumerator var4 = var1.iterator();

            try {
               while (var4.hasNext()) {
                  ChartSeries var5 = (ChartSeries)var4.next();
                  int var6 = ChartTypeCharacterizer.n5(var5.getType());
                  if (!var5.getPlotOnSecondAxis() && !var10.containsItem(var6)) {
                     var10.addItem(var6);
                  }

                  if (var5.getPlotOnSecondAxis() && !var3.containsItem(var6)) {
                     var3.addItem(var6);
                  }
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
                  var4.dispose();
               }
            }

            if (var10.size() != 0) {
               com.aspose.slides.ms.System.o5 var11 = this.n5(var10).k5();
               if (com.aspose.slides.ms.System.o5.n5(var11, null)) {
                  throw new ArgumentException("Unsupported primary axis composition");
               }

               switch (((Integer)var11.n5()).intValue()) {
                  case 0:
                     this.n5(false, false, false, false, false);
                     break;
                  case 1:
                     this.n5(false, false, true, false, false);
                     break;
                  case 2:
                  case 3:
                  case 4:
                  case 5:
                  case 7:
                     this.n5(true, false, true, false, this.u3() != null);
                     break;
                  case 6:
                     this.n5(true, false, true, false, true);
                     break;
                  default:
                     throw new Exception();
               }
            }

            if (var3.size() != 0) {
               com.aspose.slides.ms.System.o5 var12 = this.n5(var3).k5();
               if (com.aspose.slides.ms.System.o5.n5(var12, null)) {
                  throw new ArgumentException("Unsupported secondary axis composition");
               }

               switch (((Integer)var12.n5()).intValue()) {
                  case 0:
                     break;
                  case 1:
                  case 7:
                  default:
                     throw new Exception();
                  case 2:
                  case 3:
                  case 4:
                  case 5:
                     this.l6(false, true, false, true, false);
                     break;
                  case 6:
                     throw new Exception();
                  case 8:
                     this.l6(true, false, false, true, false);
               }
            }
         }
      } else {
         int var2 = ChartTypeCharacterizer.n5(this.n5().getType());
         switch (var2) {
            case 0:
               this.n5(false, false, false, false, false);
               break;
            case 1:
               this.n5(false, false, true, false, false);
               break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 7:
               this.n5(true, false, true, false, this.u3() != null);
               n5(this.getHorizontalAxis(), this.getVerticalAxis());
               break;
            case 6:
               this.n5(true, false, true, false, true);
               n5(this.getHorizontalAxis(), this.getVerticalAxis());
               break;
            case 8:
               this.n5(true, false, false, true, false);
               break;
            default:
               throw new Exception();
         }
      }
   }

   private com.aspose.slides.ms.System.o5<Integer> n5(List<Integer> var1) {
      if (var1.size() == 0) {
         throw new Exception();
      }

      while (var1.size() > 1) {
         if (!this.l6(var1)) {
            return new com.aspose.slides.ms.System.o5<>();
         }
      }

      return new com.aspose.slides.ms.System.o5<>((Integer)var1.get_Item(0));
   }

   private boolean l6(List<Integer> var1) {
      if (var1.size() != 0 && var1.size() != 1) {
         int var2 = var1.size();
         int var3 = (Integer)var1.get_Item(var2 - 2);
         int var4 = (Integer)var1.get_Item(var2 - 1);
         if (var3 != var4 && var4 != 0) {
            if ((var3 != 2 || var4 != 5) && (var4 != 2 || var3 != 5)) {
               if ((var3 != 4 || var4 != 5) && (var4 != 4 || var3 != 5)) {
                  if (var3 != 0) {
                     return false;
                  }

                  var3 = var4;
                  var1.set_Item(var2 - 2, var3);
                  var1.removeAt(var2 - 1);
               } else {
                  byte var6 = 4;
                  var1.set_Item(var2 - 2, Integer.valueOf(var6));
                  var1.removeAt(var2 - 1);
               }
            } else {
               byte var5 = 2;
               var1.set_Item(var2 - 2, Integer.valueOf(var5));
               var1.removeAt(var2 - 1);
            }
         } else {
            var1.removeAt(var2 - 1);
         }

         return true;
      } else {
         throw new ArgumentException();
      }
   }

   private void n5(boolean var1, boolean var2, boolean var3, boolean var4, boolean var5) {
      this.c8 = var1;
      this.t2 = var2;
      this.s7 = var3;
      this.x8 = var4;
      this.n3 = var5;
   }

   private void l6(boolean var1, boolean var2, boolean var3, boolean var4, boolean var5) {
      if (var1) {
         this.c8 = true;
      }

      if (var2) {
         this.t2 = true;
      }

      if (var3) {
         this.s7 = true;
      }

      if (var4) {
         this.x8 = true;
      }

      if (var5) {
         this.n3 = true;
      }
   }

   final boolean n5(int var1, boolean var2) {
      IChartSeriesCollection var3 = this.n5().getChartData().getSeries();
      if (var3.size() == 0) {
         return true;
      }

      List var4 = new List();
      List var5 = new List();
      IGenericEnumerator var6 = var3.iterator();

      try {
         while (var6.hasNext()) {
            ChartSeries var7 = (ChartSeries)var6.next();
            int var8 = ChartTypeCharacterizer.n5(var7.getType());
            if (!var7.getPlotOnSecondAxis() && !var4.containsItem(var8)) {
               var4.addItem(var8);
            }

            if (var7.getPlotOnSecondAxis() && !var5.containsItem(var8)) {
               var5.addItem(var8);
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var6, IDisposable.class)) {
            var6.dispose();
         }
      }

      if (!var2) {
         var4.addItem(ChartTypeCharacterizer.n5(var1));
      } else {
         var5.addItem(ChartTypeCharacterizer.n5(var1));
      }

      if (!var2) {
         if (var4.size() != 0) {
            com.aspose.slides.ms.System.o5 var13 = this.n5(var4).k5();
            return com.aspose.slides.ms.System.o5.l6(var13, null);
         } else {
            return true;
         }
      } else if (var5.size() != 0) {
         com.aspose.slides.ms.System.o5 var12 = this.n5(var5).k5();
         return com.aspose.slides.ms.System.o5.l6(var12, null);
      } else {
         return true;
      }
   }

   final com.aspose.slides.internal.k4y.q2c u3() {
      return this.n5;
   }

   final void n5(com.aspose.slides.internal.k4y.q2c var1) {
      this.n5 = var1;
   }

   private static void n5(IAxis var0, IAxis var1) {
      if (var0 != null && var1 != null) {
         n7 var2 = ((Axis)var0).n5();
         n7 var3 = ((Axis)var1).n5();
         var2.u3(var3.c8());
         var3.u3(var2.c8());
      }
   }
}

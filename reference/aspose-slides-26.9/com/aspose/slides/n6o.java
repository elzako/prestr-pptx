package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.InvalidDataException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.ms.System.IDisposable;

class n6o implements y0s {
   private int n5;
   private com.aspose.slides.internal.z0k.e2 l6;
   private int k5;
   private ChartDataWorkbook u3;
   private final Chart a6;
   private String u9;

   n6o(Chart var1) {
      this.a6 = var1;
      this.l6(0);
   }

   @Override
   public final IChartDataWorkbook l6() {
      this.n5();
      return this.u3;
   }

   @Override
   public final String u9() {
      if (this.a6 != null && this.a6.l6() != null) {
         return this.h0() == 1 ? this.a6.l6().n3() : null;
      } else {
         return null;
      }
   }

   public final String t2() {
      return this.u9;
   }

   public final void n5(String var1) {
      this.u9 = var1;
   }

   @Override
   public final int k5() {
      return this.n5;
   }

   private void l6(int var1) {
      this.n5 = var1;
   }

   @Override
   public final void n5(com.aspose.slides.internal.z0k.t4 var1) {
      if (var1 != null) {
         if (this.k5() == 2) {
            com.aspose.slides.ms.System.o0 var2 = com.aspose.slides.ms.System.o0.l6().k5();

            try {
               r6e.n5(var2.k5());
               this.u3 = new ChartDataWorkbook(this.a6.getChartData(), var1, com.aspose.slides.internal.q7.l6.n5, InterruptionToken.getNone());
               this.u3.k5(this.t2());
               r6e.n5(var2.k5(), var1);
            } catch (RuntimeException var4) {
               r6e.l6(var2.k5());
               throw var4;
            }
         } else {
            this.l6 = new com.aspose.slides.internal.z0k.e2();
            this.n5(var1, this.l6);
            this.n5();
         }
      }
   }

   @Override
   public final void n5(String var1, boolean var2) {
      this.a6.l6().l6(var1);
      this.l6(0);
      this.a6.l6().n5((byte)1);
      if (var2) {
         this.l6 = this.l6(this.u9());
         t4d.n5(this.a6, this.c8());
         this.l6(2);
         t9p.n5(this.a6.getChartData());
      }
   }

   @Override
   public final com.aspose.slides.internal.z0k.t4 a6() {
      com.aspose.slides.internal.z0k.e2 var1 = new com.aspose.slides.internal.z0k.e2();
      if (this.k5() == 2) {
         this.u3.n5(var1);
      } else if (this.h0() == 1) {
         com.aspose.slides.internal.z0k.e2 var2 = this.l6(this.u9());
         if (var2 == null) {
            throw new NotImplementedException("External workbook is not available or can't be loaded.");
         }

         this.n5(var2, var1);
      } else {
         this.n5(this.l6, var1);
      }

      var1.setPosition(0L);
      return var1;
   }

   @Override
   public final int u3() {
      return this.k5() == 2 ? ((ChartDataWorkbook)this.l6()).k5() : this.k5;
   }

   @Override
   public final void n5(int var1) {
      com.aspose.slides.internal.f8y.n5.n5(this.k5() != 2);
      this.k5 = var1;
   }

   @Override
   public final int h0() {
      if (this.a6 != null && this.a6.l6() != null) {
         return this.a6.l6().x8() == 1 ? 1 : 0;
      } else {
         return 0;
      }
   }

   @Override
   public final boolean n5(com.aspose.slides.internal.z0k.t4 var1, List<String> var2, com.aspose.slides.internal.q7.l6 var3, InterruptionToken var4) {
      try {
         boolean var5 = false;
         if (var1 != null) {
            this.u3 = new ChartDataWorkbook(this.a6.getChartData(), var1, var3, var4);
            this.u3.k5(this.t2());
            var5 = true;
            List$Enumerator var6 = var2.iterator();

            try {
               while (var6.hasNext()) {
                  String var7 = (String)var6.next();
                  if (!this.u3.a6(var7)) {
                     var5 = false;
                     break;
                  }
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var6, IDisposable.class)) {
                  var6.dispose();
               }
            }
         }

         if ((var5 || this.u3.k5() >= 4) && var1 != null) {
            return true;
         }

         this.u3 = new ChartDataWorkbook(this.a6.getChartData());
         this.u3.k5(this.t2());
         return false;
      } catch (RuntimeException var12) {
         com.aspose.slides.internal.n8e.v4.n5(var12);
         this.u3 = new ChartDataWorkbook(this.a6.getChartData());
         this.u3.k5(this.t2());
         return false;
      }
   }

   @Override
   public final void n5(IChartDataCell var1) {
      if (this.h0() == 0) {
         ChartDataCell var2 = com.aspose.slides.internal.v6g.k5.n5(var1, ChartDataCell.class);
         if (var1 != null && var2.k5() != this.l6()) {
            throw new InvalidOperationException("Wrong workbook has been used. Chart uses another workbook as a data source.");
         }
      }
   }

   @Override
   public final com.aspose.slides.internal.z0k.e2 c8() {
      return this.l6;
   }

   @Override
   public final void n5(com.aspose.slides.internal.z0k.e2 var1) {
      this.l6 = var1;
   }

   @Override
   public final void n5() {
      switch (this.h0()) {
         case 0:
            if (this.k5() == 0 && this.c8() != null) {
               this.l6(1);
               t4d.n5(this.a6, this.c8());
               if (this.u3 != null && this.u3.k5() == 4) {
                  this.l6(0);
                  throw new InvalidOperationException("Binary macro-enabled workbook (*.xlsb) format is not supported.");
               }

               this.l6 = null;
               t9p.n5(this.a6.getChartData());
               this.l6(2);
               com.aspose.slides.internal.f8y.n5.u3("CHART: Embedded workbook has been loaded");
            } else if (this.u3 == null) {
               this.l6(1);
               this.u3 = new ChartDataWorkbook(this.a6.getChartData());
               this.u3.k5(this.t2());
               this.l6(2);
               com.aspose.slides.internal.f8y.n5.u3("CHART: Workbook has been created");
            }
            break;
         case 1:
            if (this.k5() == 0) {
               Presentation var1 = (Presentation)this.a6.getPresentation();
               this.l6(1);
               this.l6 = this.l6(this.u9());
               if (this.l6 == null) {
                  if (!var1.a6().getSpreadsheetOptions().getRecoverWorkbookFromChartCache()) {
                     this.l6(0);
                     throw new InvalidOperationException("Chart uses external workbook. External workbook is not available or can't be loaded.");
                  }

                  this.u3 = new ChartDataWorkbook(this.a6.getChartData());
                  this.u3.k5(this.t2());
                  t4d.n5(this.u3, this.a6.getChartData());
                  t9p.n5(this.a6.getChartData());
                  this.a6.l6().n5((byte)0);
                  this.l6(2);
                  com.aspose.slides.internal.f8y.n5.u3("CHART: External workbook has been recovered and loaded");
               }

               t4d.n5(this.a6, this.c8());
               if (this.u3 != null && this.u3.k5() == 4) {
                  this.l6(0);
                  throw new InvalidOperationException("Binary macro-enabled workbook (*.xlsb) format is not supported.");
               }

               t9p.n5(this.a6.getChartData());
               this.l6 = null;
               this.l6(2);
               com.aspose.slides.internal.f8y.n5.u3("CHART: External workbook has been loaded");
            }
      }
   }

   private com.aspose.slides.internal.z0k.e2 l6(String var1) {
      LoadOptions var2 = com.aspose.slides.internal.v6g.k5.n5(this.a6.getPresentation(), Presentation.class).a6();
      boolean var3 = var2.getSpreadsheetOptions().getRecoverWorkbookFromChartCache();
      var1 = w8d.n5(var1);
      if (com.aspose.slides.ms.System.d1.n5(var1)) {
         if (var3) {
            return null;
         } else {
            throw new InvalidDataException("External workbook path is empty");
         }
      } else {
         int var4 = 0;
         p3w var5 = new p3w(var1);
         if (var2.getResourceLoadingCallback() != null) {
            var4 = var2.getResourceLoadingCallback().resourceLoading(var5);
         }

         switch (var4) {
            case 0:
               if (com.aspose.slides.ms.System.d1.l6(var1, "file:///")) {
                  String var26 = com.aspose.slides.ms.System.d1.n5(var1, "file:///", com.aspose.slides.ms.System.d1.n5);
                  com.aspose.slides.internal.z0k.t2 var28 = new com.aspose.slides.internal.z0k.t2(var26);
                  if (!var28.n5() && this.k5() == 1) {
                     String var29 = com.aspose.slides.internal.z0k.z1.n5(com.aspose.slides.ms.System.d1.n5(var1, "\\", "/"));
                     if (!com.aspose.slides.ms.System.d1.n5(var29)) {
                        String var31 = com.aspose.slides.internal.v6g.k5.n5(this.a6.getPresentation(), Presentation.class).l6;
                        if (!com.aspose.slides.ms.System.d1.n5(var31)) {
                           var26 = com.aspose.slides.internal.z0k.z1.l6(com.aspose.slides.internal.z0k.z1.u9(var31), var29);
                           var28 = new com.aspose.slides.internal.z0k.t2(var26);
                           if (var28.n5()) {
                              var1 = w8d.n5(var26);
                           }
                        }
                     }
                  }

                  if (var28.n5()) {
                     if (!com.aspose.slides.ms.System.d1.k5(com.aspose.slides.ms.System.d1.u9(var1), ".xlsx")
                        && !com.aspose.slides.ms.System.d1.k5(com.aspose.slides.ms.System.d1.u9(var1), ".xls")) {
                        throw new NotImplementedException("Workbook format is not supported");
                     }

                     byte[] var30 = com.aspose.slides.internal.z0k.u9.h0(var28.u9());
                     if (!com.aspose.slides.ms.System.d1.a6(this.a6.l6().n3(), var1)) {
                        this.a6.l6().l6(var1);
                     }

                     return new com.aspose.slides.internal.z0k.e2(var30);
                  } else {
                     if (var3) {
                        return null;
                     }

                     throw new InvalidOperationException("External workbook is not available.");
                  }
               } else {
                  if (com.aspose.slides.ms.System.d1.u3(var1, ':') > 1) {
                     try {
                        com.aspose.slides.internal.g8v.b5 var6 = com.aspose.slides.internal.g8v.b5.l6(var1);
                        com.aspose.slides.internal.g8v.u8 var7 = var6.z8();

                        try {
                           com.aspose.slides.internal.z0k.t4 var8 = var7.u9();

                           try {
                              byte[] var9 = com.aspose.slides.internal.q7.n5.n5(var8);
                              return new com.aspose.slides.internal.z0k.e2(var9);
                           } finally {
                              if (var8 != null) {
                                 var8.dispose();
                              }
                           }
                        } finally {
                           if (var7 != null) {
                              var7.dispose();
                           }
                        }
                     } catch (RuntimeException var23) {
                        if (var3) {
                           return null;
                        }

                        throw new InvalidOperationException("Error occurred during loading workbook: " + var23);
                     }
                  }

                  return null;
               }
            case 1:
               return null;
            case 2:
               try {
                  if (var5.n5() != null && var5.n5().length > 0) {
                     if (!com.aspose.slides.ms.System.d1.a6(this.a6.l6().n3(), var1)) {
                        this.a6.l6().l6(var1);
                     }

                     return new com.aspose.slides.internal.z0k.e2(var5.n5());
                  }

                  return null;
               } catch (RuntimeException var24) {
                  if (var3) {
                     return null;
                  }

                  throw new InvalidOperationException("Chart uses external workbook. External workbook is not available or can't be loaded.");
               }
            default:
               if (var3) {
                  return null;
               } else {
                  throw new NotImplementedException("External workbook is not available or can't be loaded.");
               }
         }
      }
   }

   private void n5(com.aspose.slides.internal.z0k.t4 var1, com.aspose.slides.internal.z0k.t4 var2) {
      var1.setPosition(0L);
      byte[] var3 = new byte[4096];

      int var4;
      while ((var4 = var1.read(var3, 0, var3.length)) > 0) {
         var2.write(var3, 0, var4);
      }

      var2.setPosition(0L);
   }
}

package com.aspose.slides.internal.k4y;

import com.aspose.slides.IDataLabel;
import com.aspose.slides.IDataLabelFormat;
import com.aspose.slides.ILayoutable;
import com.aspose.slides.Collections.Generic.List;

public class c4z {
   private c8q n5;
   private b9y l6;
   private b9y k5;
   private v2o u3;
   private e4j a6;
   private c8q u9;
   private List<z6y> h0;
   private z6y c8;
   private static final com.aspose.slides.internal.v6g.u9 t2 = new com.aspose.slides.internal.v6g.u9(
      "showLeaderLines", "spPr", "leaderLines", "layout", "dlblFieldTable", "showDataLabelsRange"
   );

   public c4z(x8 var1) {
      this.n5(new List<>());
      if (var1 != null) {
         this.c8 = this.n5(var1);
         this.n5(this.h0(), var1);
         if (this.c8 != null) {
            try {
               for (Object recoveredElement$var3$809 : this.c8.l6().getDocumentElement()) {
                  com.aspose.slides.ms.System.Xml.l0 var3 = (com.aspose.slides.ms.System.Xml.l0)recoveredElement$var3$809;
                  switch (t2.n5(var3.getLocalName())) {
                     case 0:
                        com.aspose.slides.internal.z0k.w1 var191 = new com.aspose.slides.internal.z0k.w1(var3.getOuterXml());

                        try {
                           com.aspose.slides.ms.System.Xml.p5 var196 = new com.aspose.slides.ms.System.Xml.p5(var191);

                           try {
                              var196.k5(true);

                              while (!var196.j5() && var196.s7() != 1) {
                                 var196.u9();
                              }

                              if (!var196.j5()) {
                                 this.n5(new c8q(var196));
                              }
                              break;
                           } finally {
                              if (var196 != null) {
                                 var196.dispose();
                              }
                           }
                        } finally {
                           if (var191 != null) {
                              var191.dispose();
                           }
                        }
                     case 1:
                        com.aspose.slides.internal.z0k.w1 var190 = new com.aspose.slides.internal.z0k.w1(var3.getOuterXml());

                        try {
                           com.aspose.slides.ms.System.Xml.p5 var195 = new com.aspose.slides.ms.System.Xml.p5(var190);

                           try {
                              var195.k5(true);

                              while (!var195.j5() && var195.s7() != 1) {
                                 var195.u9();
                              }

                              if (!var195.j5()) {
                                 this.l6(new b9y(var195));
                              }
                              break;
                           } finally {
                              if (var195 != null) {
                                 var195.dispose();
                              }
                           }
                        } finally {
                           if (var190 != null) {
                              var190.dispose();
                           }
                        }
                     case 2:
                        com.aspose.slides.internal.z0k.w1 var189 = new com.aspose.slides.internal.z0k.w1(var3.getOuterXml());

                        try {
                           com.aspose.slides.ms.System.Xml.p5 var194 = new com.aspose.slides.ms.System.Xml.p5(var189);

                           try {
                              var194.k5(true);

                              while (!var194.j5() && var194.s7() != 1) {
                                 var194.u9();
                              }

                              if (!var194.j5()) {
                                 this.n5(new n9p(var194).l6());
                              }
                              break;
                           } finally {
                              if (var194 != null) {
                                 var194.dispose();
                              }
                           }
                        } finally {
                           if (var189 != null) {
                              var189.dispose();
                           }
                        }
                     case 3:
                        com.aspose.slides.internal.z0k.w1 var188 = new com.aspose.slides.internal.z0k.w1(var3.getOuterXml());

                        try {
                           com.aspose.slides.ms.System.Xml.p5 var193 = new com.aspose.slides.ms.System.Xml.p5(var188);

                           try {
                              var193.k5(true);

                              while (!var193.j5() && var193.s7() != 1) {
                                 var193.u9();
                              }

                              if (!var193.j5()) {
                                 this.n5(new v2o(var193));
                              }
                              break;
                           } finally {
                              if (var193 != null) {
                                 var193.dispose();
                              }
                           }
                        } finally {
                           if (var188 != null) {
                              var188.dispose();
                           }
                        }
                     case 4:
                        com.aspose.slides.internal.z0k.w1 var187 = new com.aspose.slides.internal.z0k.w1(var3.getOuterXml());

                        try {
                           com.aspose.slides.ms.System.Xml.p5 var192 = new com.aspose.slides.ms.System.Xml.p5(var187);

                           try {
                              var192.k5(true);

                              while (!var192.j5() && var192.s7() != 1) {
                                 var192.u9();
                              }

                              if (!var192.j5()) {
                                 this.n5(new e4j(var192));
                              }
                              break;
                           } finally {
                              if (var192 != null) {
                                 var192.dispose();
                              }
                           }
                        } finally {
                           if (var187 != null) {
                              var187.dispose();
                           }
                        }
                     case 5:
                        com.aspose.slides.internal.z0k.w1 var4 = new com.aspose.slides.internal.z0k.w1(var3.getOuterXml());

                        try {
                           com.aspose.slides.ms.System.Xml.p5 var5 = new com.aspose.slides.ms.System.Xml.p5(var4);

                           try {
                              var5.k5(true);

                              while (!var5.j5() && var5.s7() != 1) {
                                 var5.u9();
                              }

                              if (!var5.j5()) {
                                 this.l6(new c8q(var5));
                              }
                           } finally {
                              if (var5 != null) {
                                 var5.dispose();
                              }
                           }
                        } finally {
                           if (var4 != null) {
                              var4.dispose();
                           }
                        }
                  }
               }
            } catch (RuntimeException var186) {
               com.aspose.slides.internal.n8e.v4.n5(var186);
            }
         }
      }
   }

   private void n5(List<z6y> var1, x8 var2) {
      if (var2 != null) {
         for (d3 var6 : var2.n5()) {
            com.aspose.slides.ms.System.Xml.u8 var7 = var6.l6().getDocumentElement().getAttributes().n5("uri");
            if (var7 == null || !"{CE6537A1-D6FC-4f65-9D91-7224C49458BB}".equals(var7.getValue())) {
               var1.addItem((z6y)var6);
            }
         }
      }
   }

   public final c8q n5() {
      return this.n5;
   }

   public final void n5(c8q var1) {
      this.n5 = var1;
   }

   public final b9y l6() {
      return this.l6;
   }

   public final void n5(b9y var1) {
      this.l6 = var1;
   }

   public final b9y k5() {
      return this.k5;
   }

   public final void l6(b9y var1) {
      this.k5 = var1;
   }

   public final v2o u3() {
      return this.u3;
   }

   public final void n5(v2o var1) {
      this.u3 = var1;
   }

   public final e4j a6() {
      return this.a6;
   }

   public final void n5(e4j var1) {
      this.a6 = var1;
   }

   public final c8q u9() {
      return this.u9;
   }

   public final void l6(c8q var1) {
      this.u9 = var1;
   }

   public final List<z6y> h0() {
      return this.h0;
   }

   public final void n5(List<z6y> var1) {
      this.h0 = var1;
   }

   public final void n5(IDataLabelFormat var1, b9y var2, boolean var3, z6y[] var4, x8 var5) {
      if (var2 != null || var1.getShowLabelAsDataCallout() || var3 || var1.getShowLabelValueFromCell() || var4.length != 0) {
         z6y var6 = this.n5(var5, "{CE6537A1-D6FC-4f65-9D91-7224C49458BB}");
         if (var2 != null || var1.getShowLabelValueFromCell() || var3) {
            try {
               com.aspose.slides.internal.z0k.e2 var7 = new com.aspose.slides.internal.z0k.e2();

               try {
                  com.aspose.slides.internal.n8e.u4 var8 = new com.aspose.slides.internal.n8e.u4(var7, com.aspose.slides.internal.l7h.j5.z3());

                  try {
                     var8.n5("c", "ext", "http://schemas.openxmlformats.org/drawingml/2006/chart");
                     var8.l6("uri", "{CE6537A1-D6FC-4f65-9D91-7224C49458BB}");
                     if (var8.n5("http://schemas.microsoft.com/office/drawing/2012/chart") == null) {
                        var8.u3("xmlns", "c15", null, "http://schemas.microsoft.com/office/drawing/2012/chart");
                     }

                     if (var8.n5("http://schemas.openxmlformats.org/drawingml/2006/main") == null) {
                        var8.u3("xmlns", "a", null, "http://schemas.openxmlformats.org/drawingml/2006/main");
                     }

                     if (var2 != null) {
                        var2.n5("c15", var8, "spPr");
                     }

                     if (var3) {
                        this.n5((com.aspose.slides.ms.System.Xml.l1)var8);
                     }

                     if (this.l6() != null) {
                        this.n5(var8);
                     }

                     if (var1.getShowLabelValueFromCell()) {
                        this.l6(var8);
                     }

                     var8.s7();
                     var8.u9();
                     var7.setPosition(0L);
                     var6.l6().load(var7);
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
            } catch (RuntimeException var20) {
               com.aspose.slides.internal.n8e.v4.n5(var20);
            }
         }

         if (var4.length != 0) {
            for (z6y var10 : var4) {
               d3 var11 = var5.l6();
               var11.n5(var10.n5());
            }
         }
      }
   }

   public final void n5(IDataLabel var1, b9y var2, boolean var3, e4j var4, z6y[] var5, x8 var6) {
      if (var2 != null || var1.getDataLabelFormat().getShowLabelValueFromCell() || var3 || var4 != null || var5.length != 0) {
         z6y var7 = this.n5(var6, "{CE6537A1-D6FC-4f65-9D91-7224C49458BB}");
         if (var1.getDataLabelFormat().getShowLabelValueFromCell() || var2 != null || var3 || var4 != null) {
            try {
               com.aspose.slides.internal.z0k.e2 var8 = new com.aspose.slides.internal.z0k.e2();

               try {
                  com.aspose.slides.internal.n8e.u4 var9 = new com.aspose.slides.internal.n8e.u4(var8, com.aspose.slides.internal.l7h.j5.z3());

                  try {
                     var9.n5("c", "ext", "http://schemas.openxmlformats.org/drawingml/2006/chart");
                     if (var9.n5("http://schemas.microsoft.com/office/drawing/2012/chart") == null) {
                        var9.u3("xmlns", "c15", null, "http://schemas.microsoft.com/office/drawing/2012/chart");
                     }

                     var9.l6("uri", "{CE6537A1-D6FC-4f65-9D91-7224C49458BB}");
                     if (var2 != null) {
                        var2.n5("c15", var9, "spPr");
                     }

                     if (var3) {
                        this.n5(var9, var1);
                     }

                     if (var4 != null) {
                        this.n5(var9, var4);
                     }

                     if (var1.getDataLabelFormat().getShowLabelValueFromCell()) {
                        this.l6(var9);
                     }

                     var9.s7();
                     var9.u9();
                     var8.setPosition(0L);
                     var7.l6().load(var8);
                  } finally {
                     if (var9 != null) {
                        var9.dispose();
                     }
                  }
               } finally {
                  if (var8 != null) {
                     var8.dispose();
                  }
               }
            } catch (RuntimeException var21) {
               com.aspose.slides.internal.n8e.v4.n5(var21);
            }
         }

         if (var5.length != 0) {
            for (z6y var11 : var5) {
               d3 var12 = var6.l6();
               var12.n5(var11.n5());
            }
         }
      }
   }

   private void n5(com.aspose.slides.ms.System.Xml.l1 var1) {
      var1.n5("c15", "showLeaderLines", "http://schemas.microsoft.com/office/drawing/2012/chart");
      var1.u3("val", "1");
      var1.s7();
   }

   private void n5(com.aspose.slides.internal.n8e.u4 var1) {
      var1.n5("c15", "leaderLines", "http://schemas.microsoft.com/office/drawing/2012/chart");
      this.l6().n5("c", var1, "spPr");
      var1.s7();
   }

   private void l6(com.aspose.slides.ms.System.Xml.l1 var1) {
      var1.n5("c15", "showDataLabelsRange", "http://schemas.microsoft.com/office/drawing/2012/chart");
      var1.u3("val", "1");
      var1.s7();
   }

   private void n5(com.aspose.slides.internal.n8e.u4 var1, e4j var2) {
      var1.n5("c15", "dlblFieldTable", "http://schemas.microsoft.com/office/drawing/2012/chart");

      for (n9a var6 : var2.n5()) {
         var1.n5("c15", "dlblFTEntry", "http://schemas.microsoft.com/office/drawing/2012/chart");
         var1.n5("c15", "txfldGUID", "http://schemas.microsoft.com/office/drawing/2012/chart");
         var1.l6(var6.n5());
         var1.s7();
         var1.n5("c15", "f", "http://schemas.microsoft.com/office/drawing/2012/chart");
         var1.l6(var6.l6());
         var1.s7();
         if (var6.k5() != null) {
            var6.k5().n5("c15", var1, "dlblFieldTableCache");
         }

         var1.s7();
      }

      var1.s7();
   }

   private void n5(com.aspose.slides.ms.System.Xml.l1 var1, ILayoutable var2) {
      var1.n5("c15", "layout", "http://schemas.microsoft.com/office/drawing/2012/chart");
      var1.n5("c", "manualLayout", "http://schemas.openxmlformats.org/drawingml/2006/chart");
      var1.n5("c", "w", "http://schemas.openxmlformats.org/drawingml/2006/chart");
      var1.u3("val", com.aspose.slides.ms.System.n1.n5(var2.getWidth(), com.aspose.slides.internal.x7n.l6.k5()));
      var1.s7();
      var1.n5("c", "h", "http://schemas.openxmlformats.org/drawingml/2006/chart");
      var1.u3("val", com.aspose.slides.ms.System.n1.n5(var2.getHeight(), com.aspose.slides.internal.x7n.l6.k5()));
      var1.s7();
      var1.s7();
      var1.s7();
   }

   public final z6y n5(x8 var1, String var2) {
      z6y var3 = this.n5(var1);
      if (var3 == null) {
         var3 = (z6y)var1.l6();
         var3.n5(
            com.aspose.slides.ms.System.d1.n5(
               "<c:ext xmlns:c =\"{0}\" uri=\"{1}\" xmlns:c15=\"{2}\" xmlns:a=\"{3}\"></c:ext>",new Object[]{
               "http://schemas.openxmlformats.org/drawingml/2006/chart",
               var2,
               "http://schemas.microsoft.com/office/drawing/2012/chart",
               "http://schemas.openxmlformats.org/drawingml/2006/main"
            })
         );
      }

      return var3;
   }

   private z6y n5(x8 var1) {
      if (var1 == null) {
         return null;
      }

      for (d3 var5 : var1.n5()) {
         com.aspose.slides.ms.System.Xml.u8 var6 = var5.l6().getDocumentElement().getAttributes().n5("uri");
         if (var6 != null && "{CE6537A1-D6FC-4f65-9D91-7224C49458BB}".equals(var6.getValue())) {
            return (z6y)var5;
         }
      }

      return null;
   }

   public final boolean n5(z6y var1) {
      return var1 == null || var1.l6().getDocumentElement().getChildNodes().n5() == 0;
   }

   public final z6y c8() {
      return this.c8;
   }
}

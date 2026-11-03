package com.aspose.slides.internal.k4y;

public class x1f {
   private static final com.aspose.slides.internal.v6g.u9 n5 = new com.aspose.slides.internal.v6g.u9(
      "noFill", "solidFill", "gradFill", "blipFill", "pattFill", "grpFill"
   );

   public static w8d n5(x8 var0) {
      return k5(var0, "http://schemas.microsoft.com/office/drawing/2008/diagram");
   }

   public static void n5(x8 var0, String var1) {
      w8d var2 = l6(var0, "http://schemas.microsoft.com/office/drawing/2008/diagram");
      com.aspose.slides.ms.System.Xml.m8 var3 = var2.l6().createElement("dsp", "dataModelExt", "http://schemas.microsoft.com/office/drawing/2008/diagram");
      var3.k5("relId", var1);
      var3.k5("minVer", "http://schemas.openxmlformats.org/drawingml/2006/main");
      var2.l6().getDocumentElement().appendChild(var3);
   }

   public static c4t l6(x8 var0) {
      w8d var1 = k5(var0, "{E40237B7-FDA0-4F09-8148-C483321AD2D9}");

      try {
         if (var1 != null) {
            com.aspose.slides.internal.z0k.w1 var2 = new com.aspose.slides.internal.z0k.w1(var1.l6().getDocumentElement().getOuterXml());

            try {
               com.aspose.slides.ms.System.Xml.p5 var3 = new com.aspose.slides.ms.System.Xml.p5(var2);

               try {
                  var3.u9();

                  while (!var3.j5()) {
                     var3.u9();
                     if (var3.s7() == 1) {
                        return new c4t(var3);
                     }
                  }
               } finally {
                  if (var3 != null) {
                     var3.dispose();
                  }
               }
            } finally {
               if (var2 != null) {
                  var2.dispose();
               }
            }
         }
      } catch (RuntimeException var15) {
         com.aspose.slides.internal.n8e.v4.n5(var15);
      }

      return null;
   }

   public static void n5(x8 var0, c4t var1) {
      w8d var2 = l6(var0, "{E40237B7-FDA0-4F09-8148-C483321AD2D9}");

      try {
         com.aspose.slides.internal.z0k.e2 var3 = new com.aspose.slides.internal.z0k.e2();

         try {
            com.aspose.slides.ms.System.Xml.k3 var4 = new com.aspose.slides.ms.System.Xml.k3(var3, com.aspose.slides.internal.l7h.j5.z3());

            try {
               var4.n5("a", "ext", "http://schemas.openxmlformats.org/drawingml/2006/main");
               var4.u3("uri", "{E40237B7-FDA0-4F09-8148-C483321AD2D9}");
               n5(var4, var1);
               var4.s7();
               var4.u9();
               var3.setPosition(0L);
               var2.l6().load(var3);
            } finally {
               if (var4 != null) {
                  var4.dispose();
               }
            }
         } finally {
            if (var3 != null) {
               var3.dispose();
            }
         }
      } catch (RuntimeException var15) {
         com.aspose.slides.internal.n8e.v4.n5(var15);
      }
   }

   private static void n5(com.aspose.slides.ms.System.Xml.l1 var0, c4t var1) {
      var0.n5("dgm14", "cNvPr", "http://schemas.microsoft.com/office/drawing/2010/diagram");
      var0.u3("id", com.aspose.slides.ms.System.Xml.f4.l6(var1.k5()));
      var0.u3("name", var1.u3());
      if (!"".equals(var1.a6())) {
         var0.u3("descr", var1.a6());
      }

      if (var1.u9() != null) {
         var0.u3("title", var1.u9());
      }

      if (var1.h0()) {
         var0.u3("hidden", var1.h0() ? "1" : "0");
      }

      if (var1.c8() != null) {
         n5(var0, "hlinkClick", var1.c8());
      }

      if (var1.t2() != null) {
         n5(var0, "hlinkHover", var1.t2());
      }

      var0.s7();
   }

   private static void n5(com.aspose.slides.ms.System.Xml.l1 var0, String var1, x6s var2) {
      var0.n5("a", var1, null);
      var0.l6("xmlns", "r", null, "http://schemas.openxmlformats.org/officeDocument/2006/relationships");
      if (var2.l6() != null) {
         var0.l6("r", "id", null, var2.l6());
      }

      if (!"".equals(var2.k5())) {
         var0.u3("invalidUrl", var2.k5());
      }

      if (!"".equals(var2.u3())) {
         var0.u3("action", var2.u3());
      }

      if (!"".equals(var2.a6())) {
         var0.u3("tgtFrame", var2.a6());
      }

      if (!"".equals(var2.u9())) {
         var0.u3("tooltip", var2.u9());
      }

      if (!var2.h0()) {
         var0.u3("history", var2.h0() ? "1" : "0");
      }

      if (var2.c8()) {
         var0.u3("highlightClick", var2.c8() ? "1" : "0");
      }

      if (var2.t2()) {
         var0.u3("endSnd", var2.t2() ? "1" : "0");
      }

      if (var2.s7() != null) {
         var0.n5("a", "snd", null);
         var0.a6("r", "embed", var2.s7().n5());
         if (!"".equals(var2.s7().l6())) {
            var0.u3("name", var2.s7().l6());
         }

         if (var2.s7().k5()) {
            var0.u3("builtIn", var2.s7().k5() ? "1" : "0");
         }

         var0.s7();
      }

      var0.s7();
   }

   public static g7 k5(x8 var0) {
      w8d var1 = k5(var0, "{909E8E84-426E-40DD-AFC4-6F175D3DCCD1}");
      if (var1 != null) {
         try {
            com.aspose.slides.internal.z0k.w1 var2 = new com.aspose.slides.internal.z0k.w1(var1.l6().getDocumentElement().getOuterXml());

            try {
               com.aspose.slides.ms.System.Xml.p5 var3 = new com.aspose.slides.ms.System.Xml.p5(var2);

               try {
                  var3.u9();

                  while (!var3.j5()) {
                     var3.u9();
                     switch (n5.n5(var3.n3())) {
                        case 0:
                           return new g7("noFill", new u4k(var3));
                        case 1:
                           return new g7("solidFill", new e2l(var3));
                        case 2:
                           return new g7("gradFill", new j2p(var3));
                        case 3:
                           return new g7("blipFill", new e3(var3));
                        case 4:
                           return new g7("pattFill", new n9q(var3));
                        case 5:
                           return new g7("grpFill", new r6i(var3));
                     }
                  }
               } finally {
                  if (var3 != null) {
                     var3.dispose();
                  }
               }
            } finally {
               if (var2 != null) {
                  var2.dispose();
               }
            }
         } catch (RuntimeException var15) {
            com.aspose.slides.internal.n8e.v4.n5(var15);
         }
      }

      return null;
   }

   public static g7 u3(x8 var0) {
      w8d var1 = k5(var0, "{AF507438-7753-43E0-B8FC-AC1667EBCBE1}");
      if (var1 != null) {
         try {
            com.aspose.slides.internal.z0k.w1 var2 = new com.aspose.slides.internal.z0k.w1(var1.l6().getDocumentElement().getOuterXml());

            try {
               com.aspose.slides.ms.System.Xml.p5 var3 = new com.aspose.slides.ms.System.Xml.p5(var2);

               try {
                  var3.u9();

                  while (!var3.j5()) {
                     var3.u9();
                     if ("effectLst".equals(var3.n3())) {
                        return new g7("effectLst", new o9b(var3));
                     }
                  }
               } finally {
                  if (var3 != null) {
                     var3.dispose();
                  }
               }
            } finally {
               if (var2 != null) {
                  var2.dispose();
               }
            }
         } catch (RuntimeException var15) {
            com.aspose.slides.internal.n8e.v4.n5(var15);
         }
      }

      return null;
   }

   public static w8d l6(x8 var0, String var1) {
      w8d var2 = k5(var0, var1);
      if (var2 == null) {
         var2 = (w8d)var0.l6();
         var2.n5(
            com.aspose.slides.ms.System.d1.n5("<a:ext uri=\"{0}\" xmlns:a=\"{1}\"></a:ext>",new Object[]{ var1, "http://schemas.openxmlformats.org/drawingml/2006/main"})
         );
      }

      return var2;
   }

   private static w8d k5(x8 var0, String var1) {
      if (var0 == null) {
         return null;
      }

      for (d3 var5 : var0.n5()) {
         com.aspose.slides.ms.System.Xml.u8 var6 = var5.l6().getDocumentElement().getAttributes().n5("uri");
         if (var6 != null && com.aspose.slides.ms.System.d1.a6(var6.getValue(), var1)) {
            return (w8d)var5;
         }
      }

      return null;
   }
}

package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.FormatException;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.Xml.XmlDocument;

class j9j {
   public static OleObjectFrame n5(ShapeCollection var0, com.aspose.slides.internal.k4y.b4f var1, com.aspose.slides.internal.k4y.j1a var2, z5q var3) {
      if (var0 == null) {
         throw new ArgumentNullException("shapes");
      }

      if (var2 == null) {
         throw new ArgumentNullException("oleObjectElement");
      }

      com.aspose.slides.internal.o9b.y1 var4 = t2f.n5(var1.c8(), var1.t2(), var1.s7(), var1.x8()).y4();
      OleObjectFrame var5 = null;
      if (t2f.k5(var2.u3())) {
         var5 = var0.a6();
         var5.setFrame(new ShapeFrame(var4.x8(), var4.n3(), var4.s7(), var4.k5(), (byte)0, (byte)0, 0.0F));
         var5.l6(false);
         com.aspose.slides.ms.System.o0 var6 = com.aspose.slides.ms.System.o0.n5.k5();
         if (var2.n5() != null) {
            var6 = new com.aspose.slides.ms.System.o0(var2.n5());
            var5.setObjectProgId(n5(var6.k5()));
         }

         try {
            byte[] var7 = com.aspose.slides.ms.System.z3.s7(var2.u3());
            n5(var7, var5, var3);
         } catch (FormatException var8) {
            var3.n5(com.aspose.slides.ms.System.d1.n5("Embedded OLE-object binary data is not valid.", new Object[]{}), 1);
         }
      } else if (t2f.k5(var2.l6())) {
         var5 = var0.a6();
         var5.setFrame(new ShapeFrame(var4.x8(), var4.n3(), var4.s7(), var4.k5(), (byte)0, (byte)0, 0.0F));
         com.aspose.slides.ms.System.o0 var10 = com.aspose.slides.ms.System.o0.n5.k5();
         if (var2.n5() != null) {
            var10 = new com.aspose.slides.ms.System.o0(var2.n5());
            var5.setObjectProgId(n5(var10.k5()));
         }

         if (!com.aspose.slides.ms.System.d1.l6(var2.l6(), "./Object") && !com.aspose.slides.ms.System.d1.l6(var2.l6(), "Object")) {
            r6z.n5(var2.l6(), var5);
            var5.l6(true);
         } else {
            n5(var2.l6(), var5, var3);
            var5.l6(false);
         }

         if (var2.k5() == 0) {
            var5.u9 = false;
         }
      }

      if (var5 != null) {
         com.aspose.slides.internal.k4y.s3o var12 = t2f.n5(com.aspose.slides.internal.k4y.s3o.class, "image", var1.e2());
         if (var12 != null) {
            n5(var5, var12, var3);
         }
      }

      return var5;
   }

   public static OleObjectFrame n5(ShapeCollection var0, com.aspose.slides.internal.k4y.b4f var1, com.aspose.slides.internal.k4y.n6k var2, z5q var3) {
      if (var0 == null) {
         throw new ArgumentNullException("shapes");
      }

      if (var2 == null) {
         throw new ArgumentNullException("objectElement");
      }

      com.aspose.slides.internal.o9b.y1 var4 = t2f.n5(var1.c8(), var1.t2(), var1.s7(), var1.x8()).y4();
      if (t2f.k5(var2.n5())) {
         if (var2.l6() == 1 && com.aspose.slides.ms.System.d1.t2(var2.n5(), "Object")) {
            com.aspose.slides.ms.System.o0 var12 = new com.aspose.slides.ms.System.o0();
            com.aspose.slides.ms.System.o0[] var6 = new com.aspose.slides.ms.System.o0[]{var12};
            byte[] var7 = n5(com.aspose.slides.ms.System.d1.n5(var2.n5(), "./", ""), var0, var3, var6);
            var6[0].k5(var12);
            if (var7 != null) {
               OleObjectFrame var8;
               if (com.aspose.slides.ms.System.o0.l6(var12, com.aspose.slides.ms.System.o0.n5)) {
                  var8 = var0.a6();
                  var8.setFrame(new ShapeFrame(var4.x8(), var4.n3(), var4.s7(), var4.k5(), (byte)0, (byte)0, 0.0F));
                  var8.setObjectProgId(n5(var12.k5()));
                  var8.n5(e6f.n5(var7, var8.getObjectProgId(), var12.k5()));
                  e5i var9 = null;
                  e5i[] var10 = new e5i[]{var9};
                  boolean var11 = e6f.n5().tryGetValue(var8.getObjectProgId(), var10);
                  var9 = var10[0];
                  if (var11) {
                     var8.n5(var9.a6());
                     var8.z1().n5(var9.n5());
                  }
               } else {
                  OleEmbeddedDataInfo var14 = new OleEmbeddedDataInfo(var7, "package");
                  var8 = (OleObjectFrame)var0.addOleObjectFrame(var4.x8(), var4.n3(), var4.s7(), var4.k5(), var14);
               }

               var8.z1().n5(var7);
               var8.l6(false);
               com.aspose.slides.internal.k4y.s3o var15 = t2f.n5(com.aspose.slides.internal.k4y.s3o.class, "image", var1.e2());
               if (var15 != null) {
                  n5(var8, var15, var3);
               }

               return var8;
            }
         } else {
            OleObjectFrame var5 = var0.a6();
            var5.setFrame(new ShapeFrame(var4.x8(), var4.n3(), var4.s7(), var4.k5(), (byte)0, (byte)0, 0.0F));
            r6z.n5(var2.n5(), var5);
            var5.l6(true);
         }
      }

      return null;
   }

   private static void n5(String var0, OleObjectFrame var1, z5q var2) {
      String var3 = com.aspose.slides.ms.System.d1.n5(var0, "./", "");
      var3 = com.aspose.slides.ms.System.d1.n5(new String[]{"/", var3});
      byte[] var4 = null;

      try {
         List$Enumerator var5 = var2.u9().iterator();

         try {
            while (var5.hasNext()) {
               com.aspose.slides.internal.c8m.z5 var6 = (com.aspose.slides.internal.c8m.z5)var5.next();
               if (com.aspose.slides.ms.System.d1.a6(var6.l6(), var3)) {
                  var4 = var6.a6();
                  var1.l6(com.aspose.slides.ms.System.d1.n5(new String[]{"/ppt/embeddings", "/oleObject", com.aspose.slides.ms.System.d1.n5(var3, "/Object ", ""), ".bin"}));
                  break;
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var5, IDisposable.class)) {
               var5.dispose();
            }
         }

         if (var4 == null) {
            var2.n5(com.aspose.slides.ms.System.d1.n5("Embedded OLE-object data not found: {0}", new Object[]{var3}), 1);
            return;
         }
      } catch (com.aspose.slides.internal.e5a.f2 var11) {
         var2.n5(com.aspose.slides.ms.System.d1.n5("Embedded OLE-object is corrupted: {0}", new Object[]{var3}), 1);
         var1.x8().n5(true);
         return;
      }

      n5(var4, var1, var2);
   }

   private static void n5(byte[] var0, OleObjectFrame var1, z5q var2) {
      var1.n5(var0);
      if (var0 != null && var0.length != 0) {
         com.aspose.slides.internal.z0k.e2 var3 = new com.aspose.slides.internal.z0k.e2(var0);

         try {
            boolean var4 = r6z.n5(var3, var1, var2);
            if (!var4) {
               String var5 = com.aspose.slides.ms.System.d1.a6(var1.getObjectProgId());
               e5i var6 = null;
               e5i[] var7 = new e5i[]{var6};
               boolean var8 = e6f.n5().tryGetValue(var5, var7);
               var6 = var7[0];
               if (var8) {
                  var1.n5(var6.a6());
                  var1.z1().n5(var6.n5());
               }
            } else if (var2.n5().a6().getDeleteEmbeddedBinaryObjects()) {
               var1.n5(new byte[0]);
            }
         } finally {
            if (var3 != null) {
               var3.dispose();
            }
         }
      }
   }

   private static byte[] n5(String var0, ShapeCollection var1, z5q var2, com.aspose.slides.ms.System.o0[] var3) {
      byte[] var4 = null;
      boolean var5 = false;
      com.aspose.slides.ms.System.o0.n5.k5(var3[0]);
      com.aspose.slides.internal.c8m.s9 var6 = new com.aspose.slides.internal.c8m.s9();
      List var7 = new List();
      List$Enumerator var8 = var2.u9().iterator();

      try {
         while (var8.hasNext()) {
            com.aspose.slides.internal.c8m.z5 var9 = (com.aspose.slides.internal.c8m.z5)var8.next();
            if (com.aspose.slides.ms.System.d1.l6(var9.k5(), var0)) {
               if (com.aspose.slides.ms.System.d1.k5(var9.l6(), "content.xml")) {
                  var5 = n5(var9, var3);
               }

               if (!var5) {
                  return null;
               }

               String var10 = com.aspose.slides.ms.System.d1.n5(var9.l6(), com.aspose.slides.ms.System.d1.c8(var9.l6(), var0), var0.length());
               var6.n5(var10, var9.y4(), var9.a6());
               com.aspose.slides.internal.k4y.p4e var11 = new com.aspose.slides.internal.k4y.p4e();
               var11.n5(var10);
               var11.l6(var9.y4());
               var7.addItem(var11);
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var8, IDisposable.class)) {
            var8.dispose();
         }
      }

      com.aspose.slides.internal.c8m.z5 var29 = var6.n5("/META-INF/manifest.xml", "text/xml");
      Object var30 = null;
      z6l var31 = new z6l(var29, (OdpSerializationContext)var30, var7);
      var31.n5((Presentation)var1.getParentGroup().getPresentation(), false);
      com.aspose.slides.internal.e5a.d2 var12 = new com.aspose.slides.internal.e5a.d2();

      try {
         var6.n5(var12);
         com.aspose.slides.internal.z0k.e2 var13 = new com.aspose.slides.internal.z0k.e2();

         try {
            var12.l6(var13);
            var13.setPosition(0L);
            var4 = var13.toArray();
         } finally {
            if (var13 != null) {
               var13.dispose();
            }
         }
      } finally {
         if (var12 != null) {
            var12.dispose();
         }
      }

      return (byte[])var4;
   }

   private static boolean n5(com.aspose.slides.internal.c8m.z5 var0, com.aspose.slides.ms.System.o0[] var1) {
      try {
         com.aspose.slides.internal.z0k.t4 var2 = var0.c8();

         try {
            XmlDocument var3 = new XmlDocument();
            var3.setXmlResolver(null);
            var3.load(var2);
            if (var3.getElementsByTagName("office:text").n5() > 0) {
               var1[0] = new com.aspose.slides.ms.System.o0("1B261B22-AC6A-4E68-A870-AB5080E8687B");
            } else if (var3.getElementsByTagName("office:spreadsheet").n5() > 0) {
               var1[0] = new com.aspose.slides.ms.System.o0("EABCECDB-CC1C-4A6F-B4E3-7F888A5ADFC8");
            } else if (var3.getElementsByTagName("office:presentation").n5() > 0) {
               var1[0] = new com.aspose.slides.ms.System.o0("C282417B-2662-44B8-8A94-3BFF61C50900");
            } else {
               com.aspose.slides.ms.System.o0.n5.k5(var1[0]);
            }

            return var3.getDocumentElement().hasChildNodes();
         } finally {
            if (var2 != null) {
               var2.dispose();
            }
         }
      } catch (RuntimeException var9) {
         com.aspose.slides.internal.n8e.v4.n5(var9);
         com.aspose.slides.ms.System.o0.n5.k5(var1[0]);
         return false;
      }
   }

   private static void n5(OleObjectFrame var0, com.aspose.slides.internal.k4y.s3o var1, z5q var2) {
      IPPImage var3 = null;
      if (t2f.k5(var1.l6())) {
         try {
            byte[] var4 = com.aspose.slides.ms.System.z3.s7(var1.l6());
            if (var4 != null && var4.length > 0) {
               var3 = var2.n5().getImages().addImage(var4);
            }
         } catch (RuntimeException var7) {
            com.aspose.slides.internal.n8e.v4.n5(var7);
         }
      }

      if (var3 == null && t2f.k5(var1.n5())) {
         var3 = var2.n5(com.aspose.slides.ms.System.d1.n5(var1.n5(), "./", "/"));
      }

      if (var3 != null) {
         var0.getSubstitutePictureFormat().getPicture().setImage(var3);
         PPImage var8 = (PPImage)var3;
         if (var0.isObjectIcon() && var8 != null && var8.s7()) {
            String var5 = "";
            if ("image/x-wmf".equals(var8.getContentType())) {
               String[] var6 = new String[]{var5};
               com.aspose.slides.internal.n8e.k7.n5(var8.getBinaryData(), var6);
               var5 = var6[0];
            } else if ("image/x-emf".equals(var8.getContentType())) {
               String[] var9 = new String[]{var5};
               com.aspose.slides.internal.n8e.k7.l6(var8.getBinaryData(), var9);
               var5 = var9[0];
            }

            var0.a6 = var5;
            var0.u3 = var8.u9();
         }
      }
   }

   private static String n5(com.aspose.slides.ms.System.o0 var0) {
      if (com.aspose.slides.ms.System.o0.n5(com.aspose.slides.ms.System.o0.n5, var0)) {
         return com.aspose.slides.ms.System.d1.n5;
      }

      String var1 = "package";
      if (com.aspose.slides.ms.System.o0.n5(var0, new com.aspose.slides.ms.System.o0("D3E34B21-9D75-101A-8c3d-00aa001a1652"))) {
         var1 = "paint.picture";
      } else if (com.aspose.slides.ms.System.o0.n5(var0, new com.aspose.slides.ms.System.o0("00020820-0000-0000-C000-000000000046"))) {
         var1 = "excel.sheet.8";
      } else if (com.aspose.slides.ms.System.o0.n5(var0, new com.aspose.slides.ms.System.o0("00020821-0000-0000-C000-000000000046"))) {
         var1 = "excel.chart.8";
      } else if (com.aspose.slides.ms.System.o0.n5(var0, new com.aspose.slides.ms.System.o0("00020830-0000-0000-C000-000000000046"))) {
         var1 = "excel.sheet.12";
      } else if (com.aspose.slides.ms.System.o0.n5(var0, new com.aspose.slides.ms.System.o0("00020832-0000-0000-C000-000000000046"))) {
         var1 = "excel.sheetmacroenabled.12";
      } else if (com.aspose.slides.ms.System.o0.n5(var0, new com.aspose.slides.ms.System.o0("00020833-0000-0000-C000-000000000046"))) {
         var1 = "excel.sheetbinarymacroenabled.12";
      } else if (com.aspose.slides.ms.System.o0.n5(var0, new com.aspose.slides.ms.System.o0("00020906-0000-0000-C000-000000000046"))) {
         var1 = "word.document.8";
      } else if (com.aspose.slides.ms.System.o0.n5(var0, new com.aspose.slides.ms.System.o0("F4754C9B-64F5-4B40-8AF4-679732AC0607"))) {
         var1 = "word.document.12";
      } else if (com.aspose.slides.ms.System.o0.n5(var0, new com.aspose.slides.ms.System.o0("CF4F55F4-8F87-4D47-80BB-5808164BB3F8"))) {
         var1 = "powerpoint.show.12";
      } else if (com.aspose.slides.ms.System.o0.n5(var0, new com.aspose.slides.ms.System.o0("64818D10-4F9B-11CF-86EA-00AA00B929E8"))) {
         var1 = "powerpoint.show.8";
      } else if (com.aspose.slides.ms.System.o0.n5(var0, new com.aspose.slides.ms.System.o0("048EB43E-2059-422F-95E0-557DA96038AF"))) {
         var1 = "powerpoint.slide.12";
      } else if (com.aspose.slides.ms.System.o0.n5(var0, new com.aspose.slides.ms.System.o0("1B261B22-AC6A-4E68-A870-AB5080E8687B"))) {
         var1 = "word.opendocumenttext.12";
      } else if (com.aspose.slides.ms.System.o0.n5(var0, new com.aspose.slides.ms.System.o0("EABCECDB-CC1C-4A6F-B4E3-7F888A5ADFC8"))) {
         var1 = "excel.opendocumentspreadsheet.12";
      } else if (com.aspose.slides.ms.System.o0.n5(var0, new com.aspose.slides.ms.System.o0("C282417B-2662-44B8-8A94-3BFF61C50900"))) {
         var1 = "powerpoint.opendocumentpresentation.12";
      } else if (com.aspose.slides.ms.System.o0.n5(var0, new com.aspose.slides.ms.System.o0("11943940-36DE-11CF-953E-00C0A84029E9"))) {
         var1 = "msphotoed.3";
      }

      return var1;
   }
}

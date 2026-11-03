package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentException;

class r6z {
   private static final com.aspose.slides.internal.v6g.u9 n5 = new com.aspose.slides.internal.v6g.u9(
      "package",
      "acroexch.document.dc",
      "prism10.document",
      "word.document.12",
      "powerpoint.show.12",
      "excel.sheetbinarymacroenabled.12",
      "excel.sheet.12",
      "wordpad.document.1",
      "paint.picture",
      "msgraph.chart.8",
      "powerpoint.slide.8",
      "excel.sheet.8",
      "powerpoint.show.8",
      "word.document.8",
      "opendocument.mathdocument.1"
   );

   public static void n5(OleObjectFrame var0, com.aspose.slides.internal.k4y.s1k var1, i1x var2) {
      if (var1 != null) {
         l5u.n5(var0, var1, var2);
         com.aspose.slides.internal.k4y.u3 var3 = var1.k5().n5().z1();
         com.aspose.slides.internal.k4y.r0j var4;
         if (com.aspose.slides.internal.n8e.f0.n5.n5("urn:schemas-microsoft-com:vml") && var3.u3() != null) {
            var4 = var3.u3();
         } else {
            var4 = var3.k5();
         }

         String var5 = var4.l6();
         if (var5 != null && !"".equals(var5)) {
            var2.n5(var5, var0);
         }

         var0.setObjectIcon(var4.u3());
         if ("link".equals(var4.t2().n5())) {
            var0.l6(true);
         } else {
            var0.l6(false);
            var0.u9 = false;
         }

         var0.n5(new com.aspose.slides.internal.o9b.f2((float)var4.u9(), (float)var4.h0()));
         var0.setObjectName(var4.k5());
         String var6 = var4.a6();
         var0.setObjectProgId(var4.c8());
         if (!"*".equals(var6) && !com.aspose.slides.ms.System.d1.n5(var6)) {
            com.aspose.slides.internal.c8m.r7 var7 = var2.n5().k7().n5(var6);
            if (com.aspose.slides.ms.System.d1.a6("NULL", var7.n5())) {
               var0.x8().n5(true);
            } else if (var7.h0() == 1) {
               n5(var7.n5(), var0);
            } else {
               n5(var7, var0, var2);
            }

            if (var4.s7() != null && var4.s7().l6() != null) {
               com.aspose.slides.internal.k4y.n7n var8 = var4.s7().l6();
               com.aspose.slides.internal.k4y.e3 var9 = var8.l6();
               k8n.n5((PictureFillFormat)var0.getSubstitutePictureFormat(), var9, var2.n5());
               com.aspose.slides.internal.k4y.b9y var10 = var8.k5();
               x9f.n5(var0.getFillFormat(), var10.c8(), var2.n5());
               if (var10.t2() != null) {
                  i3z.n5(var0.getLineFormat(), var10.t2());
               }

               w5i.n5(new r6z$1(var0), var10.s7(), var2.n5());
               PPImage var11 = (PPImage)var0.getSubstitutePictureFormat().getPicture().getImage();
               if (var0.isObjectIcon() && var11 != null && var11.s7()) {
                  String var12 = "";
                  if ("image/x-wmf".equals(var11.getContentType())) {
                     String[] var13 = new String[]{var12};
                     com.aspose.slides.internal.n8e.k7.n5(var11.getBinaryData(), var13);
                     var12 = var13[0];
                  } else if ("image/x-emf".equals(var11.getContentType())) {
                     String[] var15 = new String[]{var12};
                     com.aspose.slides.internal.n8e.k7.l6(var11.getBinaryData(), var15);
                     var12 = var15[0];
                  }

                  var0.a6 = var12;
                  var0.u3 = var11.u9();
               }
            }
         }

         if ("link".equals(var4.t2().n5())) {
            com.aspose.slides.internal.k4y.e7k var14 = (com.aspose.slides.internal.k4y.e7k)var4.t2().l6();
            var0.u9 = var14.n5();
         }
      }
   }

   public static void n5(OleObjectFrame var0, com.aspose.slides.internal.k4y.s1k var1, n4i var2) {
      b4g var3 = var0.x8();
      g6c var4 = var2.n5();
      l5u.n5(var0, var1, var4);
      com.aspose.slides.internal.k4y.u3 var5 = var1.k5().n5().a6();
      com.aspose.slides.internal.k4y.r0j var6 = var5.l6();
      com.aspose.slides.internal.k4y.r0j var7 = var5.n5();
      com.aspose.slides.internal.c8m.r7 var8 = null;
      if (var0.isObjectLink()) {
         var8 = var4.u6().n5(com.aspose.slides.internal.c8m.f4.n5.n5(), com.aspose.slides.internal.n8e.v4.n5(var0.getLinkPathLong()), (byte)1);
      } else if (var0.e2() != null) {
         com.aspose.slides.internal.c8m.j8 var9 = n5(var0, var4);
         var9.n5((byte[])var0.e2().clone());
         var8 = var4.u6().n5(var9.y4().l6().n5(), var9.l6(), (byte)0);
      } else if (var0.x8().l6()) {
         var8 = var4.u6().n5(com.aspose.slides.internal.c8m.a1.n5.n5(), "NULL");
      }

      IPictureFillFormat var14 = var0.getSubstitutePictureFormat();
      PPImage var10 = (PPImage)var14.getPicture().getImage();
      if (var0.isObjectIcon() && var10 != null) {
         var14 = var0.z8();
      }

      String var11 = com.aspose.slides.ms.System.d1.n5("_x0000_s{0:D4}", new Object[]{var2.n5(var0)});
      n5(var0, var6, var8);
      var6.l6(var11);
      n5(var0, var7, var8);
      com.aspose.slides.internal.k4y.n7n var12 = var7.n5().n5();
      var12.n5().n5().n5("OLE substitute image");
      z6a.n5(var0, var12.k5(), var4);
      com.aspose.slides.internal.k4y.r7n var13 = (com.aspose.slides.internal.k4y.r7n)var12.k5().k5("prstGeom").l6();
      var13.n5(5);
      var13.n5();
      k8n.n5((PictureFillFormat)var14, var12.l6(), var4);
   }

   static String n5(IOleObjectFrame var0) {
      String var1 = com.aspose.slides.ms.System.d1.u9(var0.getObjectProgId());
      e5i var2 = null;
      e5i[] var3 = new e5i[]{var2};
      boolean var4 = !e6f.n5().tryGetValue(var1, var3);
      var2 = var3[0];
      return var4 ? ".bin" : var2.n5();
   }

   private static com.aspose.slides.internal.c8m.i4 k5(IOleObjectFrame var0) {
      String var1 = com.aspose.slides.ms.System.d1.u9(var0.getObjectProgId());
      e5i var2 = null;
      e5i[] var3 = new e5i[]{var2};
      boolean var4 = !e6f.n5().tryGetValue(var1, var3);
      var2 = var3[0];
      return var4 ? new com.aspose.slides.internal.c8m.y9() : var2.l6();
   }

   static boolean l6(IOleObjectFrame var0) {
      String var1 = com.aspose.slides.ms.System.d1.u9(var0.getObjectProgId());
      e5i var2 = null;
      e5i[] var3 = new e5i[]{var2};
      boolean var4 = !e6f.n5().tryGetValue(var1, var3);
      var2 = var3[0];
      return var4 ? false : "1".equals(var2.k5());
   }

   private static com.aspose.slides.internal.c8m.j8 n5(OleObjectFrame var0, g6c var1) {
      if (!com.aspose.slides.ms.System.d1.n5(var0.getEmbeddedFileName()) && com.aspose.slides.ms.System.d1.l6(var0.getEmbeddedFileName(), "/ppt/embeddings")) {
         int var2 = com.aspose.slides.internal.n8e.v4.n5(var1.a6().t2(), new r6z$2(var0));
         if (var2 == -1) {
            if (com.aspose.slides.ms.System.d1.t2(var0.getEmbeddedFileName(), "oleObject")) {
               String var8 = com.aspose.slides.ms.System.d1.n5(
                  com.aspose.slides.ms.System.d1.l6(var0.getEmbeddedFileName(), 0, com.aspose.slides.ms.System.d1.u3(var0.getEmbeddedFileName(), '.')),
                  com.aspose.slides.ms.System.d1.n5(new String[]{"/ppt/embeddings", "/oleObject"}),
                  ""
               );
               int var10 = 0;
               int[] var5 = new int[]{0};
               boolean var6 = com.aspose.slides.ms.System.a3.n5(var8, var5) && var1.z3() < var5[0];
               var10 = var5[0];
               if (var6) {
                  var1.l6(var10);
               }
            } else {
               var1.q0();
            }

            com.aspose.slides.internal.c8m.i4 var9 = com.aspose.slides.ms.System.d1.k5(var0.getEmbeddedFileName(), ".bin")
               ? new com.aspose.slides.internal.c8m.y9()
               : k5(var0);
            return var1.a6().n5(var0.getEmbeddedFileName(), null, var9);
         }
      }

      boolean var7 = l6(var0);
      String var3 = var7 ? n5(var0) : ".bin";
      com.aspose.slides.internal.c8m.i4 var4 = var7 ? k5(var0) : new com.aspose.slides.internal.c8m.y9();
      return var1.a6().n5(com.aspose.slides.ms.System.d1.n5(new String[]{"/ppt/embeddings", "/oleObject{0}", var3}), new r6z$3(var1), var4);
   }

   private static void n5(IOleObjectFrame var0, com.aspose.slides.internal.k4y.r0j var1, com.aspose.slides.internal.c8m.r7 var2) {
      com.aspose.slides.internal.o9b.f2 var3 = ((OleObjectFrame)var0).n5().a6();
      if (var3.n5()) {
         if (var0.isObjectIcon()) {
            var3 = new com.aspose.slides.internal.o9b.f2(var0.getWidth(), var0.getHeight());
         } else if (var0.getSubstitutePictureFormat().getPicture().getImage() != null) {
            com.aspose.slides.internal.o9b.w1 var4 = ((PPImage)var0.getSubstitutePictureFormat().getPicture().getImage()).t2().u3();
            var3.n5(var0.getSubstitutePictureFormat().getPicture().getImage().getWidth() * 72 / var4.l6());
            var3.l6(var0.getSubstitutePictureFormat().getPicture().getImage().getHeight() * 72 / var4.k5());
         }
      }

      var1.k5(var0.getObjectName());
      var1.a6(var0.getObjectProgId());
      var1.n5(var0.isObjectIcon());
      var1.n5(var3.l6());
      var1.l6(var3.k5());
      if (var0.isObjectLink()) {
         com.aspose.slides.internal.k4y.e7k var5 = (com.aspose.slides.internal.k4y.e7k)var1.n5("link").l6();
         var5.n5(var0.getUpdateAutomatic());
      } else {
         var1.n5("embed");
      }

      if (var2 != null) {
         var1.u3(var2.a6());
      }
   }

   static void n5(String var0, OleObjectFrame var1) {
      try {
         com.aspose.slides.ms.System.r8 var2 = new com.aspose.slides.ms.System.r8(var0);
         com.aspose.slides.internal.z0k.z1.n5(var2.x8());
         var1.setLinkPathLong(var2.c8() ? var2.x8() : var2.l6());
      } catch (RuntimeException var3) {
         var1.setLinkPathLong(var0);
         com.aspose.slides.internal.n8e.v4.n5(var3);
      }
   }

   private static void n5(com.aspose.slides.internal.c8m.r7 var0, OleObjectFrame var1, i1x var2) {
      com.aspose.slides.internal.c8m.j8 var3 = var0.l6();
      if (var3 == null) {
         var1.x8().n5(true);
      } else {
         var3.n5(true);

         try {
            if (var3.a6() == null) {
               var2.n5().n5(com.aspose.slides.ms.System.d1.n5("Embedded OLE-object data not found: {0}", new Object[]{var3}), 1);
               return;
            }
         } catch (com.aspose.slides.internal.e5a.f2 var9) {
            var2.n5().n5(com.aspose.slides.ms.System.d1.n5("Embedded OLE-object is corrupted: {0}", new Object[]{var3}), 1);
            var1.x8().n5(true);
            return;
         }

         var1.n5(var3.a6());
         com.aspose.slides.internal.z0k.e2 var4 = new com.aspose.slides.internal.z0k.e2(var3.a6());

         try {
            var1.l6(var0.n5());
            if (!n5(var4, var1, var2.n5())) {
               n5(var0, var1);
            } else if (var2.n5().t9().a6().getDeleteEmbeddedBinaryObjects()) {
               var1.n5(new byte[0]);
            }
         } finally {
            if (var4 != null) {
               var4.dispose();
            }
         }

         if (var1.e2() != null) {
            if (var1.z1().getEmbeddedFileData() == null) {
               var1.z1().n5(var1.e2());
            }

            if (com.aspose.slides.ms.System.d1.n5(var1.z1().getEmbeddedFileExtension())) {
               var1.z1().n5("bin");
            }
         } else {
            var1.n5(new OleEmbeddedDataInfo());
         }
      }
   }

   static boolean n5(com.aspose.slides.internal.z0k.e2 var0, OleObjectFrame var1, com.aspose.slides.internal.c8m.x8 var2) {
      boolean var3 = false;
      int var4 = var0.readByte();
      if (var4 > 0) {
         var0.seek(-1L, 1);
         if ((byte)var4 == 80) {
            var3 = true;
         }
      }

      if (var3) {
         var1.z1().n5(var0.toArray());
         return false;
      }

      boolean var5 = false;
      if (var0.getLength() >= 4L) {
         int var6 = var0.readByte();
         int var7 = var0.readByte();
         int var8 = var0.readByte();
         int var9 = var0.readByte();
         var0.seek(-4L, 1);
         var5 = var6 == 80 && var7 == 75 && var8 == 3 && var9 == 4;
      }

      if (var5) {
         return false;
      }

      com.aspose.slides.internal.x1.x8 var16 = null;
      com.aspose.slides.internal.x1.x8[] var18 = new com.aspose.slides.internal.x1.x8[]{var16};
      boolean var19 = n5(var0, var18, var1.getEmbeddedFileName(), var2);
      var16 = var18[0];
      if (var19) {
         com.aspose.slides.ms.System.o0 var10 = new com.aspose.slides.ms.System.o0(var16.n5().u9());
         if (e6f.l6().containsKey(var10.k5()) && var16.n5().n5().size() > 0) {
            if (com.aspose.slides.ms.System.d1.n5(var1.getObjectProgId())) {
               var1.setObjectProgId(e6f.l6().get_Item(var10.k5()));
            }

            e5i var11 = e6f.n5().get_Item(e6f.l6().get_Item(var10.k5()));
            var1.z1().n5(var11.n5());
            var1.n5(var11.a6());
            switch (n5.n5(e6f.l6().get_Item(var10.k5()))) {
               case 0:
                  byte[] var21 = ((com.aspose.slides.internal.x1.u9)var16.n5().u3("\u0001Ole10Native")).n5();
                  return y2i.n5(var1, var21, var2);
               case 1:
               case 2:
                  if (var16.n5().l6("CONTENTS")) {
                     var1.z1().n5(((com.aspose.slides.internal.x1.u9)var16.n5().u3("CONTENTS")).l6());
                  }

                  return true;
               case 3:
               case 4:
               case 5:
               case 6:
                  try {
                     var1.z1().n5(((com.aspose.slides.internal.x1.u9)var16.n5().u3("Package")).l6());
                     return true;
                  } catch (RuntimeException var15) {
                     com.aspose.slides.ms.System.o0.n5.k5(var10);
                     break;
                  }
               case 7:
                  var1.z1().n5(((com.aspose.slides.internal.x1.u9)var16.n5().u3("Contents")).l6());
                  return true;
               case 8:
                  com.aspose.slides.internal.x1.u9 var12 = (com.aspose.slides.internal.x1.u9)var16.n5().u3("\u0001Ole10Native");
                  byte[] var20 = var12 != null ? var12.l6() : null;
                  if (var20 != null && var20.length > 4) {
                     byte[] var13 = new byte[var20.length - 4];
                     System.arraycopy(var20, 4, var13, 0, var20.length - 4);
                     var1.z1().n5(var13);
                  }

                  return true;
               case 9:
               case 10:
               case 11:
               case 12:
               case 13:
               case 14:
                  com.aspose.slides.ms.System.o0.n5.k5(var10);
            }
         }

         if (com.aspose.slides.ms.System.o0.n5(var10, com.aspose.slides.ms.System.o0.n5)
            && e6f.n5().containsKey(com.aspose.slides.ms.System.d1.a6(var1.getObjectProgId()))) {
            e5i var22 = e6f.n5().get_Item(com.aspose.slides.ms.System.d1.a6(var1.getObjectProgId()));
            var1.z1().n5(var22.n5());
            var1.n5(var22.a6());
            if ("1".equals(var22.k5())) {
               var16.n5().k5("\u0001Ole");
               var16.n5().k5("\u0001CompObj");
               var16.n5().k5("\u0002OlePres000");

               try {
                  com.aspose.slides.internal.z0k.e2 var23 = new com.aspose.slides.internal.z0k.e2();
                  var16.l6(var23);
                  var1.z1().n5(var23.toArray());
               } catch (RuntimeException var14) {
                  var1.z1().n5(var0.toArray());
               }

               return true;
            }
         }
      }

      var1.z1().n5(".bin");
      var1.z1().n5(var0.toArray());
      return true;
   }

   static boolean n5(com.aspose.slides.internal.z0k.e2 var0, com.aspose.slides.internal.x1.x8[] var1, String var2, com.aspose.slides.internal.c8m.x8 var3) {
      var1[0] = null;

      try {
         var1[0] = new com.aspose.slides.internal.x1.x8(var0);
         if (var1[0].n5() != null
            && com.aspose.slides.internal.v6g.k5.l6(var1[0].n5().h0(), com.aspose.slides.internal.x1.u9.class)
            && ((com.aspose.slides.internal.x1.u9)var1[0].n5().h0()).k5()) {
            ((t5w)var3).n5(com.aspose.slides.ms.System.d1.n5("Embedded OLE-object has broken sectors: {0}", new Object[]{var2}), 0);
         }

         return true;
      } catch (RuntimeException var5) {
         ((t5w)var3).n5(com.aspose.slides.ms.System.d1.n5("Embedded OLE-object {0} corrupted", new Object[]{var2}), 0);
         return false;
      }
   }

   private static void n5(com.aspose.slides.internal.c8m.r7 var0, OleObjectFrame var1) {
      try {
         var1.l6(var0.n5());
         String var2 = com.aspose.slides.ms.System.d1.a6(var1.getObjectProgId());
         if (e6f.n5().containsKey(var2)) {
            var1.n5(e6f.n5().get_Item(var2).a6());
         }

         var1.z1().n5(com.aspose.slides.internal.z0k.z1.a6(var1.getEmbeddedFileName()));
      } catch (ArgumentException var3) {
         var1.z1().n5("bin");
         com.aspose.slides.internal.n8e.v4.n5(var3);
      }
   }
}

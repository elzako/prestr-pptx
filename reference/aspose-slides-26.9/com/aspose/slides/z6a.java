package com.aspose.slides;

import com.aspose.slides.Collections.IEnumerator;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.Xml.XmlDocument;

class z6a {
   public static void n5(IShape var0, com.aspose.slides.internal.k4y.b9y var1, t5w var2) {
      if (var1 != null) {
         x9f.n5(var0.getFillFormat(), var1.c8(), var2);
         if (var1.t2() != null) {
            Shape var3 = (Shape)var0;
            ILineFormat var4 = new LineFormat(var3);
            i3z.n5(var4, var1.t2());
            ILineFormat[] var5 = new ILineFormat[]{var4};
            var2.t9().y2().n5().n5(var5);
            var4 = var5[0];
            var3.n5((LineFormat)var4);
            var3.a0();
         }

         w5i.n5(new z6a$1(var0), var1.s7(), var2);
         r6k.n5(new z6a$6(var0), var1.x8(), var1.n3(), null);
         var0.setBlackWhiteMode(var1.a6());
         if (var1.u9() != null) {
            e4c var10 = new e4c();
            e4c var12 = new e4c();
            x4t var13 = new x4t();
            e4c[] var6 = new e4c[]{var10};
            e4c[] var7 = new e4c[]{var12};
            x4t[] var8 = new x4t[]{var13};
            z5b.n5(var1.u9(), var6, var7, var8);
            var6[0].l6(var10);
            var7[0].l6(var12);
            var8[0].n5(var13);
            o4f var9 = ((Shape)var0).R_();
            var9.n5(var10.u9());
            ((Shape)var0).k5(var12.u9());
            var9.n5(var13.n5());
         }

         n5(var0, var1.y4(), var2);
      }
   }

   private static void n5(IShape var0, com.aspose.slides.internal.k4y.x8 var1, t5w var2) {
      u9i var3 = ((Shape)var0).h0();
      var3.h0(var1);
      if (var2.z3() && var1 != null && com.aspose.slides.internal.v6g.k5.l6(var0, AutoShape.class)) {
         com.aspose.slides.internal.k4y.g7 var4 = com.aspose.slides.internal.k4y.x1f.k5(var1);
         if (var4 != null) {
            ((AutoShape)var0).n5().n5(new FillFormat(null));
            x9f.n5(((AutoShape)var0).n5().c8(), var4, var2);
         }

         com.aspose.slides.internal.k4y.g7 var5 = com.aspose.slides.internal.k4y.x1f.u3(var1);
         if (var5 != null) {
            ((AutoShape)var0).n5().n5(new EffectFormat(null));
            w5i.n5(((AutoShape)var0).n5().t2(), var5, var2);
         }
      }
   }

   public static void n5(IShape var0, com.aspose.slides.internal.k4y.s1q var1, i1x var2) {
      if (var1 != null) {
         y7e.n5(var0, var1.a6(), var2);
         u9i var3 = ((Shape)var0).h0();
         i2i.n5(var0.getCustomData(), var1.h0(), var2.n5());
         if (var0.getCustomData().getTags().contains("AS_UNIQUEID")) {
            ((Shape)var0).u3(var0.getCustomData().getTags().get_Item("AS_UNIQUEID"));
            var0.getCustomData().getTags().remove("AS_UNIQUEID");
         }

         var3.k5(var1.k5());
         var3.u3(var1.u3());
         var3.u9(var1.c8());
      }
   }

   public static void n5(IShape var0, com.aspose.slides.internal.k4y.c4t var1, i1x var2) {
      if (var1 != null) {
         y1w.n5(var0, var1.c8(), var1.t2(), var2.n5());
         var0.setHidden(var1.h0());
         var0.setAlternativeText(var1.a6());
         var0.setAlternativeTextTitle(var1.u9());
         var0.setName(var1.u3());
         var0.setDecorative(n5(var1));
         u9i var3 = ((Shape)var0).h0();
         switch (var2.n5().u9()) {
            case 0:
            case 1:
            case 3:
               if (var2.n5(com.aspose.slides.ms.System.Xml.f4.l6(var1.k5()), var0)) {
                  ((Shape)var0).u3(var1.k5());
               } else {
                  ((Shape)var0).u3(0L);
               }
            case 2:
               var2.n5().n3().addItem(var0);
               var3.a6(var1.s7());
               return;
            default:
               throw new ArgumentOutOfRangeException();
         }
      }
   }

   public static void n5(Shape var0) {
   }

   public static void n5(IShape var0, com.aspose.slides.internal.k4y.b9y var1, g6c var2) {
      x9f.n5(var0.getFillFormat(), new z6a$7(var1), var2);
      i3z.n5(var0.getLineFormat(), new z6a$8(var1));
      w5i.n5(var0.getEffectFormat(), new z6a$9(var1), var2);
      r6k.n5(var0.getThreeDFormat(), new z6a$10(var1), new z6a$11(var1), null);
      var1.n5(var0.getBlackWhiteMode());
      z5b.n5((Shape)var0, new z6a$12(var1), var2.c8());
      n5(var0, ((Shape)var0).h0().m3(), var1, var2);
   }

   private static void n5(IShape var0, com.aspose.slides.internal.k4y.x8 var1, com.aspose.slides.internal.k4y.b9y var2, g6c var3) {
      if (var1 != null && com.aspose.slides.internal.v6g.k5.l6(var0, AutoShape.class)) {
         AutoShape var4 = (AutoShape)var0;
         if (var4.n5().c8() != null) {
            IFillFormat var5 = var4.n5().c8();
            com.aspose.slides.internal.k4y.w8d var6 = com.aspose.slides.internal.k4y.x1f.l6(var1, "{909E8E84-426E-40DD-AFC4-6F175D3DCCD1}");
            com.aspose.slides.ms.System.Xml.m8 var7 = (com.aspose.slides.ms.System.Xml.m8)j2z.n5(
               (com.aspose.slides.ms.System.Xml.l0)var6.l6().getDocumentElement(), "hiddenFill", "http://schemas.microsoft.com/office/drawing/2010/main"
            );
            com.aspose.slides.internal.l7h.a5 var8 = new com.aspose.slides.internal.l7h.a5();
            com.aspose.slides.internal.z0k.r4 var9 = new com.aspose.slides.internal.z0k.r4(var8);

            try {
               com.aspose.slides.internal.n8e.u4 var10 = new com.aspose.slides.internal.n8e.u4(var9, var3.a6().h0());

               try {
                  switch (var5.getFillType()) {
                     case 0:
                     default:
                        com.aspose.slides.internal.k4y.u4k var11 = new com.aspose.slides.internal.k4y.u4k();
                        var11.n5("a", var10, "noFill");
                        break;
                     case 1:
                        com.aspose.slides.internal.k4y.e2l var13 = new com.aspose.slides.internal.k4y.e2l();
                        c4i.n5(var5.getSolidFillColor(), new z6a$13(var13));
                        var13.n5("a", var10, "solidFill");
                        break;
                     case 2:
                        com.aspose.slides.internal.k4y.j2p var14 = new com.aspose.slides.internal.k4y.j2p();
                        var14.n5(var5.getRotateWithShape());
                        z3s.l6(var5.getGradientFormat(), var14);
                        var14.n5("a", var10, "gradFill");
                        break;
                     case 3:
                        com.aspose.slides.internal.k4y.n9q var12 = new com.aspose.slides.internal.k4y.n9q();
                        g3d.l6(var5.getPatternFormat(), var12);
                        var12.n5("a", var10, "pattFill");
                        break;
                     case 4:
                        com.aspose.slides.internal.k4y.e3 var15 = new com.aspose.slides.internal.k4y.e3();
                        var15.n5(var5.getRotateWithShape());
                        k8n.n5((PictureFillFormat)var5.getPictureFillFormat(), var15, var3);
                        var15.n5("a", var10, "blipFill");
                        break;
                     case 5:
                        com.aspose.slides.internal.k4y.r6i var16 = new com.aspose.slides.internal.k4y.r6i();
                        var16.n5("a", var10, "grpFill");
                  }
               } finally {
                  if (var10 != null) {
                     var10.dispose();
                  }
               }

               var9.k5();
            } finally {
               if (var9 != null) {
                  var9.dispose();
               }
            }

            var7.setInnerXml(var8.toString());
         }

         if (var4.n5().t2() != null) {
            IEffectFormat var41 = var4.n5().t2();
            com.aspose.slides.internal.k4y.w8d var42 = com.aspose.slides.internal.k4y.x1f.l6(var1, "{AF507438-7753-43E0-B8FC-AC1667EBCBE1}");
            com.aspose.slides.ms.System.Xml.m8 var43 = (com.aspose.slides.ms.System.Xml.m8)j2z.n5(
               (com.aspose.slides.ms.System.Xml.l0)var42.l6().getDocumentElement(), "hiddenEffects", "http://schemas.microsoft.com/office/drawing/2010/main"
            );
            com.aspose.slides.internal.l7h.a5 var44 = new com.aspose.slides.internal.l7h.a5();
            com.aspose.slides.internal.z0k.r4 var45 = new com.aspose.slides.internal.z0k.r4(var44);

            try {
               com.aspose.slides.internal.n8e.u4 var46 = new com.aspose.slides.internal.n8e.u4(var45, var3.a6().h0());

               try {
                  com.aspose.slides.internal.k4y.o9b var47 = new com.aspose.slides.internal.k4y.o9b();
                  w5i.n5(var41, var47, var3);
                  var47.n5("a", var46, "effectLst");
               } finally {
                  if (var46 != null) {
                     var46.dispose();
                  }
               }

               var45.k5();
            } finally {
               if (var45 != null) {
                  var45.dispose();
               }
            }

            var43.setInnerXml(var44.toString());
         }
      }

      var2.n5(var1);
   }

   public static void n5(IShape var0, com.aspose.slides.internal.k4y.s1q var1, g6c var2) {
      if (var1 != null) {
         y7e.n5(var0, new z6a$2(var1));
         u9i var3 = ((Shape)var0).h0();
         if (((Presentation)var0.getPresentation()).k5()) {
            var0.getCustomData().getTags().add("AS_UNIQUEID", com.aspose.slides.ms.System.l4.n5(var0.getUniqueId(), com.aspose.slides.internal.x7n.l6.k5()));
         }

         i2i.n5(var0.getCustomData(), new z6a$3(var1), var2);
         if (((Presentation)var0.getPresentation()).k5()) {
            var0.getCustomData().getTags().remove("AS_UNIQUEID");
         }

         var1.n5(var3.z8());
         var1.l6(var3.j5());
         var1.n5(var3.k7());
      }
   }

   public static void n5(IShape var0, com.aspose.slides.internal.k4y.c4t var1, g6c var2) {
      y1w.n5(var0, new z6a$4(var1), new z6a$5(var1), var2);
      var1.n5(var0.getHidden());
      var1.l6(var0.getAlternativeText());
      var1.k5(var0.getAlternativeTextTitle());
      var1.n5(var0.getName());
      u9i var3 = ((Shape)var0).h0();
      var1.n5(var3.z3());
      var1.n5(var3.m1());
      n5(var1, var0.isDecorative());
   }

   private static boolean n5(com.aspose.slides.internal.k4y.c4t var0) {
      com.aspose.slides.internal.k4y.l8r var1 = com.aspose.slides.internal.v6g.k5.n5(var0.s7(), com.aspose.slides.internal.k4y.l8r.class);
      if (var1 != null && var1.n5().length > 0) {
         XmlDocument var2 = com.aspose.slides.internal.k4y.i8w.n5(var1, "{C183D7F6-B498-43B3-948B-1728B52AA6E4}");
         if (var2 != null) {
            com.aspose.slides.ms.System.Xml.m8 var3 = var2.getDocumentElement();
            if (var3 != null) {
               com.aspose.slides.ms.System.Xml.m8 var4 = (com.aspose.slides.ms.System.Xml.m8)j2z.n5(
                  var3, "decorative", "http://schemas.microsoft.com/office/drawing/2017/decorative"
               );
               if (var4 != null && var4.u3("val")) {
                  return "1".equals(var4.n5("val"));
               }
            }
         }
      }

      return false;
   }

   private static void n5(com.aspose.slides.internal.k4y.c4t var0, boolean var1) {
      if (var1) {
         if (var0.s7() == null || var0.s7() != null && var0.s7().n5() != null && var0.s7().n5().length == 0) {
            com.aspose.slides.internal.z0k.e2 var2 = new com.aspose.slides.internal.z0k.e2();

            try {
               com.aspose.slides.ms.System.Xml.k3 var3 = new com.aspose.slides.ms.System.Xml.k3(var2, com.aspose.slides.internal.l7h.j5.z3());

               try {
                  var3.k5("extLst", "a");
                  var3.n5("a", "ext", "http://schemas.openxmlformats.org/drawingml/2006/main");
                  var3.u3("uri", "{C183D7F6-B498-43B3-948B-1728B52AA6E4}");
                  var3.n5("adec", "decorative", "http://schemas.microsoft.com/office/drawing/2017/decorative");
                  var3.u3("val", "1");
                  var3.s7();
                  var3.s7();
                  var3.s7();
                  var3.u9();
                  var2.seek(0L, 0);
                  var0.n5(n5(var2));
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
         } else {
            var0.n5(l6(n5(var0.s7().n5(), "1")));
         }
      } else if (var0.s7() != null && var0.s7().n5() != null && var0.s7().n5().length > 0) {
         var0.n5(l6(n5(var0.s7().n5())));
      }
   }

   private static com.aspose.slides.internal.k4y.d3[] n5(com.aspose.slides.internal.k4y.d3[] var0, String var1) {
      com.aspose.slides.internal.k4y.d3[] var2 = new com.aspose.slides.internal.k4y.d3[var0.length];

      for (int var3 = 0; var3 < var0.length; var3++) {
         com.aspose.slides.internal.k4y.d3 var4 = var0[var3];
         if (var4 != null && "{C183D7F6-B498-43B3-948B-1728B52AA6E4}".equals(var4.l6().getDocumentElement().n5("uri"))) {
            IEnumerator var5 = var4.l6().getDocumentElement().getChildNodes().iterator();

            try {
               while (var5.hasNext()) {
                  Object var6 = var5.next();
                  if (com.aspose.slides.internal.v6g.k5.l6(var6, com.aspose.slides.ms.System.Xml.m8.class)) {
                     com.aspose.slides.internal.v6g.k5.n5(var6, com.aspose.slides.ms.System.Xml.m8.class).k5("val", var1);
                  }
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var5, IDisposable.class)) {
                  ((IDisposable)var5).dispose();
               }
            }
         }

         var2[var3] = var4;
      }

      return var2;
   }

   private static com.aspose.slides.internal.k4y.d3[] n5(com.aspose.slides.internal.k4y.d3[] var0) {
      com.aspose.slides.internal.k4y.d3[] var1 = new com.aspose.slides.internal.k4y.d3[var0.length];

      for (int var2 = 0; var2 < var0.length; var2++) {
         com.aspose.slides.internal.k4y.d3 var3 = var0[var2];
         if (var3 != null && !"{C183D7F6-B498-43B3-948B-1728B52AA6E4}".equals(var3.l6().getDocumentElement().n5("uri"))) {
            var1[var2] = var3;
         }
      }

      return var1;
   }

   private static com.aspose.slides.internal.k4y.x8 l6(com.aspose.slides.internal.k4y.d3[] var0) {
      com.aspose.slides.internal.z0k.e2 var1 = new com.aspose.slides.internal.z0k.e2();

      try {
         com.aspose.slides.ms.System.Xml.k3 var2 = new com.aspose.slides.ms.System.Xml.k3(var1, com.aspose.slides.internal.l7h.j5.z3());

         try {
            var2.k5("extLst", "a");

            for (int var3 = 0; var3 < var0.length; var3++) {
               if (var0[var3] != null) {
                  var2.c8(var0[var3].n5());
               }
            }

            var2.s7();
            var2.u9();
            var1.seek(0L, 0);
            return n5(var1);
         } finally {
            if (var2 != null) {
               var2.dispose();
            }
         }
      } finally {
         if (var1 != null) {
            var1.dispose();
         }
      }
   }

   private static com.aspose.slides.internal.k4y.l8r n5(com.aspose.slides.internal.z0k.t4 var0) {
      com.aspose.slides.ms.System.Xml.c7 var1 = com.aspose.slides.ms.System.Xml.c7.n5(var0);

      try {
         if (var1.u9() && "extLst".equals(var1.n3())) {
            return new com.aspose.slides.internal.k4y.l8r(var1);
         }
      } finally {
         if (var1 != null) {
            var1.dispose();
         }
      }

      throw new ArgumentException();
   }
}

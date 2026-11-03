package com.aspose.slides;

import com.aspose.slides.Collections.IEnumerator;
import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.Dictionary$Enumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.Collections.Generic.SortedList;
import com.aspose.slides.internal.k4y.d1n;
import com.aspose.slides.internal.k4y.f5z;
import com.aspose.slides.internal.k4y.l7p;
import com.aspose.slides.internal.k4y.t3k;
import com.aspose.slides.internal.k4y.v4a;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.Xml.XmlDocument;

class l2h extends x0q {
   private Dictionary<String, String> n5;
   private static final com.aspose.slides.internal.v6g.u9 l6 = new com.aspose.slides.internal.v6g.u9("shapelayout", "shapetype", "shape", "xml", "group");

   final void n5(IBaseSlide var1, i1x var2) {
      this.n5();
      this.n5 = null;
      List var3 = new List();
      boolean var4 = false;

      while (var4 && !this.s7().j5() || this.s7().u9()) {
         var4 = false;
         if (this.s7().s7() == 1) {
            switch (l6.n5(this.s7().n3())) {
               case 0:
                  this.s7().r4();
                  var4 = true;
                  break;
               case 1:
                  this.s7().r4();
                  var4 = true;
                  break;
               case 2:
                  this.l6(var1, var2);
               case 3:
                  break;
               case 4:
                  LegacyDiagram var5 = this.n5(var2);
                  if (var5 != null) {
                     var3.addItem(var5);
                  }
                  break;
               default:
                  this.s7().r4();
                  var4 = true;
            }
         }
      }

      List var17 = new List();
      List$Enumerator var6 = var3.iterator();

      try {
         while (var6.hasNext()) {
            LegacyDiagram var7 = (LegacyDiagram)var6.next();
            var17.addItem(var7.n5().n5());
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var6, IDisposable.class)) {
            var6.dispose();
         }
      }

      List$Enumerator var18 = var3.iterator();

      try {
         while (var18.hasNext()) {
            LegacyDiagram var8 = (LegacyDiagram)var18.next();
            r6c.n5(var8.k5(), var8.n5().n5(), var17, var2.n5());
            com.aspose.slides.internal.o9b.y1 var9 = var8.k5().y4().y4();
            var8.k5().n5(new e4c(var9.x8(), var9.n3()));
            var8.k5().l6(new e4c(var9.s7(), var9.k5()));
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var18, IDisposable.class)) {
            var18.dispose();
         }
      }

      this.n3();
   }

   public l2h(com.aspose.slides.internal.c8m.j8 var1, t5w var2) {
      super(var1, var2);
   }

   public l2h(com.aspose.slides.internal.c8m.j8 var1, g6c var2) {
      super(var1, var2);
   }

   private void l6(IBaseSlide var1, i1x var2) {
      v4a var3 = new v4a(this.s7());
      this.n5(var1, var2, var3, var2.u3());
      this.n5(var3, var2.t2());
   }

   private void n5(IBaseSlide var1, i1x var2, v4a var3, SortedList<String, ISlideComponent> var4) {
      try {
         String var5 = var3.n5();
         if (var5 == null) {
            var5 = "";
         }

         String var6 = var5;
         String var7 = var3.m1();
         if (var7 == null) {
            var7 = "";
         }

         String var8 = var7;
         Object var9 = null;
         String[] var10 = new String[]{(String)var9};
         ISlideComponent var11 = n5(var6, var8, var4, var10);
         String var14 = var10[0];
         boolean var12 = true;
         if (var11 == null && (!"".equals(var6) || !"".equals(var8))) {
            if (this.n5 == null) {
               this.n5 = n5(var2.l6());
            }

            var12 = !this.n5.containsKey(var6) && !this.n5.containsKey(var8) && (var14 == null || !this.n5.containsKey(var14));
         }

         if (var12 && (var11 == null || com.aspose.slides.internal.v6g.k5.l6(var11, IShape.class))) {
            n5(var1, (IShape)var11, var3, this.k5());
         }
      } catch (RuntimeException var13) {
         com.aspose.slides.internal.n8e.v4.n5(var13);
      }
   }

   private void n5(v4a var1, SortedList<String, IControl> var2) {
      if (var2 != null && var2.size() != 0) {
         try {
            String var3 = var1.n5();
            if (var3 == null) {
               var3 = "";
            }

            String var4 = var3;
            String var5 = var1.m1();
            if (var5 == null) {
               var5 = "";
            }

            String var6 = var5;
            Object var7 = null;
            String[] var8 = new String[]{(String)var7};
            IControl var9 = n5(var4, var6, var2, var8);
            if (var9 != null) {
               n5(var9, var1, this.k5());
            }
         } catch (RuntimeException var10) {
            com.aspose.slides.internal.n8e.v4.n5(var10);
         }
      }
   }

   private static <T> T n5(String var0, String var1, SortedList<String, T> var2, String[] var3) {
      var3[0] = null;
      if (var2 != null && var2.size() != 0) {
         Object var4 = null;
         Object[] var5 = new Object[]{var4};
         boolean var6 = !com.aspose.slides.ms.System.d1.n5(var0) && var2.tryGetValue(var0, var5);
         var4 = var5[0];
         if (var6) {
            return (T)var4;
         }

         var5[0] = var4;
         boolean var7 = !com.aspose.slides.ms.System.d1.n5(var1) && var2.tryGetValue(var1, var5);
         var4 = var5[0];
         if (var7) {
            return (T)var4;
         }

         if (!com.aspose.slides.ms.System.d1.n5(var1) && com.aspose.slides.ms.System.d1.l6(var1, "_x")) {
            int var8 = 2;

            while (var8 < var1.length() && var1.charAt(var8) >= '0' && var1.charAt(var8) <= '9') {
               var8++;
            }

            if (var8 + 2 < var1.length() && var1.charAt(var8) == '_' && var1.charAt(var8 + 1) == 's') {
               var8 += 2;
               var3[0] = com.aspose.slides.ms.System.d1.k5(var1, var8);
               var5[0] = var4;
               boolean var9 = var2.tryGetValue(var3[0], var5);
               var4 = var5[0];
               if (var9) {
                  return (T)var4;
               }
            }
         }

         return null;
      } else {
         return null;
      }
   }

   private static void n5(IBaseSlide var0, IShape var1, v4a var2, t5w var3) {
      if (var1 != null) {
         if (com.aspose.slides.internal.v6g.k5.l6(var1, IOleObjectFrame.class)) {
            OleObjectFrame var13 = (OleObjectFrame)var1;
            if (com.aspose.slides.ms.System.n1.k5(var13.getRawFrame().getX())) {
               n9s.n5(var1, var2.l6());
            }

            n9v.n5(var1.getFillFormat(), var1.getLineFormat(), var2, false, false, var3);
            o6n.n5((PictureFillFormat)var13.getSubstitutePictureFormat(), var2, var3);
            var13.x8().n5((com.aspose.slides.internal.k4y.e5f)var2.n5("recolorinfo"));
         }
      } else {
         List$Enumerator var4 = var2.t2().iterator();

         try {
            while (var4.hasNext()) {
               com.aspose.slides.internal.k4y.g7 var5 = (com.aspose.slides.internal.k4y.g7)var4.next();
               if ("ClientData".equals(var5.n5())) {
                  return;
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
               var4.dispose();
            }
         }

         ShapeCollection var14 = (ShapeCollection)var0.getShapes();
         boolean var6 = false;
         boolean[] var7 = new boolean[]{false};
         IPPImage var8 = o6n.n5(var0, var2, var3, var7);
         var6 = var7[0];
         if (var8 != null) {
            PictureFrame var9 = var14.q0();
            var9.getPictureFormat().getPicture().setImage(var8);
            var9.getPictureFormat().setPictureFillMode(1);
            var9.setShapeType(5);
            if (var6) {
               var0.getShapes().reorder(0, var9);
            }

            n9s.n5(var9, var2.l6());
            o6n.n5((PictureFillFormat)var9.getPictureFormat(), var2);
            return;
         } else {
            AutoShape var16 = var14.y4();
            var16.setShapeType(5);
            IShapeStyle var10 = var16.getShapeStyle();
            if (var10 != null) {
               var10.setLineStyleIndex(0);
               var10.setFillStyleIndex((short)0);
               var10.setEffectStyleIndex(0L);
               var10.setFontCollectionIndex((byte)0);
            }

            n9s.n5(var16, var2.l6());
            if ("_x0000_t75".equals(com.aspose.slides.ms.System.d1.k5(var2.t4(), 1))) {
               var16.getFillFormat().setFillType((byte)0);
               var16.getLineFormat().getFillFormat().setFillType((byte)0);
            } else {
               n9v.n5(var16.getFillFormat(), var16.getLineFormat(), var2, var3);
            }
         }
      }
   }

   private static void n5(IControl var0, v4a var1, t5w var2) {
      n9s.n5(var0, var1.l6());
      o6n.n5((PictureFillFormat)var0.getSubstitutePictureFormat(), var1, var2);
   }

   private static Dictionary<String, String> n5(com.aspose.slides.internal.c8m.j8 var0) {
      XmlDocument var1 = new XmlDocument();
      com.aspose.slides.internal.z0k.e2 var2 = var0.h0();

      try {
         var1.load(var2);
      } finally {
         if (var2 != null) {
            var2.dispose();
         }
      }

      Dictionary var3 = new Dictionary();
      n5(var3, var1.getDocumentElement());
      return var3;
   }

   private static void n5(Dictionary<String, String> var0, com.aspose.slides.ms.System.Xml.m8 var1) {
      String var2 = var1.u3("spid", "");
      if (!com.aspose.slides.ms.System.d1.n5(var2)) {
         var0.set_Item(var2, var2);
      } else {
         IEnumerator var3 = var1.getChildNodes().iterator();

         try {
            while (var3.hasNext()) {
               com.aspose.slides.ms.System.Xml.l0 var4 = (com.aspose.slides.ms.System.Xml.l0)var3.next();
               com.aspose.slides.ms.System.Xml.m8 var5 = com.aspose.slides.internal.v6g.k5.n5(var4, com.aspose.slides.ms.System.Xml.m8.class);
               if (var5 != null) {
                  n5(var0, var5);
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
               ((IDisposable)var3).dispose();
            }
         }
      }
   }

   private LegacyDiagram n5(i1x var1) {
      f5z var2 = new f5z(this.s7());
      String var3 = var2.n5();
      String var4 = var2.m1();
      ISlideComponent var5 = null;
      if (!com.aspose.slides.ms.System.d1.n5(var3)) {
         ISlideComponent[] var6 = new ISlideComponent[]{var5};
         var1.u3().tryGetValue(var3, var6);
         var5 = var6[0];
      }

      if (var5 == null && !com.aspose.slides.ms.System.d1.n5(var4)) {
         ISlideComponent[] var20 = new ISlideComponent[]{var5};
         var1.u3().tryGetValue(var4, var20);
         var5 = var20[0];
      }

      LegacyDiagram var21 = com.aspose.slides.internal.v6g.k5.n5(var5, LegacyDiagram.class);
      if (var21 != null) {
         t4i var7 = var21.n5();
         var7.n5(var2);
         List var8 = new List();
         n5(var2, var8);
         if (var8.size() > 0) {
            com.aspose.slides.internal.c8m.r7[] var9 = var1.n5().k7().n5(com.aspose.slides.internal.c8m.q1.n5);
            List$Enumerator var10 = var8.iterator();

            try {
               while (var10.hasNext()) {
                  com.aspose.slides.internal.k4y.b3e var11 = (com.aspose.slides.internal.k4y.b3e)var10.next();
                  com.aspose.slides.internal.c8m.r7 var12 = null;

                  for (com.aspose.slides.internal.c8m.r7 var16 : var9) {
                     if (com.aspose.slides.ms.System.d1.a6(var11.n5(), var16.a6())) {
                        var12 = var16;
                        break;
                     }
                  }

                  if (var12 != null) {
                     var7.l6().addItem(var11, var12.l6().a6());
                     var12.l6().n5(true);
                  }
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var10, IDisposable.class)) {
                  var10.dispose();
               }
            }
         }
      }

      return var21;
   }

   private static void n5(com.aspose.slides.internal.k4y.m1 var0, List<com.aspose.slides.internal.k4y.b3e> var1) {
      List$Enumerator var2 = var0.t2().iterator();

      try {
         while (var2.hasNext()) {
            com.aspose.slides.internal.k4y.g7 var3 = (com.aspose.slides.internal.k4y.g7)var2.next();
            if ("textdata".equals(var3.n5())) {
               var1.addItem((com.aspose.slides.internal.k4y.b3e)var3.l6());
            } else if (com.aspose.slides.internal.v6g.k5.l6(var3.l6(), com.aspose.slides.internal.k4y.m1.class)) {
               n5((com.aspose.slides.internal.k4y.m1)var3.l6(), var1);
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }
   }

   final void n5(n4i var1) {
      this.y4();
      var1.n5(this.t9());
      this.x8().n5(null, "xml", null);
      this.x8().u3("xmlns", "v", null, "urn:schemas-microsoft-com:vml");
      this.x8().u3("xmlns", "o", null, "urn:schemas-microsoft-com:office:office");
      this.x8().u3("xmlns", "xs", null, "http://www.w3.org/2001/XMLSchema");
      this.x8().u3("xmlns", "r", null, "http://schemas.openxmlformats.org/officeDocument/2006/relationships");
      this.x8().u3("xmlns", "wvml", null, "urn:schemas-microsoft-com:office:word");
      this.x8().u3("xmlns", "x", null, "urn:schemas-microsoft-com:office:excel");
      this.x8().u3("xmlns", "ppt", null, "urn:schemas-microsoft-com:office:powerpoint");
      boolean var2 = false;
      Dictionary$Enumerator var3 = var1.u9().iterator();

      try {
         while (var3.hasNext()) {
            KeyValuePair var4 = (KeyValuePair)var3.next();
            ISlideComponent var5 = (ISlideComponent)var4.getKey();
            int var6 = (Integer)var4.getValue();
            if (com.aspose.slides.internal.v6g.k5.l6(var5, OleObjectFrame.class)) {
               if (!var2) {
                  n5(this.x8());
                  var2 = true;
               }

               n5((OleObjectFrame)var5, var6, this.x8(), var1);
            } else if (com.aspose.slides.internal.v6g.k5.l6(var5, Control.class)) {
               if (!var2) {
                  n5(this.x8());
                  var2 = true;
               }

               n5((Control)var5, var6, this.x8(), var1);
            } else if (com.aspose.slides.internal.v6g.k5.l6(var5, LegacyDiagram.class)) {
               n5((LegacyDiagram)var5, var6, this.x8(), var1);
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }

      this.x8().s7();
      this.e2();
   }

   private static void n5(OleObjectFrame var0, int var1, com.aspose.slides.internal.n8e.u4 var2, n4i var3) {
      v4a var4 = new v4a();
      String var5 = com.aspose.slides.ms.System.d1.n5("_x0000_s{0:D4}", new Object[]{var1});
      var4.l6(var5);
      var4.x8(com.aspose.slides.ms.System.d1.n5(new String[]{"#", "_x0000_t75"}));
      n9s.n5(var4, var0.getFrame());
      n9v.n5(var4, var0.getFillFormat(), var0.getLineFormat(), var3);
      IPPImage var6;
      if (var0.getSubstitutePictureFormat().getPicture().getImage() == null) {
         var6 = ((ImageCollection)var3.n5().t2().getImages()).k5();
      } else if (var0.isObjectIcon()) {
         PictureFillFormat var7 = var0.z8();
         var6 = var7.getPicture().getImage();
      } else {
         var6 = var0.getSubstitutePictureFormat().getPicture().getImage();
      }

      o6n.n5(var4, var6, var3);
      x4w.n5(var4, var0.getGraphicalObjectLock());
      com.aspose.slides.internal.k4y.e5f var14 = var0.x8().n5();
      if (var14 != null && var14.k5().length > 0) {
         com.aspose.slides.internal.k4y.e5f var8 = (com.aspose.slides.internal.k4y.e5f)var4.u9("recolorinfo").l6();
         if (var14.l6() == 1 || var14.l6() == 3) {
            var8.n5(1);
         }

         var8.n5(var14.k5().length & 4294967295L);

         for (com.aspose.slides.internal.k4y.l4t var12 : var14.k5()) {
            com.aspose.slides.internal.k4y.l4t var13 = var8.n5();
            var13.n5(var12.n5());
            var13.l6(var12.l6());
         }
      }

      var4.n5("v", var2, "shape");
   }

   private static void n5(Control var0, int var1, com.aspose.slides.internal.n8e.u4 var2, n4i var3) {
      v4a var4 = new v4a();
      var4.l6(var0.getName());
      var4.u3(com.aspose.slides.ms.System.d1.n5("_x0000_s{0:D4}", new Object[]{var1}));
      var4.x8(com.aspose.slides.ms.System.d1.n5(new String[]{"#", "_x0000_t75"}));
      n9s.n5(var4, var0.getFrame());
      o6n.n5(var4, var0.getSubstitutePictureFormat().getPicture().getImage(), var3);
      var4.n5("v", var2, "shape");
   }

   private static void n5(LegacyDiagram var0, int var1, com.aspose.slides.internal.n8e.u4 var2, n4i var3) {
      com.aspose.slides.internal.c8m.j8 var4 = var3.h0();
      t4i var5 = var0.n5();
      com.aspose.slides.internal.c8m.d9 var6 = var3.n5().a6();
      Dictionary$Enumerator var7 = var5.l6().iterator();

      try {
         while (var7.hasNext()) {
            KeyValuePair var8 = (KeyValuePair)var7.next();
            com.aspose.slides.internal.c8m.j8 var9 = var6.n5(
               com.aspose.slides.ms.System.d1.n5("/ppt/drawings/legacyDiagramText{0}.bin", new Object[]{var3.n5().z1()}),
               null,
               new com.aspose.slides.internal.c8m.q1(),
               (byte[])var8.getValue()
            );
            com.aspose.slides.internal.c8m.r7 var10 = var4.e2().l6(var9);
            ((com.aspose.slides.internal.k4y.b3e)var8.getKey()).n5(var10.a6());
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var7, IDisposable.class)) {
            var7.dispose();
         }
      }

      Dictionary$Enumerator var19 = var5.u3().iterator();

      try {
         while (var19.hasNext()) {
            KeyValuePair var20 = (KeyValuePair)var19.next();
            com.aspose.slides.internal.c8m.r7 var21 = var4.e2().l6((com.aspose.slides.internal.c8m.j8)var20.getValue());
            ((com.aspose.slides.internal.k4y.e6k)var20.getKey()).s7(var21.a6());
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var19, IDisposable.class)) {
            var19.dispose();
         }
      }

      var5.n5().l6(com.aspose.slides.ms.System.d1.n5("_x0000_s{0:D4}", new Object[]{var1}));
      var5.n5().n5("v", var2, "group");
   }

   private static void n5(com.aspose.slides.internal.n8e.u4 var0) {
      l7p var1 = new l7p();
      var1.z3("21600,21600");
      var1.l6("_x0000_t75");
      var1.n5(75.0F);
      var1.h0(1);
      var1.y4("m@4@5l@4@11@9@11@9@5xe");
      var1.k5(2);
      var1.a6(2);
      d1n var2 = (d1n)var1.u9("stroke").l6();
      var2.l6((byte)2);
      com.aspose.slides.internal.k4y.j2b var3 = (com.aspose.slides.internal.k4y.j2b)var1.u9("formulas").l6();
      var3.n5().n5("if lineDrawn pixelLineWidth 0");
      var3.n5().n5("sum @0 1 0");
      var3.n5().n5("sum 0 0 @1");
      var3.n5().n5("prod @2 1 2");
      var3.n5().n5("prod @3 21600 pixelWidth");
      var3.n5().n5("prod @3 21600 pixelHeight");
      var3.n5().n5("sum @0 0 1");
      var3.n5().n5("prod @6 1 2");
      var3.n5().n5("prod @7 21600 pixelWidth");
      var3.n5().n5("sum @8 21600 0");
      var3.n5().n5("prod @7 21600 pixelHeight");
      var3.n5().n5("sum @10 21600 0");
      t3k var4 = (t3k)var1.u9("path").l6();
      var4.a6(2);
      var4.k5(1);
      var4.u3(2);
      com.aspose.slides.internal.k4y.f1z var5 = (com.aspose.slides.internal.k4y.f1z)var1.u9("lock").l6();
      var5.n5(2);
      var5.a6(1);
      var1.n5("v", var0, "shapetype");
   }
}

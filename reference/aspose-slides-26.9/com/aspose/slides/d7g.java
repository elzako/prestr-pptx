package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericEnumerable;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.IGenericList;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.ms.System.IDisposable;

class d7g {
   private static final Dictionary<String, d7g$n5> n5 = new Dictionary<>();

   public static void n5(ShapeCollection var0, com.aspose.slides.internal.k4y.g7 var1, h6j var2) {
      if (var1 == null) {
         throw new ArgumentNullException("shape");
      }

      if (n5.containsKey(var1.n5())) {
         n5.get_Item(var1.n5()).n5(var0, var1.l6(), var2);
      }
   }

   private static Shape n3(ShapeCollection var0, Object var1, h6j var2) {
      com.aspose.slides.internal.k4y.e6x var3 = com.aspose.slides.internal.v6g.k5.n5(var1, com.aspose.slides.internal.k4y.e6x.class);
      if (var3 == null) {
         throw new InvalidOperationException();
      }

      com.aspose.slides.internal.o9b.y1 var4 = t2f.n5(var3.n5(), var3.l6(), var3.k5(), var3.u3()).y4();
      AutoShape var5 = (AutoShape)var0.addAutoShape(5, var4.x8(), var4.n3(), var4.s7(), var4.k5(), true);
      q4v var6 = new q4v(var3);
      l4t.n5((TextFrame)var5.getTextFrame(), var2);
      l4t.n5((TextFrame)var5.getTextFrame(), var6, var2);
      n5((TextFrame)var5.getTextFrame(), new q4v(var3), var3.y4(), var2, h2k.l6());
      n5(var5, var3.h0(), var2);
      n5(var5, var3.c8(), var2);
      n5((IShape)var5, var3.u9(), var2);
      if (t2f.k5(var3.t2())) {
         n5((Shape)var5, var3.t2(), var2);
      }

      n5(var3.s7(), var3.n3(), var5);
      n5(var3.a6(), var5, var2);
      return var5;
   }

   private static Shape y4(ShapeCollection var0, Object var1, h6j var2) {
      com.aspose.slides.internal.k4y.d2z var3 = com.aspose.slides.internal.v6g.k5.n5(var1, com.aspose.slides.internal.k4y.d2z.class);
      if (var3 == null) {
         throw new InvalidOperationException();
      }

      com.aspose.slides.internal.o9b.y1 var4 = t2f.n5(var3.n5(), var3.l6(), var3.k5(), var3.u3()).y4();
      AutoShape var5 = (AutoShape)var0.addAutoShape(35, var4.x8(), var4.n3(), var4.s7(), var4.k5(), true);
      q4v var6 = new q4v(var3);
      l4t.n5((TextFrame)var5.getTextFrame(), var2);
      l4t.n5((TextFrame)var5.getTextFrame(), var6, var2);
      n5((TextFrame)var5.getTextFrame(), new q4v(var3), var3.y4(), var2, h2k.l6());
      n5(var5, var3.h0(), var2);
      n5(var5, var3.c8(), var2);
      n5((IShape)var5, var3.u9(), var2);
      if (t2f.k5(var3.t2())) {
         n5((Shape)var5, var3.t2(), var2);
      }

      n5(var3.s7(), var3.n3(), var5);
      n5(var3.a6(), var5, var2);
      return var5;
   }

   private static Shape e2(ShapeCollection var0, Object var1, h6j var2) {
      com.aspose.slides.internal.k4y.f1h var3 = com.aspose.slides.internal.v6g.k5.n5(var1, com.aspose.slides.internal.k4y.f1h.class);
      if (var3 == null) {
         throw new InvalidOperationException();
      }

      com.aspose.slides.internal.o9b.y1 var4 = t2f.n5(var3.n5(), var3.l6(), var3.k5(), var3.u3()).y4();
      AutoShape var5 = (AutoShape)var0.addAutoShape(35, var4.x8(), var4.n3(), var4.s7(), var4.k5(), true);
      q4v var6 = new q4v(var3);
      l4t.n5((TextFrame)var5.getTextFrame(), var2);
      l4t.n5((TextFrame)var5.getTextFrame(), var6, var2);
      n5((TextFrame)var5.getTextFrame(), new q4v(var3), var3.y4(), var2, h2k.l6());
      n5(var5, var3.h0(), var2);
      n5(var5, var3.c8(), var2);
      n5((IShape)var5, var3.u9(), var2);
      if (t2f.k5(var3.t2())) {
         n5((Shape)var5, var3.t2(), var2);
      }

      n5(var3.s7(), var3.n3(), var5);
      n5(var3.a6(), var5, var2);
      return var5;
   }

   private static Shape t9(ShapeCollection var0, Object var1, h6j var2) {
      com.aspose.slides.internal.k4y.b4f var3 = com.aspose.slides.internal.v6g.k5.n5(var1, com.aspose.slides.internal.k4y.b4f.class);
      if (var3 == null) {
         throw new InvalidOperationException();
      }

      Shape var4 = n5(var0, var3, var2);
      if (var4 == null) {
         var4 = l6(var0, var3, var2);
      }

      Shape var5 = var4;
      return n5(var5, var3, var2);
   }

   private static Shape n5(Shape var0, com.aspose.slides.internal.k4y.b4f var1, h6j var2) {
      n5(var1, var0, var2);
      if (t2f.k5(var1.a6())) {
         n5(var0, var1.a6(), var2);
      }

      n5(var1.u9(), var1.t9(), var0);
      n5(var1.n5(), var0, var2);
      return var0;
   }

   private static void n5(Shape var0, String var1, h6j var2) {
      t4y var3 = new t4y(var1);
      v3q var4 = new v3q(var3);
      var4.n5(new v9d(var4, var0, var2));
      var4.n5();
   }

   private static Shape n5(ShapeCollection var0, com.aspose.slides.internal.k4y.b4f var1, h6j var2) {
      com.aspose.slides.internal.k4y.y7e var3 = t2f.n5(com.aspose.slides.internal.k4y.y7e.class, "table", var1.e2());
      if (var3 != null) {
         return n5(var0, var1, var3, var2);
      }

      com.aspose.slides.internal.k4y.j1a var4 = t2f.n5(com.aspose.slides.internal.k4y.j1a.class, "object-ole", var1.e2());
      if (var4 != null) {
         return j9j.n5(var0, var1, var4, var2.n5());
      }

      com.aspose.slides.internal.k4y.n6k var5 = t2f.n5(com.aspose.slides.internal.k4y.n6k.class, "object", var1.e2());
      if (var5 != null) {
         Chart var9 = z6e.n5(var0, var1, var5, var2.n5());
         return var9 != null ? var9 : j9j.n5(var0, var1, var5, var2.n5());
      }

      com.aspose.slides.internal.k4y.h9p var6 = t2f.n5(com.aspose.slides.internal.k4y.h9p.class, "plugin", var1.e2());
      if (var6 != null) {
         return (Shape)x2d.n5(var0, var1, var6, var2.n5());
      }

      com.aspose.slides.internal.k4y.s3o var7 = t2f.n5(com.aspose.slides.internal.k4y.s3o.class, "image", var1.e2());
      if (var7 != null) {
         Shape var8 = n5(var0, var1, var7, var2);
         if (com.aspose.slides.internal.v6g.k5.l6(var8, PictureFrame.class)) {
            n5((PictureFrame)var8, var7, var1.k5(), var2);
            n5((PictureFrame)var8, var7, var1.u3(), var2);
         } else {
            n5((AutoShape)var8, var1.k5(), var2);
            n5((AutoShape)var8, var1.u3(), var2);
         }

         n5((IShape)var8, var1.l6(), var2);
         return var8;
      } else {
         return null;
      }
   }

   private static Shape l6(ShapeCollection var0, com.aspose.slides.internal.k4y.b4f var1, h6j var2) {
      com.aspose.slides.internal.o9b.y1 var3 = t2f.n5(var1.c8(), var1.t2(), var1.s7(), var1.x8()).y4();
      AutoShape var4 = (AutoShape)var0.addAutoShape(5, var3.x8(), var3.n3(), var3.s7(), var3.k5(), false);
      var4.addTextFrame("");
      com.aspose.slides.internal.k4y.o2e var5 = n5(var1.e2());
      if (var5 != null) {
         q4v var6 = new q4v(var1);
         n5(var0, var4, var6, var5, var1, var2);
      }

      n5(var4, var1.k5(), var2);
      n5(var4, var1.u3(), var2);
      n5((IShape)var4, var1.l6(), var2);
      return var4;
   }

   public static void n5(
      ShapeCollection var0, AutoShape var1, q4v var2, com.aspose.slides.internal.k4y.o2e var3, com.aspose.slides.internal.k4y.b4f var4, h6j var5
   ) {
      var1.n5(true);
      l4t.n5((TextFrame)var1.getTextFrame(), var5);
      List var6 = null;
      List[] var7 = new List[]{var6};
      int var8 = n5(var3, var4, var5, var7);
      var6 = var7[0];
      List$Enumerator var9 = var6.iterator();

      try {
         while (var9.hasNext()) {
            com.aspose.slides.internal.k4y.g7 var10 = (com.aspose.slides.internal.k4y.g7)var9.next();
            com.aspose.slides.internal.k4y.u0y var11 = com.aspose.slides.internal.v6g.k5.n5(var10.l6(), com.aspose.slides.internal.k4y.u0y.class);
            if (var11 != null) {
               h2k var12 = h2k.n5(var2.n5(), 10);
               n5(var1, var2.n5(), var5);
               n5(var1.l6(), var2, var11, var5, var8, var12);
               if (var4.n3() == 2) {
                  n5(var1, var2, var5);
               }

               n5(var1, var2.l6(), var5);
            } else if (n5.containsKey(var10.n5())) {
               n5.get_Item(var10.n5()).n5(var0, var10.l6(), var5);
            } else if ("p".equals(var10.n5())) {
               h2k var17 = h2k.l6();
               if (t2f.k5(var2.n5())) {
                  var17 = h2k.n5(var2.n5(), 10);
               } else if (t2f.k5(var2.l6())) {
                  var17 = h2k.n5(var2.l6(), 9);
               }

               n5((TextFrame)var1.getTextFrame(), var2, com.aspose.slides.ms.System.u3.n5(new com.aspose.slides.internal.k4y.g7[]{var10}), var5, var17);
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var9, IDisposable.class)) {
            var9.dispose();
         }
      }
   }

   public static void n5(TextFrame var0, q4v var1, com.aspose.slides.internal.k4y.o2e var2, com.aspose.slides.internal.k4y.b4f var3, h6j var4) {
      l4t.n5(var0, var4);
      List var5 = null;
      List[] var6 = new List[]{var5};
      int var7 = n5(var2, var3, var4, var6);
      var5 = var6[0];
      List$Enumerator var8 = var5.iterator();

      try {
         while (var8.hasNext()) {
            com.aspose.slides.internal.k4y.g7 var9 = (com.aspose.slides.internal.k4y.g7)var8.next();
            com.aspose.slides.internal.k4y.u0y var10 = com.aspose.slides.internal.v6g.k5.n5(var9.l6(), com.aspose.slides.internal.k4y.u0y.class);
            if (var10 != null) {
               h2k var11 = h2k.n5(var1.n5(), 10);
               n5(var0, var1, var10, var4, var7, var11);
            } else if ("p".equals(var9.n5())) {
               n5(var0, var1, com.aspose.slides.ms.System.u3.n5(new com.aspose.slides.internal.k4y.g7[]{var9}), var4, h2k.n5(var1.n5(), 10));
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var8, IDisposable.class)) {
            var8.dispose();
         }
      }
   }

   private static int n5(
      com.aspose.slides.internal.k4y.o2e var0, com.aspose.slides.internal.k4y.b4f var1, h6j var2, List<com.aspose.slides.internal.k4y.g7>[] var3
   ) {
      byte var4 = 1;
      var3[0] = var0.n5();
      if (q5p.n5(var1, var0, var2.n5().n5().getDocumentProperties().getNameOfApplication())) {
         var3[0] = q5p.n5(var3[0]);
         var4 = 2;
      }

      return var4;
   }

   private static Shape n5(ShapeCollection var0, com.aspose.slides.internal.k4y.b4f var1, com.aspose.slides.internal.k4y.s3o var2, h6j var3) {
      com.aspose.slides.internal.o9b.y1 var4 = t2f.n5(var1.c8(), var1.t2(), var1.s7(), var1.x8()).y4();
      IPPImage var5 = null;
      if (t2f.k5(var2.l6())) {
         try {
            byte[] var6 = com.aspose.slides.ms.System.z3.s7(var2.l6());
            if (var6 != null && var6.length > 0) {
               var5 = var3.n5().n5().getImages().addImage(var6);
            }
         } catch (RuntimeException var10) {
            com.aspose.slides.internal.n8e.v4.n5(var10);
         }
      }

      if (var5 == null) {
         var5 = var3.n5().n5(var2.n5());
      }

      Shape var7;
      if (var5 != null) {
         var7 = (Shape)var0.addPictureFrame(5, var4.x8(), var4.n3(), var4.s7(), var4.k5(), var5);
         PictureFrame var11 = (PictureFrame)var7;
         var11.a6 = null;
         var11.getLineFormat().getFillFormat().setFillType((byte)0);
         ((Picture)var11.getPictureFormat().getPicture()).l6().n5(true);
      } else {
         var7 = var0.q0();
         var7.setFrame(new ShapeFrame(var4.x8(), var4.n3(), var4.s7(), var4.k5(), (byte)0, (byte)0, 0.0F));
         PictureFrame var12 = (PictureFrame)var7;
         var12.a6 = null;
         var12.setShapeType(5);
         var12.getLineFormat().getFillFormat().setFillType((byte)0);
         var12.getPictureFormat().setPictureFillMode(1);

         try {
            com.aspose.slides.ms.System.r8 var8 = new com.aspose.slides.ms.System.r8(var2.n5());
            ((Picture)var12.getPictureFormat().getPicture()).n5(var8.c8() ? var8.x8() : var8.l6());
         } catch (RuntimeException var9) {
            ((Picture)var12.getPictureFormat().getPicture()).n5(var2.n5());
            com.aspose.slides.internal.n8e.v4.n5(var9);
         }
      }

      return var7;
   }

   private static Shape n5(ShapeCollection var0, com.aspose.slides.internal.k4y.b4f var1, com.aspose.slides.internal.k4y.y7e var2, h6j var3) {
      Table var4 = (Table)c5h.n5(var0, var1, var2, var3);
      // The original call updates shape text; the Shape overload parses path data.
      n5((IShape)var4, var1.l6(), var3);
      return var4;
   }

   private static void n5(com.aspose.slides.internal.k4y.b4f var0, Shape var1, h6j var2) {
      if (n5(var0)) {
         byte var3 = q9k.a6.get_Item(var0.n3());
         if (com.aspose.slides.internal.v6g.k5.l6(var1, AutoShape.class) && (var3 == 0 || var3 == 3)) {
            TextFrame var4 = ((AutoShape)var1).l6();
            if (var4 != null) {
               if (var4.getTextFrameFormat().getAnchoringType() == -1) {
                  var4.getTextFrameFormat().setAnchoringType((byte)1);
               }

               IGenericEnumerator var5 = var4.getParagraphs().iterator();

               try {
                  while (var5.hasNext()) {
                     Paragraph var6 = (Paragraph)var5.next();
                     if (var6.getParagraphFormat().getAlignment() == -1) {
                        var6.getParagraphFormat().setAlignment(1);
                     }
                  }
               } finally {
                  if (com.aspose.slides.internal.v6g.k5.n5(var5, IDisposable.class)) {
                     var5.dispose();
                  }
               }
            }
         }

         Object var12 = null;
         if (!BaseSlideHeaderFooterManager.n5(var3)) {
            var2.u9().n5(var3);
         }

         long var8 = var2.u9().h0();
         Placeholder var7 = new Placeholder((byte)0, (byte)0, var3, var8, false);
         var1.n5(var7.getOrientation(), var7.getSize(), var7.getType(), var8, var7.l6());
         var2.u9().n5(var2.u9().h0() + 1L);
         var2.u9().u9().set_Item(var0.n3(), var1);
      }
   }

   private static boolean n5(com.aspose.slides.internal.k4y.b4f var0) {
      return var0.n3() != 0 && var0.n3() != 11;
   }

   private static Shape z1(ShapeCollection var0, Object var1, h6j var2) {
      com.aspose.slides.internal.k4y.j6v var3 = com.aspose.slides.internal.v6g.k5.n5(var1, com.aspose.slides.internal.k4y.j6v.class);
      if (var3 == null) {
         throw new InvalidOperationException();
      }

      float var4 = (float)t2f.u9(var3.n5());
      float var5 = (float)t2f.u9(var3.k5());
      float var6 = (float)t2f.u9(var3.l6());
      float var7 = (float)t2f.u9(var3.u3());
      com.aspose.slides.internal.o9b.y1 var8 = n5(var4, var5, var6, var7).y4();
      AutoShape var9 = (AutoShape)var0.addAutoShape(1, var8.x8(), var8.n3(), var8.s7(), com.aspose.slides.ms.System.q1.n5(var8.k5()), true);
      if (var8.k5() < 0.0F) {
         ShapeFrame var10 = var9.p8();
         var9.n5(new ShapeFrame(var10.getX(), var10.getY(), var10.getWidth(), var10.getHeight(), var10.getFlipH(), (byte)1, var10.getRotation()));
      }

      n5(var9, var3.h0(), var2);
      n5(var9, var3.c8(), var2);
      n5((IShape)var9, var3.u9(), var2);
      n5(var3.t2(), var3.s7(), var9);
      n5(var3.a6(), var9, var2);
      return var9;
   }

   private static com.aspose.slides.internal.o9b.y1 n5(float var0, float var1, float var2, float var3) {
      float var4 = var2 > var3 ? var1 : var0;
      float var5 = var2 > var3 ? var3 : var2;
      float var6 = var2 > var3 ? var0 - var1 : var1 - var0;
      float var7 = var3 - var2;
      if (var7 < 0.0F && var6 < 0.0F) {
         var4 += var6;
         var6 *= -1.0F;
      }

      return new com.aspose.slides.internal.o9b.y1(var4, var5, var6, var7);
   }

   private static Shape t4(ShapeCollection var0, Object var1, h6j var2) {
      com.aspose.slides.internal.k4y.c5w var3 = com.aspose.slides.internal.v6g.k5.n5(var1, com.aspose.slides.internal.k4y.c5w.class);
      if (var3 == null) {
         throw new InvalidOperationException();
      }

      com.aspose.slides.internal.o9b.y1 var4 = t2f.n5(var3.l6(), var3.k5(), var3.u3(), var3.a6()).y4();
      AutoShape var5 = (AutoShape)var0.addAutoShape(0, var4.x8(), var4.n3(), var4.s7(), var4.k5(), true);
      u7v.n5(var5, var3, var2);
      n5(var5, var3.t2(), var2);
      n5(var5, var3.s7(), var2);
      n5((IShape)var5, var3.c8(), var2);
      if (t2f.k5(var3.x8())) {
         n5((Shape)var5, var3.x8(), var2);
      }

      n5(var3.n3(), var3.y4(), var5);
      n5(var3.h0(), var5, var2);
      return var5;
   }

   private static Shape q0(ShapeCollection var0, Object var1, h6j var2) {
      com.aspose.slides.internal.k4y.s4p var3 = com.aspose.slides.internal.v6g.k5.n5(var1, com.aspose.slides.internal.k4y.s4p.class);
      if (var3 == null) {
         throw new InvalidOperationException();
      }

      com.aspose.slides.internal.o9b.y1 var4 = t2f.n5(var3.l6(), var3.k5(), var3.u3(), var3.a6()).y4();
      AutoShape var5 = (AutoShape)var0.addAutoShape(1, var4.x8(), var4.n3(), var4.s7(), var4.k5(), true);
      u7v.n5(var5, var3);
      n5(var5, var3.t2(), var2);
      n5(var5, var3.s7(), var2);
      n5((IShape)var5, var3.c8(), var2);
      if (t2f.k5(var3.x8())) {
         n5((Shape)var5, var3.x8(), var2);
      }

      n5(var3.n3(), var3.y4(), var5);
      n5(var3.h0(), var5, var2);
      return var5;
   }

   private static Shape z3(ShapeCollection var0, Object var1, h6j var2) {
      com.aspose.slides.internal.k4y.g3c var3 = com.aspose.slides.internal.v6g.k5.n5(var1, com.aspose.slides.internal.k4y.g3c.class);
      if (var3 == null) {
         throw new InvalidOperationException();
      }

      Shape var4 = e3j.n5(var0, var3, var2);
      if (t2f.k5(var3.s7())) {
         n5(var4, var3.s7(), var2);
      }

      n5(var3.x8(), var3.y4(), var4);
      n5(var3.u9(), var4, var2);
      return var4;
   }

   private static Shape m1(ShapeCollection var0, Object var1, h6j var2) {
      com.aspose.slides.internal.k4y.l3d var3 = com.aspose.slides.internal.v6g.k5.n5(var1, com.aspose.slides.internal.k4y.l3d.class);
      if (var3 == null) {
         throw new InvalidOperationException();
      }

      Shape var4 = w2i.n5(var0, var3, var2);
      n5((IShape)var4, var3.x8(), var2);
      n5(var3.y4(), var3.e2(), var4);
      n5(var3.s7(), var4, var2);
      return var4;
   }

   private static Shape k7(ShapeCollection var0, Object var1, h6j var2) {
      com.aspose.slides.internal.k4y.c4f var3 = com.aspose.slides.internal.v6g.k5.n5(var1, com.aspose.slides.internal.k4y.c4f.class);
      if (var3 == null) {
         throw new InvalidOperationException();
      }

      GroupShape var4 = (GroupShape)var0.addGroupShape();
      n5(var3.n5(), var3.k5(), var4);
      n5(var3.l6(), var4, var2);
      List$Enumerator var5 = var3.u3().iterator();

      try {
         while (var5.hasNext()) {
            com.aspose.slides.internal.k4y.g7 var6 = (com.aspose.slides.internal.k4y.g7)var5.next();
            n5((ShapeCollection)var4.getShapes(), var6, var2);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var5, IDisposable.class)) {
            var5.dispose();
         }
      }

      return null;
   }

   private static Shape m3(ShapeCollection var0, Object var1, h6j var2) {
      com.aspose.slides.internal.k4y.s4p var3 = com.aspose.slides.internal.v6g.k5.n5(var1, com.aspose.slides.internal.k4y.s4p.class);
      if (var3 == null) {
         throw new InvalidOperationException();
      }

      com.aspose.slides.internal.o9b.y1 var4 = t2f.n5(var3.l6(), var3.k5(), var3.u3(), var3.a6()).y4();
      AutoShape var5 = (AutoShape)var0.addAutoShape(1, var4.x8(), var4.n3(), var4.s7(), var4.k5(), true);
      u7v.n5(var5, var3);
      n5(var5, var3.t2(), var2);
      n5((IShape)var5, var3.c8(), var2);
      n5(var3.h0(), var5, var2);
      return var5;
   }

   public static void n5(TextFrame var0, q4v var1, IGenericList<com.aspose.slides.internal.k4y.g7> var2, h6j var3, h2k var4) {
      l4t.n5(var0, var1, var2, null, 0, var3, var4);
   }

   private static void n5(TextFrame var0, q4v var1, com.aspose.slides.internal.k4y.u0y var2, h6j var3, int var4, h2k var5) {
      if (var1 == null) {
         throw new ArgumentNullException("propertiesProviderContext");
      }

      if (var2 == null) {
         throw new ArgumentNullException("listElementData");
      }

      l4t.n5(var0, var1, var3);
      com.aspose.slides.internal.k4y.a8r var6 = var3.u3().containsKey(var2.k5()) ? var3.u3().get_Item(var2.k5()) : null;
      if (var2.u3() != null) {
         n5(var0, var2, var6, var3, var5);
      }

      e5f.n5(var0, var1, var2, var6, var4, var3, var5);
   }

   public static void n5(TextFrame var0, com.aspose.slides.internal.k4y.u0y var1, com.aspose.slides.internal.k4y.a8r var2, h6j var3, h2k var4) {
      if (var0 == null) {
         throw new ArgumentNullException("textFrame");
      }

      if (var1 == null) {
         throw new ArgumentNullException("listElement");
      }

      if (var1.u3() == null) {
         throw new InvalidOperationException();
      }

      Object[] var5 = t2f.n5("p", var1.u3().n5());
      com.aspose.slides.internal.k4y.u1x[] var6 = new com.aspose.slides.internal.k4y.u1x[var5.length];

      for (int var7 = 0; var7 < var5.length; var7++) {
         var6[var7] = (com.aspose.slides.internal.k4y.u1x)var5[var7];
      }

      for (com.aspose.slides.internal.k4y.u1x var10 : var6) {
         if (var10 == null) {
            throw new InvalidOperationException();
         }

         Paragraph var11 = l4t.n5(var0, var10, var2, var3, var4);
         l4t.n5(var11, var2, 1, var3);
         var11.getParagraphFormat().getBullet().setType((byte)1);
         var11.getParagraphFormat().getBullet().setChar(' ');
      }
   }

   public static void n5(AutoShape var0, q4v var1, h6j var2) {
      if (t2f.k5(var1.n5())) {
         n7n.n5(var0, var1, var2);
      }
   }

   public static void n5(AutoShape var0, String var1, h6j var2) {
      if (t2f.k5(var1)) {
         n7n.n5(var0, var1, var2);
      }
   }

   public static void n5(PictureFrame var0, com.aspose.slides.internal.k4y.s3o var1, String var2, h6j var3) {
      if (t2f.k5(var2)) {
         n7n.n5(var0, var1, var2, var3);
      }
   }

   public static void n5(IShape var0, String var1, h6j var2) {
      if (t2f.k5(var1) && var2.l6().x8().containsKey(var1)) {
         com.aspose.slides.internal.k4y.v1p var3 = var2.l6().x8().get_Item(var1);
         if (var3.l6() == 4) {
            var0.setHidden(true);
         }
      }
   }

   public static com.aspose.slides.internal.k4y.o2e n5(IGenericEnumerable<com.aspose.slides.internal.k4y.g7> var0) {
      com.aspose.slides.internal.k4y.o2e var1 = null;
      IGenericEnumerator var2 = var0.iterator();

      try {
         while (var2.hasNext()) {
            com.aspose.slides.internal.k4y.g7 var3 = (com.aspose.slides.internal.k4y.g7)var2.next();
            var1 = com.aspose.slides.internal.v6g.k5.n5(var3.l6(), com.aspose.slides.internal.k4y.o2e.class);
            if (var1 != null) {
               break;
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }

      return var1;
   }

   private static void n5(String var0, Shape var1, h6j var2) {
      if (t2f.k5(var0)) {
         var2.h0().addItem(var0, var1);
      }
   }

   private static void n5(String var0, String var1, Shape var2) {
      if (t2f.k5(var0)) {
         var2.setName(var0);
      }

      if (t2f.k5(var1)) {
         var2.setAlternativeText(var1);
      }
   }

   // $VF: synthetic method
   static Shape n5(ShapeCollection var0, Object var1, h6j var2) {
      return n3(var0, var1, var2);
   }

   // $VF: synthetic method
   static Shape l6(ShapeCollection var0, Object var1, h6j var2) {
      return y4(var0, var1, var2);
   }

   // $VF: synthetic method
   static Shape k5(ShapeCollection var0, Object var1, h6j var2) {
      return e2(var0, var1, var2);
   }

   // $VF: synthetic method
   static Shape u3(ShapeCollection var0, Object var1, h6j var2) {
      return t9(var0, var1, var2);
   }

   // $VF: synthetic method
   static Shape a6(ShapeCollection var0, Object var1, h6j var2) {
      return z1(var0, var1, var2);
   }

   // $VF: synthetic method
   static Shape u9(ShapeCollection var0, Object var1, h6j var2) {
      return t4(var0, var1, var2);
   }

   // $VF: synthetic method
   static Shape h0(ShapeCollection var0, Object var1, h6j var2) {
      return q0(var0, var1, var2);
   }

   // $VF: synthetic method
   static Shape c8(ShapeCollection var0, Object var1, h6j var2) {
      return z3(var0, var1, var2);
   }

   // $VF: synthetic method
   static Shape t2(ShapeCollection var0, Object var1, h6j var2) {
      return m1(var0, var1, var2);
   }

   // $VF: synthetic method
   static Shape s7(ShapeCollection var0, Object var1, h6j var2) {
      return k7(var0, var1, var2);
   }

   // $VF: synthetic method
   static Shape x8(ShapeCollection var0, Object var1, h6j var2) {
      return m3(var0, var1, var2);
   }

   static {
      n5.set_Item("rect", new d7g$1());
      n5.set_Item("ellipse", new d7g$4());
      n5.set_Item("circle", new d7g$5());
      n5.set_Item("frame", new d7g$6());
      n5.set_Item("line", new d7g$7());
      n5.set_Item("path", new d7g$8());
      n5.set_Item("polygon", new d7g$9());
      n5.set_Item("custom-shape", new d7g$10());
      n5.set_Item("connector", new d7g$11());
      n5.set_Item("g", new d7g$2());
      n5.set_Item("table:table", new d7g$3());
   }
}

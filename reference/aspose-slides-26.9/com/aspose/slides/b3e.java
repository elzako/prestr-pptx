package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.Dictionary$Enumerator;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.k4y.g7$n5;
import com.aspose.slides.ms.System.IDisposable;

class b3e {
   public static void n5(TextFrame var0, g7$n5 var1, String var2, x0a var3) {
      if (var0 == null) {
         throw new ArgumentNullException("textFrame");
      }

      if (var1 == null) {
         throw new ArgumentNullException("addTextElements");
      }

      com.aspose.slides.internal.k4y.y2i var4 = var3.k5().get_Item(var2);
      n5(var0, var4);
      n5(var0, var1, var3);
   }

   public static boolean n5(Paragraph var0, byte[] var1) {
      if (var0.n5().l6().t2() && var0.n5().l6().getType() > 0) {
         var1[0] = var0.n5().l6().getType();
         return true;
      } else {
         IParagraphFormatEffectiveData var2 = var0.n5().getEffective();
         var1[0] = var2.getBullet().getType();
         return var1[0] > 0;
      }
   }

   public static void n5(TextFrame var0, com.aspose.slides.internal.k4y.o2e var1, com.aspose.slides.internal.k4y.b4f var2, x0a var3) {
      if (var0 == null) {
         throw new ArgumentNullException("textFrame");
      }

      if (var2 == null) {
         throw new ArgumentNullException("frameElement");
      }

      com.aspose.slides.internal.k4y.y2i var4 = var3.n5("pr", 10);
      var2.k5(var4.n5());
      h9z var5 = var0.s7().d2();
      if (!var5.n3()) {
         com.aspose.slides.internal.k4y.y2i var6 = var3.n5("P", 2);
         var2.u9(var6.n5());
         com.aspose.slides.internal.k4y.v5n var7 = (com.aspose.slides.internal.k4y.v5n)var6.n5("paragraph-properties").l6();
         var7.n5((byte)1);
      }

      n5(var0, var4);
      n5(var0, new b3e$1(var1), var3);
   }

   static int n5(byte var0) {
      switch (var0) {
         case 0:
            return 1;
         case 1:
            return 2;
         case 2:
            return 3;
         case 3:
            return 4;
         default:
            return 0;
      }
   }

   private static void n5(TextFrame var0, g7$n5 var1, x0a var2) {
      if (var0.getParagraphs().getCount() != 0) {
         Dictionary var3 = new Dictionary();
         com.aspose.slides.internal.k4y.u0y var4 = null;
         byte var5 = -1;
         boolean var6 = com.aspose.slides.internal.v6g.k5.l6(var0.k5(), Cell.class);
         IGenericEnumerator var7 = var0.getParagraphs().iterator();

         try {
            while (var7.hasNext()) {
               Paragraph var8 = (Paragraph)var7.next();
               byte var9 = 0;
               byte[] var10 = new byte[]{0};
               boolean var11 = n5(var8, var10);
               var9 = var10[0];
               short var12 = 0;
               if (!var11 || var4 != null && var4.a6().length != 0 && (var5 == -1 || var9 == var5)) {
                  if (var11) {
                     if ((Short)var3.get_Item(var4) < var8.getParagraphFormat().getDepth()) {
                        com.aspose.slides.internal.k4y.b2k var13 = var4.a6()[var4.a6().length - 1];
                        var4 = (com.aspose.slides.internal.k4y.u0y)var13.n5("list").l6();
                        var3.set_Item(var4, var8.getParagraphFormat().getDepth());
                     } else if ((Short)var3.get_Item(var4) > var8.getParagraphFormat().getDepth()) {
                        var4 = n5(var8.getParagraphFormat().getDepth(), var3);
                     }

                     var12 = var4 == null ? 0 : (Short)var3.get_Item(var4);
                  } else {
                     var4 = null;
                  }
               } else {
                  var4 = (com.aspose.slides.internal.k4y.u0y)var1.n5("list").l6();
                  var3.clear();
                  var3.set_Item(var4, var8.getParagraphFormat().getDepth());
               }

               com.aspose.slides.internal.k4y.u0y[] var18 = new com.aspose.slides.internal.k4y.u0y[]{var4};
               w3t.n5(var8, var0, var6, var18, var12 + 1, var1, var2);
               var4 = var18[0];
               if (var4 != null) {
                  var3.set_Item(var4, var8.getParagraphFormat().getDepth());
               }

               var5 = var9;
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var7, IDisposable.class)) {
               var7.dispose();
            }
         }
      }
   }

   private static com.aspose.slides.internal.k4y.u0y n5(short var0, Dictionary<com.aspose.slides.internal.k4y.u0y, Short> var1) {
      com.aspose.slides.internal.k4y.u0y var2 = null;
      List var3 = new List();
      Dictionary$Enumerator var4 = var1.iterator();

      try {
         while (var4.hasNext()) {
            KeyValuePair var5 = (KeyValuePair)var4.next();
            if ((Short)var5.getValue() == var0) {
               var2 = (com.aspose.slides.internal.k4y.u0y)var5.getKey();
            } else if ((Short)var5.getValue() > var0) {
               var3.addItem(var5.getKey());
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      List$Enumerator var14 = var3.iterator();

      try {
         while (var14.hasNext()) {
            com.aspose.slides.internal.k4y.u0y var6 = (com.aspose.slides.internal.k4y.u0y)var14.next();
            var1.removeItemByKey(var6);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var14, IDisposable.class)) {
            var14.dispose();
         }
      }

      return var2;
   }

   private static void n5(TextFrame var0, com.aspose.slides.internal.k4y.y2i var1) {
      boolean var2 = false;
      com.aspose.slides.internal.k4y.p3w var3 = t2f.n5(com.aspose.slides.internal.k4y.p3w.class, "graphic-properties", var1.u3());
      if (var3 == null) {
         var3 = new com.aspose.slides.internal.k4y.p3w();
      }

      com.aspose.slides.internal.k4y.p3w var4 = var3;
      h9z var5 = var0.s7().d2();
      int var6 = n5(var5.getAnchoringType());
      if (var6 != 0) {
         var4.l6(var6);
         var2 = true;
      }

      double var7 = var5.getMarginLeft();
      double var9 = var5.getMarginTop();
      double var11 = var5.getMarginRight();
      double var13 = var5.getMarginBottom();
      GeometryShape var15 = com.aspose.slides.internal.v6g.k5.n5(var0.k5(), GeometryShape.class);
      if (var15 != null) {
         s9 var16 = com.aspose.slides.internal.v6g.k5.n5(((GeometryShape)var0.k5()).u9(), s9.class);
         if (var16 != null && var16.h0() != null) {
            e4c var17 = new e4c();
            e4c var18 = new e4c();
            x4t var19 = new x4t();
            e4c[] var20 = new e4c[]{var17};
            e4c[] var21 = new e4c[]{var18};
            x4t[] var22 = new x4t[]{var19};
            z5b.n5(var16.h0(), var20, var21, var22);
            var20[0].l6(var17);
            var21[0].l6(var18);
            var22[0].n5(var19);
            l3f var23 = new l3f();
            var17.a6().n5(var23.n5);
            var18.a6().n5(var23.l6);
            l3f var24 = var15.e5().n5(var23).l6();
            IShapeFrame var25 = var15.getFrame();
            var7 += var24.n5.n5 - var25.getX();
            var9 += var24.n5.l6 - var25.getY();
            var11 += var25.getX() + var25.getWidth() - (var24.n5.n5 + var24.l6.n5);
            var13 += var25.getY() + var25.getHeight() - (var24.n5.l6 + var24.l6.l6);
         }
      }

      if (!com.aspose.slides.ms.System.d2.k5(var7)) {
         var4.m3(t2f.l6(var7));
         var2 = true;
      }

      if (!com.aspose.slides.ms.System.d2.k5(var11)) {
         var4.z8(t2f.l6(var11));
         var2 = true;
      }

      if (!com.aspose.slides.ms.System.d2.k5(var9)) {
         var4.m1(t2f.l6(var9));
         var2 = true;
      }

      if (!com.aspose.slides.ms.System.d2.k5(var13)) {
         var4.k7(t2f.l6(var13));
         var2 = true;
      }

      if (var5.getWrapText()) {
         var4.u3(2);
         var2 = true;
      } else {
         var4.u3(1);
         var2 = true;
      }

      if (!com.aspose.slides.internal.v6g.k5.l6(var0.k5(), Cell.class) && var5.getTextVerticalType() == 1) {
         com.aspose.slides.internal.k4y.v5n var32 = t2f.n5(com.aspose.slides.internal.k4y.v5n.class, "paragraph-properties", var1.u3(), new b3e$2(var1));
         var32.u3(3);
         var2 = true;
      }

      if (var2) {
         com.aspose.slides.internal.k4y.p3w var33 = t2f.n5(com.aspose.slides.internal.k4y.p3w.class, "graphic-properties", var1.u3());
         if (var33 == null) {
            var1.n5(new com.aspose.slides.internal.k4y.g7("graphic-properties", var4));
         }
      }
   }
}

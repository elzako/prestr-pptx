package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

class x5n {
   private final e2n k5;
   private final m4i u3;
   private final w7c a6;
   public final TextFrame n5;
   private Dictionary<String, com.aspose.slides.internal.g7.u0a> u9;
   private float h0 = 1.0F;
   private MathPortion c8;
   public final boolean l6;

   final Dictionary<String, com.aspose.slides.internal.g7.u0a> n5() {
      return this.u9;
   }

   public x5n(e2n var1, w7c var2, TextFrame var3, m4i var4) {
      this.k5 = var1;
      this.u3 = var4;
      this.c8 = (MathPortion)var4.k5;
      this.u9 = new Dictionary<>();
      com.aspose.slides.internal.o9b.n3 var5 = t1g.n5();
      if (!this.n5().containsKey(var5.h0())) {
         com.aspose.slides.internal.g7.u0a var6 = ((Presentation)var4.k5.s7().getPresentation()).n5();
         if (var6 != null) {
            this.n5().addItem(var5.h0(), var6);
         }
      }

      this.a6 = var2;
      this.n5 = var3;
      h9z var7 = this.n5.s7().d2();
      this.l6 = var7.getWrapText();
   }

   public final List<r1f> l6() {
      y9t var1 = this.n5(this.c8, this.u3, this.k5.n5);
      r1f var2 = new r1f(var1);
      var2.l6(((MathParagraph)this.c8.getMathParagraph()).n5());
      return n5(var2, this.l6, new char[]{'='});
   }

   final y9t n5(MathPortion var1, m4i var2, t3x var3) {
      w1g var4 = new w1g();
      var4.a6 = Float.NaN;
      var4.n3 = 1.0F;
      var4.y4 = 1.0F;
      MathParagraph var5 = (MathParagraph)var1.getMathParagraph();
      List var6 = new List();
      IGenericEnumerator var7 = var5.iterator();

      try {
         while (var7.hasNext()) {
            IMathBlock var8 = (IMathBlock)var7.next();
            var6.addItem(var8);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var7, IDisposable.class)) {
            var7.dispose();
         }
      }

      for (int var19 = 0; var19 < var6.size(); var19++) {
         IMathElement var9 = (IMathElement)var6.get_Item(var19);
         if (com.aspose.slides.internal.v6g.k5.l6(var9, MathematicalText.class)) {
            MathematicalText var10 = (MathematicalText)var9;
            var4.a6 = var10.getFormat().getFontHeight() * this.k5();
            if (!com.aspose.slides.ms.System.n1.k5(var4.a6)) {
               break;
            }
         }

         var6.addRange(com.aspose.slides.ms.System.u3.n5(var9.getChildren()));
      }

      if (com.aspose.slides.ms.System.n1.k5(var4.a6)) {
         IPortionFormat var14 = var1.getPortionFormat();
         c9g var16 = (c9g)var14.getEffective();
         var4.a6 = var16.getFontHeight();
      }

      if (com.aspose.slides.ms.System.n1.k5(var4.a6)) {
         var4.a6 = 18.0F;
      }

      com.aspose.slides.internal.o9b.c8 var17 = ((f6a)var2.n5.getFillFormat()).h0().o8();
      com.aspose.slides.internal.o9b.i1 var15 = new com.aspose.slides.internal.o9b.i1(var17.o8());
      x5n$1 var18 = new x5n$1(this, var1, var15, var5);
      x5n$2 var20 = new x5n$2(this);
      boolean var21 = ((g9)var3.getBullet()).n5();
      x5n[] var22 = new x5n[]{this};
      a1w var11 = new a1w(var5, var4.a6, var20, var18, new x5n$3(this, var22, var2), var21);
      var11.n5(TextFrame.n5(this.n5));
      var11.u9 = (Presentation)var1.s7().getPresentation();
      return new y9t(var5, var3, var11, var4.n5());
   }

   private float k5() {
      Paragraph var1 = this.k5.l6;
      TextFrame var2 = var1.x8().k5();
      TextFrameFormat var3 = (TextFrameFormat)var2.getTextFrameFormat();
      return com.aspose.slides.ms.System.n1.k5(var3.n3()) ? 1.0F : var3.n3();
   }

   private com.aspose.slides.internal.o9b.n3 n5(MathematicalText var1, byte var2, float var3, Portion var4) {
      IPortionFormat var5 = var1.getFormat();
      if (var2 == 3) {
         FontData var10 = (FontData)var5.getSymbolFont();
         if (var10 == null) {
            var10 = (FontData)var5.getLatinFont();
         }

         c9g var11 = (c9g)var5.getEffective();
         TextParam var12 = this.a6.l6(null, var4, var11, var10, this.h0);
         com.aspose.slides.internal.o9b.n3 var9 = var12.d2().n5();
         if (!this.n5().containsKey(var9.h0())) {
            this.n5(var12.d2().l6().n5());
         }

         if (var9.u9()) {
            var9 = new com.aspose.slides.internal.o9b.n3(var9, 0);
         }

         return var9;
      } else {
         com.aspose.slides.internal.o9b.n3 var6;
         if (var5.getLatinFont() != null && var2 != 1) {
            c9g var7 = (c9g)var5.getEffective();
            TextParam var8 = this.a6.n5(null, var4, var7, (FontData)var5.getLatinFont(), this.h0);
            var6 = var8.d2().n5();
            if (!this.n5().containsKey(var6.h0())) {
               this.n5(var8.d2().l6().n5());
            }

            if (var8.s7() && !var6.u9()) {
               var6 = t1g.n5();
            }
         } else {
            var6 = t1g.n5();
         }

         return com.aspose.slides.internal.o9b.n3.n5(var6.l6(), var3, 0);
      }
   }

   private void n5(com.aspose.slides.internal.e1x.i1 var1) {
      com.aspose.slides.internal.g7.c0 var2 = new com.aspose.slides.internal.g7.c0(
         new com.aspose.slides.internal.g7.m3(com.aspose.slides.internal.n2d.t4.l6(var1.y1().l6()))
      );
      com.aspose.slides.internal.g7.n2[] var3 = var2.n5();

      for (int var4 = 0; var4 < var3.length; var4++) {
         if (com.aspose.slides.ms.System.d1.a6(var3[var4].n5(), var1.n5())) {
            com.aspose.slides.internal.g7.r5t var5 = new com.aspose.slides.internal.g7.r5t();
            this.n5().addItem(var1.n5(), (com.aspose.slides.internal.g7.u0a)var5.n5(var3[var4]));
         }
      }
   }

   static List<r1f> n5(r1f var0, boolean var1, char[] var2) {
      float var3 = 0.0F;
      float var4 = Float.MAX_VALUE;
      float var5 = 0.0F;
      List var6 = new List();
      boolean var7 = false;
      boolean[] var8 = new boolean[]{false};
      r1f var9 = n5(var0, var2, var8);
      var7 = var8[0];
      if (var9 == null) {
         return var6;
      }

      if (var1 && var9.u3.n5.length <= 1 && var7) {
         List var10 = new List();

         for (e8s var14 : var9.u3.n5) {
            MathBlock var15 = new MathBlock();
            var10.clear();

            for (int var16 = 0; var16 < var14.h0.size(); var16++) {
               e8s var17 = var14.h0.get_Item(var16);
               var17.k5(new d2k());
               if (var17.c8() || var16 == var14.h0.size() - 1) {
                  if (!var9.u3() || var16 == var14.h0.size() - 1) {
                     var10.addItem(var17);
                  }

                  List$Enumerator var18 = var10.iterator();

                  try {
                     while (var18.hasNext()) {
                        e8s var19 = (e8s)var18.next();
                        var15.join(new MathBlock(var19.t2, true));
                     }
                  } finally {
                     if (com.aspose.slides.internal.v6g.k5.n5(var18, IDisposable.class)) {
                        var18.dispose();
                     }
                  }

                  MathParagraph var33 = new MathParagraph(var15);
                  var33.n5(var9.u3());
                  var33.setJustification(var9.u3.k5.getJustification());
                  MathPortion var20 = new MathPortion(var33);
                  y9t var21 = n5(var20, var9.u3);
                  r1f var22 = new r1f(var21, var33.getJustification());
                  var22.n5(var9.a6());
                  var22.n5(new d2k(), false, 0.0F);
                  var22.n5(var22.u3.l6().n5);
                  if (var4 > var22.u3.n5[0].h0().n5) {
                     var4 = var22.u3.n5[0].h0().n5;
                  }

                  var5 = com.aspose.slides.ms.System.q1.n5((float)(var5), (float)(var22.l6()));
                  var6.addItem(var22);
                  var15 = new MathBlock();
                  var10 = new List();
                  if (!var9.u3()) {
                     continue;
                  }
               }

               var10.addItem(var17);
            }
         }

         if (var6.size() > 1) {
            List$Enumerator var31 = var6.iterator();

            try {
               while (var31.hasNext()) {
                  r1f var32 = (r1f)var31.next();
                  var32.n5(true);
                  if (var0.u3.k5.getJustification() == 4 && var0.u3()) {
                     var32.n5(var5);
                  }
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var31, IDisposable.class)) {
                  var31.dispose();
               }
            }
         }

         return var6;
      } else {
         var9.n5(new d2k(), false, 0.0F);
         var9.n5(var9.u3.l6().n5);
         var6.addItem(var9);
         return var6;
      }
   }

   static r1f n5(r1f var0, char[] var1, boolean[] var2) {
      var2[0] = false;
      if (var0 == null) {
         return var0;
      }

      for (e8s var6 : var0.u3.n5) {
         for (int var7 = 0; var7 < var6.h0.size(); var7++) {
            b4i var8 = com.aspose.slides.internal.v6g.k5.n5(var6.h0.get_Item(var7), b4i.class);
            if (var8 != null) {
               String var9 = var8.n5;
               int var10 = com.aspose.slides.ms.System.d1.n5(var9, var1);
               if (var10 == 0) {
                  var2[0] = true;
                  var8.n5(true);
               }

               if (var10 >= 0 && var9.length() > 1) {
                  int var11 = 0;
                  String var12 = com.aspose.slides.ms.System.d1.l6(var9, 0, var10);
                  String var13 = com.aspose.slides.ms.System.d1.l6(var9, var10, 1);
                  String var14 = com.aspose.slides.ms.System.d1.k5(var9, var10 + 1);
                  if (!com.aspose.slides.ms.System.d1.n5(var12)) {
                     MathematicalText var15 = new MathematicalText(var12, var8.l6().getFormat());
                     b4i var16 = new b4i(var15, var8.a6(), var8.u9.n5(), var12);
                     var6.s7.insertItem(var7 + var11++, var16);
                  }

                  if (!com.aspose.slides.ms.System.d1.n5(var13)) {
                     MathematicalText var17 = new MathematicalText(var13, var8.l6().getFormat());
                     b4i var19 = new b4i(var17, var8.a6(), var8.u9.n5(), var13);
                     var2[0] = true;
                     var19.n5(true);
                     var6.s7.insertItem(var7 + var11++, var19);
                  }

                  if (!com.aspose.slides.ms.System.d1.n5(var14)) {
                     MathematicalText var18 = new MathematicalText(var14, var8.l6().getFormat());
                     b4i var20 = new b4i(var18, var8.a6(), var8.u9.n5(), var14);
                     var6.s7.insertItem(var7 + var11++, var20);
                  }

                  if (var11 > 0) {
                     var6.s7.removeAt(var7 + var11);
                  }
               }
            }
         }
      }

      return var0;
   }

   static y9t n5(MathPortion var0, y9t var1) {
      MathParagraph var2 = (MathParagraph)var0.getMathParagraph();
      return new y9t(var2, var1.n5(), var1.l6, var1.u3.n5());
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.o9b.n3 n5(x5n var0, MathematicalText var1, byte var2, float var3, Portion var4) {
      return var0.n5(var1, var2, var3, var4);
   }
}

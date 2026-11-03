package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.ms.System.IDisposable;

class c8e {
   static final String[] n5 = new String[0];
   private final IHtmlFormattingController l6;
   private final x8z k5;
   private final c8e$n5 u3;
   private final String[] a6;

   public c8e(x8z var1, String[] var2) {
      this.k5 = var1;
      this.a6 = var2;
      this.l6 = HtmlFormatter.n5(null, true);
      this.u3 = new c8e$1(this);
   }

   public c8e(x8z var1, String[] var2, c8e$n5 var3) {
      this.k5 = var1;
      this.l6 = HtmlFormatter.n5(null, true);
      this.u3 = var3;
      this.a6 = var2;
   }

   public c8e(IHtmlFormattingController var1, String[] var2, x8z var3) {
      this.l6 = var1;
      this.k5 = var3;
      this.a6 = var2;
      this.u3 = new c8e$2(this);
   }

   public final String[] n5() {
      return this.a6;
   }

   public final void n5(IHtmlGenerator var1, IPresentation var2) {
      this.l6.writeDocumentStart(var1, var2);
   }

   public final void l6(IHtmlGenerator var1, IPresentation var2) {
      Presentation var3 = (Presentation)var2;
      e6s var4 = ((FontsManager)var3.getFontsManager()).l6().n5();
      if (var4 != null) {
         this.n5(var1, var4);
      }
   }

   public final void k5(IHtmlGenerator var1, IPresentation var2) {
      Presentation var3 = (Presentation)var2;
      m6q var4 = new m6q(var3);

      j0v[] var5;
      try {
         var5 = var4.n5(((HtmlGenerator)var1).a6());
      } finally {
         if (var4 != null) {
            var4.dispose();
         }
      }

      for (j0v var9 : var5) {
         if (com.aspose.slides.internal.n8e.v4.n5(this.a6, new c8e$3(this, var9)) == -1) {
            String var10 = null;
            String var11 = null;
            String[] var12 = new String[]{var10};
            String[] var13 = new String[]{var11};
            boolean var14 = !n5(var9.n5().l6(), var12, var13);
            var10 = var12[0];
            var11 = var13[0];
            if (!var14) {
               com.aspose.slides.internal.z0k.t4 var15 = var9.n5().n5().y1().l6();

               byte[] var17;
               try {
                  com.aspose.slides.internal.z0k.e2 var16 = new com.aspose.slides.internal.z0k.e2();

                  try {
                     com.aspose.slides.internal.q7.n5.n5(var15, var16);
                     var17 = var16.toArray();
                  } finally {
                     if (var16 != null) {
                        var16.dispose();
                     }
                  }
               } finally {
                  if (var15 != null) {
                     var15.dispose();
                  }
               }

               if ("ttcf".equals(com.aspose.slides.internal.l7h.j5.z3().l6(var17, 0, 4))) {
                  com.aspose.slides.internal.g7.m3 var44 = new com.aspose.slides.internal.g7.m3(var17);
                  com.aspose.slides.internal.g7.c0 var18 = new com.aspose.slides.internal.g7.c0(var44);
                  com.aspose.slides.internal.g7.i2 var19 = com.aspose.slides.internal.g7.i2.n5(var18.n5()[0]);
                  com.aspose.slides.internal.z0k.e2 var20 = new com.aspose.slides.internal.z0k.e2();

                  try {
                     var19.n5(var20);
                     var17 = var20.toArray();
                  } finally {
                     if (var20 != null) {
                        var20.dispose();
                     }
                  }
               }

               this.n5(var1, ((FontsManager)var3.getFontsManager()).n5(var17, ((HtmlGenerator)var1).a6()), var9.l6(), var9.k5(), var10, var11);
            }
         }
      }
   }

   public final void u3(IHtmlGenerator var1, IPresentation var2) {
      this.l6.writeDocumentEnd(var1, var2);
   }

   public final void n5(IHtmlGenerator var1, ISlide var2) {
      this.l6.writeSlideStart(var1, var2);
   }

   public final void l6(IHtmlGenerator var1, ISlide var2) {
      this.l6.writeSlideEnd(var1, var2);
   }

   public final void n5(IHtmlGenerator var1, IShape var2) {
      this.l6.writeShapeStart(var1, var2);
   }

   public final void l6(IHtmlGenerator var1, IShape var2) {
      this.l6.writeShapeEnd(var1, var2);
   }

   public final void n5(IHtmlGenerator var1, IFontData var2, IFontData var3, String var4, String var5, byte[] var6) {
      n5(var1, "<style>");
      n5(var1, "font-variant-ligatures: none;");
      n5(var1, "@font-face {");
      String var7 = com.aspose.slides.internal.n8e.v4.a6(var3 == null ? var2.getFontName() : var3.getFontName());
      n5(var1, var7, var4, var5);
      String var8 = com.aspose.slides.ms.System.z3.n5(var6, 0, var6.length);
      n5(var1, com.aspose.slides.ms.System.d1.n5("src: url('data:{0};base64,{1}');",new Object[]{ this.k5.n5(), var8}));
      n5(var1, "}");
      n5(var1, "</style>");
   }

   private void n5(IHtmlGenerator var1, e6s var2) {
      if (var2 == null) {
         throw new ArgumentNullException("fonts");
      }

      IGenericEnumerator var3 = var2.iterator();

      try {
         while (var3.hasNext()) {
            KeyValuePair var4 = (KeyValuePair)var3.next();
            IGenericEnumerator var5 = ((c4y)var4.getValue()).h0().iterator();

            try {
               while (var5.hasNext()) {
                  KeyValuePair var6 = (KeyValuePair)var5.next();
                  String var7 = null;
                  String var8 = null;
                  String[] var9 = new String[]{var7};
                  String[] var10 = new String[]{var8};
                  boolean var11 = !n5((Integer)var6.getKey(), var9, var10);
                  var7 = var9[0];
                  var8 = var10[0];
                  if (!var11) {
                     this.n5(var1, (byte[])var6.getValue(), (String)var4.getKey(), null, var7, var8);
                  }
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var5, IDisposable.class)) {
                  var5.dispose();
               }
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }
   }

   private void n5(IHtmlGenerator var1, byte[] var2, String var3, String var4, String var5, String var6) {
      this.u3.n5(var1, new FontData(var3), var4 == null ? null : new FontData(var4), var5, var6, var2);
   }

   private static void n5(IHtmlGenerator var0, String var1, String var2, String var3) {
      n5(var0, com.aspose.slides.ms.System.d1.n5("font-family: '{0}';", new Object[]{var1}));
      n5(var0, com.aspose.slides.ms.System.d1.n5("font-style: '{0}';", new Object[]{var2}));
      n5(var0, com.aspose.slides.ms.System.d1.n5("font-weight: '{0}';", new Object[]{var3}));
   }

   private static boolean n5(int var0, String[] var1, String[] var2) {
      var1[0] = null;
      var2[0] = null;
      switch (var0) {
         case 0:
            var2[0] = "normal";
            var1[0] = "normal";
            break;
         case 1:
            var2[0] = "bold";
            var1[0] = "normal";
            break;
         case 2:
            var2[0] = "normal";
            var1[0] = "italic";
            break;
         default:
            return false;
      }

      return true;
   }

   private static void n5(IHtmlGenerator var0, String var1) {
      var0.addHtml(var1);
      var0.addHtml(com.aspose.slides.ms.System.p8.k5());
   }
}

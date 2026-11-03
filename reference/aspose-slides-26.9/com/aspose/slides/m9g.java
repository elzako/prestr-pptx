package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.ms.System.IDisposable;

class m9g implements t5e {
   private a2c n5;

   public m9g(a2c var1) {
      if (var1 == null) {
         String var2 = com.aspose.slides.ms.System.d1.n5("In the '{0}' class was put a parameter '{1}' equal 'null'.",new Object[]{ "WpfXaml", "shapeParser"});
         throw new t1c(var2);
      }

      this.n5 = var1;
   }

   @Override
   public final Dictionary<String, byte[]> n5(IPresentation var1, XamlOptions var2, InterruptionToken var3) {
      if (var1.getSlides().size() == 0) {
         return new Dictionary<>();
      }

      var2.l6(1);
      Dictionary var4 = new Dictionary();
      List var5 = new List();
      int var6 = 1;

      try {
         float var7 = var2.l6().l6();
         float var43 = var2.l6().k5();
         IGenericEnumerator var9 = var1.getSlides().iterator();

         try {
            while (var9.hasNext()) {
               ISlide var10 = (ISlide)var9.next();
               if (!var10.getHidden() || var2.getExportHiddenSlides()) {
                  var3.throwIfInterruptionRequested();
                  String var11 = com.aspose.slides.ms.System.d1.n5(new String[]{var2.h0(), "_{0}.xaml"});
                  String var12 = com.aspose.slides.ms.System.d1.n5(var11, new Object[]{var6});
                  String var13 = com.aspose.slides.internal.z0k.z1.l6(var2.z1(), var12);
                  String var14 = com.aspose.slides.internal.z0k.z1.l6(var12);
                  String var15 = this.n5(var2, var14, var7, var43);
                  var5.addItem(var15);
                  String var16 = com.aspose.slides.ms.System.d1.n5("<Canvas{0}>", new Object[]{com.aspose.slides.ms.System.d1.n5});
                  var5.addItem(var16);
                  ILayoutSlide var17 = var10.getLayoutSlide();
                  List var18 = this.n5.n5(var17, var2);
                  var5.addRange(var18);
                  IGenericEnumerator var19 = var10.getShapes().iterator();

                  try {
                     while (var19.hasNext()) {
                        IShape var20 = (IShape)var19.next();
                        Dictionary var21 = new Dictionary();
                        Dictionary[] var22 = new Dictionary[]{var21};
                        List var23 = this.n5.n5(var20, var2, var22);
                        var21 = var22[0];
                        var5.addRange(var23);
                        p5g.n5(var21, var4);
                     }
                  } finally {
                     if (com.aspose.slides.internal.v6g.k5.n5(var19, IDisposable.class)) {
                        var19.dispose();
                     }
                  }

                  var5.addItem("</Canvas>");
                  var5.addItem("</Page>");
                  String var44 = com.aspose.slides.ms.System.d1.n5;
                  List$Enumerator var46 = var5.iterator();

                  try {
                     while (var46.hasNext()) {
                        String var47 = (String)var46.next();
                        var44 = com.aspose.slides.ms.System.d1.n5(var44, com.aspose.slides.ms.System.d1.n5(new String[]{var47, com.aspose.slides.ms.System.p8.k5()}));
                     }
                  } finally {
                     if (com.aspose.slides.internal.v6g.k5.n5(var46, IDisposable.class)) {
                        var46.dispose();
                     }
                  }

                  byte[] var48 = v7.n5(var44);
                  var4.addItem(var13, var48);
                  var6++;
                  var5.clear();
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var9, IDisposable.class)) {
               var9.dispose();
            }
         }

         return var4;
      } catch (ArgumentException var42) {
         String var8 = com.aspose.slides.ms.System.d1.n5("Error during save to xaml files. Details: {0}", new Object[]{var42.getMessage()});
         throw new t1c(var8, var42);
      }
   }

   private String n5(XamlOptions var1, String var2, float var3, float var4) {
      String var5 = "wpftemplates/Xaml_PageOpenTag_Template.txt";
      String var6 = x4q.l6(var5);
      var6 = com.aspose.slides.ms.System.d1.n5(var6, "{Namespace}", !com.aspose.slides.ms.System.d1.n5(var1.k5()) ? var1.k5() : "Xaml");
      var6 = com.aspose.slides.ms.System.d1.n5(var6, "{ClassName}", var2);
      var6 = com.aspose.slides.ms.System.d1.n5(var6, "{Height}", com.aspose.slides.ms.System.n1.u9(var4));
      var6 = com.aspose.slides.ms.System.d1.n5(var6, "{Width}", com.aspose.slides.ms.System.n1.u9(var3));
      if (var1.n5()) {
         String var7 = "wpftemplates/Xaml_PageDevAttributes_Template.txt";
         String var8 = x4q.l6(var7);
         var6 = com.aspose.slides.ms.System.d1.n5(var6, "{DevTags}", var8);
      } else {
         var6 = com.aspose.slides.ms.System.d1.n5(var6, "{DevTags}", com.aspose.slides.ms.System.d1.n5);
      }

      return var6;
   }
}

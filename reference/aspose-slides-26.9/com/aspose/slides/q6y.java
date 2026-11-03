package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.ms.System.IDisposable;

class q6y implements t5e {
   private a2c n5;

   public q6y(a2c var1) {
      if (var1 == null) {
         String var2 = com.aspose.slides.ms.System.d1.n5("In the '{0}' class was put a parameter '{1}' equal 'null'.",new Object[]{ "XamarinFormsXaml", "shapeParser"});
         throw new t1c(var2);
      }

      this.n5 = var1;
   }

   @Override
   public final Dictionary<String, byte[]> n5(IPresentation var1, XamlOptions var2, InterruptionToken var3) {
      if (var1.getSlides().size() == 0) {
         return new Dictionary<>();
      }

      var2.l6(0);
      Dictionary var4 = new Dictionary();
      List var5 = new List();
      int var6 = 1;

      try {
         IGenericEnumerator var7 = var1.getSlides().iterator();

         try {
            while (var7.hasNext()) {
               ISlide var41 = (ISlide)var7.next();
               if (!var41.getHidden() || var2.getExportHiddenSlides()) {
                  var3.throwIfInterruptionRequested();
                  String var9 = com.aspose.slides.ms.System.d1.n5(new String[]{var2.h0(), "_{0}.xaml"});
                  String var10 = com.aspose.slides.ms.System.d1.n5(var9, new Object[]{var6});
                  String var11 = var10;
                  if (var2.u3() != 1) {
                     var11 = com.aspose.slides.internal.z0k.z1.l6(var2.a6(), var2.u9());
                     var11 = com.aspose.slides.internal.z0k.z1.l6(var11, var2.u9());
                     var11 = com.aspose.slides.internal.z0k.z1.l6(var11, var10);
                  }

                  String var12 = com.aspose.slides.internal.z0k.z1.l6(var10);
                  String var13 = this.n5(var2, var12);
                  var5.addItem(var13);
                  String var14 = com.aspose.slides.ms.System.d1.n5("<AbsoluteLayout{0}>", new Object[]{com.aspose.slides.ms.System.d1.n5});
                  var5.addItem(var14);
                  ILayoutSlide var15 = var41.getLayoutSlide();
                  List var16 = this.n5.n5(var15, var2);
                  var5.addRange(var16);
                  IGenericEnumerator var17 = var41.getShapes().iterator();

                  try {
                     while (var17.hasNext()) {
                        IShape var18 = (IShape)var17.next();
                        Dictionary var19 = new Dictionary();
                        Dictionary[] var20 = new Dictionary[]{var19};
                        List var21 = this.n5.n5(var18, var2, var20);
                        var19 = var20[0];
                        var5.addRange(var21);
                        p5g.n5(var19, var4);
                     }
                  } finally {
                     if (com.aspose.slides.internal.v6g.k5.n5(var17, IDisposable.class)) {
                        var17.dispose();
                     }
                  }

                  var5.addItem("</AbsoluteLayout>");
                  var5.addItem("</ContentPage>");
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
                  var4.addItem(var11, var48);
                  var6++;
                  var5.clear();
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var7, IDisposable.class)) {
               var7.dispose();
            }
         }

         return var4;
      } catch (ArgumentException var40) {
         String var8 = com.aspose.slides.ms.System.d1.n5("Error during save to xaml files. Details: {0}", new Object[]{var40.getMessage()});
         throw new t1c(var8, var40);
      }
   }

   private String n5(XamlOptions var1, String var2) {
      String var3 = "xamarinforms/templates/Xaml_ContentPageOpenTag_Template.txt";
      String var4 = x4q.l6(var3);
      var4 = com.aspose.slides.ms.System.d1.n5(var4, "{Namespace}", !com.aspose.slides.ms.System.d1.n5(var1.k5()) ? var1.k5() : "Xaml");
      var4 = com.aspose.slides.ms.System.d1.n5(var4, "{ClassName}", var2);
      if (var1.n5()) {
         String var5 = "xamarinforms/templates/Xaml_ContentPageDevAttributes_Template.txt";
         String var6 = x4q.l6(var5);
         var4 = com.aspose.slides.ms.System.d1.n5(var4, "{DevTags}", var6);
      } else {
         var4 = com.aspose.slides.ms.System.d1.n5(var4, "{DevTags}", com.aspose.slides.ms.System.d1.n5);
      }

      return var4;
   }
}

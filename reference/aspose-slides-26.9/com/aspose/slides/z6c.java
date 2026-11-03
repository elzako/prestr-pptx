package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.ms.System.IDisposable;

class z6c implements l2w {
   @Override
   public final Dictionary<String, byte[]> n5(IPresentation var1, XamlOptions var2, List<String>[] var3, InterruptionToken var4) {
      int var5 = 1;

      try {
         Dictionary var6 = new Dictionary();
         List var22 = new List();
         IGenericEnumerator var8 = var1.getSlides().iterator();

         try {
            while (var8.hasNext()) {
               ISlide var9 = (ISlide)var8.next();
               if (!var9.getHidden() || var2.getExportHiddenSlides()) {
                  var4.throwIfInterruptionRequested();
                  String var10 = com.aspose.slides.ms.System.d1.n5(new String[]{var2.h0(), "_{0}.xaml"});
                  String var11 = com.aspose.slides.ms.System.d1.n5(var10, new Object[]{var5});
                  String var12 = com.aspose.slides.internal.z0k.z1.l6(var11);
                  String var13 = com.aspose.slides.ms.System.d1.n5(var11, ".xaml", ".xaml.cs");
                  KeyValuePair var14 = this.n5(var2.k5(), var12, var13).Clone();
                  String var15 = com.aspose.slides.internal.z0k.z1.l6(var2.z1(), var2.u9());
                  var15 = com.aspose.slides.internal.z0k.z1.l6(var15, (String)var14.getKey());
                  var6.addItem(var15, var14.getValue());
                  String var16 = com.aspose.slides.internal.z0k.z1.n5(var11);
                  var22.addItem(var16);
                  var5++;
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var8, IDisposable.class)) {
               var8.dispose();
            }
         }

         var3[0] = var22;
         return var6;
      } catch (ArgumentException var21) {
         String var7 = com.aspose.slides.ms.System.d1.n5("Error during save to cs files. Details: {0}", new Object[]{var21.getMessage()});
         throw new t1c(var7, var21);
      }
   }

   @Override
   public final String n5(List<String> var1) {
      String var2 = com.aspose.slides.ms.System.d1.n5;

      for (int var3 = 0; var3 < var1.size(); var3++) {
         var2 = com.aspose.slides.ms.System.d1.n5(var2, this.n5(var3, (String)var1.get_Item(var3)));
      }

      return var2;
   }

   private String n5(int var1, String var2) {
      String var3 = com.aspose.slides.ms.System.d1.n5(var2, ".xaml", com.aspose.slides.ms.System.d1.n5);
      String var4 = "xamarinforms/templates/BaseProject_MainPage_xaml_cs_Case_Template.txt";
      String var5 = x4q.l6(var4);
      var5 = com.aspose.slides.ms.System.d1.n5(var5, "{CaseID}", com.aspose.slides.ms.System.a3.l6(var1));
      var5 = com.aspose.slides.ms.System.d1.n5(var5, "{ClassName}", var3);
      return com.aspose.slides.ms.System.d1.n5(new String[]{var5, "\n\t\t\t\t"});
   }

   private KeyValuePair<String, byte[]> n5(String var1, String var2, String var3) {
      String var4 = "xamarinforms/templates/BaseProject_Page_cs_Template.txt";
      String var5 = x4q.l6(var4);
      var5 = com.aspose.slides.ms.System.d1.n5(var5, "{Namespace}", var1);
      var5 = com.aspose.slides.ms.System.d1.n5(var5, "{ClassName}", var2);
      byte[] var6 = v7.n5(var5);
      return new KeyValuePair<>(var3, var6);
   }
}

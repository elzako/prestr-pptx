package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.IGenericList;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.ms.System.IDisposable;

class q5p {
   public static boolean n5(String var0) {
      return com.aspose.slides.ms.System.d1.n5(var0)
         ? true
         : com.aspose.slides.ms.System.d1.t2(var0, "OpenOffice/4") || com.aspose.slides.ms.System.d1.t2(var0, "OpenOffice.org_project/4");
   }

   public static boolean l6(String var0) {
      return com.aspose.slides.ms.System.d1.t2(var0, "OpenOffice.org_project/680m");
   }

   public static boolean n5(com.aspose.slides.internal.k4y.b4f var0, com.aspose.slides.internal.k4y.o2e var1, String var2) {
      if (var0 == null) {
         throw new ArgumentNullException("frameElementData");
      }

      if (var1 == null) {
         throw new ArgumentNullException("textBoxElement");
      }

      if (var0.y4() != 1) {
         return false;
      }

      if (var0.n3() != 2) {
         return false;
      }

      if (n5(var2)) {
         return false;
      }

      if (!l6(var2)) {
         return false;
      }

      if (var1.n5().size() == 0) {
         return false;
      }

      List$Enumerator var3 = var1.n5().iterator();

      try {
         while (var3.hasNext()) {
            com.aspose.slides.internal.k4y.g7 var4 = (com.aspose.slides.internal.k4y.g7)var3.next();
            if (!"list".equals(var4.n5())) {
               return false;
            }

            com.aspose.slides.internal.k4y.u0y var5 = (com.aspose.slides.internal.k4y.u0y)var4.l6();
            if (var5.a6().length != 1) {
               return false;
            }

            com.aspose.slides.internal.k4y.b2k var6 = var5.a6()[0];
            if (var6.n5().size() != 1) {
               return false;
            }

            if ("p".equals(var6.n5().get_Item(0).n5())) {
               com.aspose.slides.internal.k4y.u1x var7 = (com.aspose.slides.internal.k4y.u1x)var6.n5().get_Item(0).l6();
               if (var7.k5().size() >= 1 && "_TEXT".equals(var7.k5().get_Item(0).n5())) {
                  return false;
               }
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }

      return true;
   }

   public static List<com.aspose.slides.internal.k4y.g7> n5(IGenericList<com.aspose.slides.internal.k4y.g7> var0) {
      if (var0 == null) {
         throw new ArgumentNullException("elementsList");
      }

      if (var0.size() == 0) {
         throw new ArgumentException("elementsList");
      }

      List var1 = new List(var0.size());
      IGenericEnumerator var2 = var0.iterator();

      try {
         while (var2.hasNext()) {
            com.aspose.slides.internal.k4y.g7 var3 = (com.aspose.slides.internal.k4y.g7)var2.next();
            if (!"list".equals(var3.n5())) {
               throw new InvalidOperationException();
            }

            com.aspose.slides.internal.k4y.u0y var4 = (com.aspose.slides.internal.k4y.u0y)var3.l6();
            if (var4.a6().length != 1) {
               throw new InvalidOperationException();
            }

            com.aspose.slides.internal.k4y.b2k var5 = var4.a6()[0];
            if (var5.n5().size() != 1) {
               throw new InvalidOperationException();
            }

            if (var5.n5().size() != 1) {
               throw new InvalidOperationException();
            }

            if (!"p".equals(var5.n5().get_Item(0).n5()) && !"list".equals(var5.n5().get_Item(0).n5())) {
               throw new InvalidOperationException();
            }

            if ("list".equals(var5.n5().get_Item(0).n5())) {
               com.aspose.slides.internal.k4y.u0y var6 = (com.aspose.slides.internal.k4y.u0y)var5.n5().get_Item(0).l6();
               var6.n5(var4.k5());
            }

            var1.addItem(var5.n5().get_Item(0));
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }

      return var1;
   }
}

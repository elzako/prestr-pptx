package com.aspose.slides.internal.h3d;

import com.aspose.slides.Collections.ArrayList;
import com.aspose.slides.Collections.Hashtable;
import com.aspose.slides.exceptions.TypeLoadException;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.y8;

final class z8 {
   ArrayList n5;
   ArrayList l6;
   ArrayList k5;
   ArrayList u3;
   static Hashtable a6 = new Hashtable();
   static final Object u9 = new Object();

   public boolean n5() {
      return this.l6 != null;
   }

   public boolean l6() {
      return this.u3 != null;
   }

   public z8(y8 var1) {
      this.n5 = n5(var1, com.aspose.slides.internal.v6g.k5.n5(k7.class));
      this.l6 = n5(var1, com.aspose.slides.internal.v6g.k5.n5(m1.class));
      this.k5 = n5(var1, com.aspose.slides.internal.v6g.k5.n5(z3.class));
      this.u3 = n5(var1, com.aspose.slides.internal.v6g.k5.n5(q0.class));
   }

   static ArrayList n5(y8 var0, y8 var1) {
      ArrayList var2 = new ArrayList();

      for (y8 var3 = var0; var3 != com.aspose.slides.internal.v6g.k5.n5(Object.class); var3 = var3.n5()) {
         int var4 = 0;

         for (com.aspose.slides.internal.p4l.q0 var8 : var3.n5(54)) {
            if (var8.n5(var1, false)) {
               var2.addItem(var8);
               var4++;
            }
         }

         var2.sort(new j5());
         if (var4 > 1) {
            throw new TypeLoadException(d1.n5("Type '{0}' has more than one method with the following attribute: '{1}'.",new Object[]{ var0.m3(), var1.q0()}));
         }
      }

      return var2.size() == 0 ? null : var2;
   }

   static void n5(ArrayList var0, Object var1, s3 var2) {
      if (var0 != null) {
         for (Object recoveredElement$var4$1663 : var0) {
            com.aspose.slides.internal.p4l.q0 var4 = (com.aspose.slides.internal.p4l.q0)recoveredElement$var4$1663;
            if (!var4.m1().isAccessible()) {
               var4.m1().setAccessible(true);
            }

            var4.n5(var1, new Object[]{var2.k5()});
         }
      }
   }

   public void n5(Object var1, s3 var2) {
      n5(this.n5, var1, var2.k5());
   }

   public void l6(Object var1, s3 var2) {
      n5(this.l6, var1, var2.k5());
   }

   public void k5(Object var1, s3 var2) {
      n5(this.k5, var1, var2.k5());
   }

   public void u3(Object var1, s3 var2) {
      n5(this.u3, var1, var2.k5());
   }

   public static z8 n5(y8 var0) {
      z8 var1 = (z8)a6.get_Item(var0);
      if (var1 != null) {
         return var1;
      }

      synchronized (u9) {
         var1 = (z8)a6.get_Item(var0);
         if (var1 == null) {
            Hashtable var3 = (Hashtable)a6.deepClone();
            var1 = new z8(var0);
            var3.set_Item(var0, var1);
            a6 = var3;
         }

         return var1;
      }
   }
}

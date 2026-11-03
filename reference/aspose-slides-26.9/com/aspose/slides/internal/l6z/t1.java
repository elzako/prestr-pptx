package com.aspose.slides.internal.l6z;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.ms.System.IDisposable;

class t1 {
   private final int n5;
   private final List<r4> l6 = new List<>();

   t1(int var1) {
      this.n5 = var1;
   }

   t1(com.aspose.slides.internal.x1.u9 var1, int var2) {
      if (var1 == null) {
         throw new ArgumentNullException();
      }

      this.n5 = var2;
      byte[] var3 = var1.l6();
      com.aspose.slides.internal.z0k.e2 var4 = new com.aspose.slides.internal.z0k.e2(var3);

      try {
         com.aspose.slides.internal.z0k.n5 var5 = new com.aspose.slides.internal.z0k.n5(var4);

         try {
            while (var4.getPosition() < var3.length - 2) {
               r4 var6 = new r4(this.n5);
               var6.n5(var5);
               this.l6.addItem(var6);
            }

            int var15 = var5.r4();
            if ((var15 & 65535) != 0) {
               throw new d1();
            }
         } finally {
            if (var5 != null) {
               var5.dispose();
            }
         }
      } finally {
         if (var4 != null) {
            var4.dispose();
         }
      }
   }

   final void n5(com.aspose.slides.internal.x1.u9 var1) {
      com.aspose.slides.internal.z0k.e2 var2 = new com.aspose.slides.internal.z0k.e2();

      try {
         com.aspose.slides.internal.z0k.l6 var3 = new com.aspose.slides.internal.z0k.l6(var2);

         try {
            List$Enumerator var4 = this.l6.iterator();

            try {
               while (var4.hasNext()) {
                  r4 var5 = (r4)var4.next();
                  var5.n5(var3);
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
                  var4.dispose();
               }
            }

            var3.n5(0);
            var1.n5(var2.toArray());
         } finally {
            if (var3 != null) {
               var3.dispose();
            }
         }
      } finally {
         if (var2 != null) {
            var2.dispose();
         }
      }
   }

   final void n5(String var1) {
      r4 var2 = new r4(this.n5, var1);
      this.l6.addItem(var2);
   }

   final void l6(String var1) {
      r4 var2 = this.l6.find(new t1$1(this, var1));
      if (var2 == null) {
         throw new ArgumentException(com.aspose.slides.ms.System.d1.n5("NAMEMAP entry for module with name {0} is not exists", new Object[]{var1}));
      }

      this.l6.removeItem(var2);
   }
}

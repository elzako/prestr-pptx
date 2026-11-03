package com.aspose.slides.internal.l6z;

import com.aspose.slides.exceptions.ArgumentNullException;

public class x8 {
   private p8 n5;
   private z7 l6;
   private b3 k5;

   x8(int var1, String var2) {
      this.n5 = new p8(var1, var2);
      this.l6 = new z7(com.aspose.slides.internal.v6g.k5.u3(var1, 8));
      this.k5 = new b3(com.aspose.slides.internal.v6g.k5.u3(var1, 8));
   }

   x8(com.aspose.slides.internal.x1.u9 var1) {
      if (var1 == null) {
         throw new ArgumentNullException();
      }

      this.n5 = new p8();
      com.aspose.slides.internal.z0k.e2 var2 = new com.aspose.slides.internal.z0k.e2(p6.n5(var1.l6()));

      try {
         com.aspose.slides.internal.z0k.n5 var3 = new com.aspose.slides.internal.z0k.n5(var2);

         try {
            this.n5(var3);
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

   void n5(com.aspose.slides.internal.x1.u9 var1) {
      com.aspose.slides.internal.z0k.e2 var2 = new com.aspose.slides.internal.z0k.e2();

      try {
         com.aspose.slides.internal.z0k.l6 var3 = new com.aspose.slides.internal.z0k.l6(var2);

         try {
            this.n5(var3);
            var1.n5(p6.l6(var2.toArray()));
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

   e2 n5(String var1) {
      e2 var2 = new e2(com.aspose.slides.internal.v6g.k5.u3(this.n5.n5().l6(), 8), var1);
      this.k5.l6().addItem(var2);
      return var2;
   }

   void n5(o5 var1) {
      this.l6.n5().addItem(var1);
   }

   void l6(String var1) {
      this.k5.n5(var1);
   }

   private void n5(com.aspose.slides.internal.z0k.n5 var1) {
      this.n5.n5(var1);
      this.l6 = new z7(com.aspose.slides.internal.v6g.k5.u3(this.n5.n5().l6(), 8));
      this.l6.n5(var1);
      this.k5 = new b3(com.aspose.slides.internal.v6g.k5.u3(this.n5.n5().l6(), 8));
      this.k5.n5(var1);
      int var2 = var1.r4();
      if (com.aspose.slides.internal.v6g.k5.k5(var2, 8) != 16) {
         throw new d1();
      }

      long var3 = var1.c4();
      if (com.aspose.slides.internal.v6g.k5.a6(var3, 10) != 0L) {
         throw new d1();
      }
   }

   private void n5(com.aspose.slides.internal.z0k.l6 var1) {
      this.n5.n5(var1);
      this.l6.n5(var1);
      this.k5.n5(var1);
      var1.n5(com.aspose.slides.internal.v6g.k5.k5(16, 9));
      var1.n5(com.aspose.slides.internal.v6g.k5.a6(0, 9));
   }

   public p8 n5() {
      return this.n5;
   }

   public z7 l6() {
      return this.l6;
   }

   public b3 k5() {
      return this.k5;
   }
}

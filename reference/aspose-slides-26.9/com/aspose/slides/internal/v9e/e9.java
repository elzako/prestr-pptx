package com.aspose.slides.internal.v9e;

import com.aspose.slides.exceptions.XsltException;
import com.aspose.slides.ms.System.Xml.a8;

public class e9 extends t9 {
   private int n5 = -1;
   private h0 l6;
   private h0 k5;
   private h0 u3;
   private h0 a6;
   private String u9;
   private int h0 = 1;
   private int c8 = 1;
   private int t2 = 0;
   private z6 s7;
   private boolean x8;
   private p8 n3;

   private String n5(String var1) {
      if (var1 == null) {
         return null;
      }

      if (!a8.n5(com.aspose.slides.ms.System.d1.c8(var1), 0, var1.length()) && (var1.length() == 0 || com.aspose.slides.internal.x7n.l6.l6(var1) == null)) {
         if (this.x8) {
            return null;
         } else {
            throw XsltException.create("'{1}' is an invalid value for the '{0}' attribute.", "lang", var1);
         }
      } else {
         return var1;
      }
   }

   private int n5(String var1, p8 var2) {
      if (var1 == null) {
         return 1;
      } else if ("text".equals(var1)) {
         return 1;
      } else if ("number".equals(var1)) {
         return 2;
      } else {
         String var3 = null;
         String var4 = null;
         String[] var5 = new String[]{var3};
         String[] var6 = new String[]{var4};
         f0.n5(var1, var5, var6);
         var3 = var5[0];
         var4 = var6[0];
         var2.n5(var3);
         if (var3.length() == 0 && !this.x8) {
            throw XsltException.create("'{1}' is an invalid value for the '{0}' attribute.", "data-type", var1);
         } else {
            return 1;
         }
      }
   }

   private int l6(String var1) {
      if (var1 == null) {
         return 1;
      } else if ("ascending".equals(var1)) {
         return 1;
      } else if ("descending".equals(var1)) {
         return 2;
      } else if (this.x8) {
         return 1;
      } else {
         throw XsltException.create("'{1}' is an invalid value for the '{0}' attribute.", "order", var1);
      }
   }

   private int k5(String var1) {
      if (var1 == null) {
         return 0;
      } else if ("upper-first".equals(var1)) {
         return 1;
      } else if ("lower-first".equals(var1)) {
         return 2;
      } else if (this.x8) {
         return 0;
      } else {
         throw XsltException.create("'{1}' is an invalid value for the '{0}' attribute.", "case-order", var1);
      }
   }

   public void l6(z1 var1) {
      this.u3(var1);
      this.a6(var1);
      if (this.n5 == -1) {
         this.n5 = var1.e2(".");
      }

      this.x8 = var1.n3();
      this.n3 = var1.z3();
      h0[] var2 = new h0[]{this.l6};
      this.u9 = this.n5(n5(var2));
      this.l6 = var2[0];
      h0[] var3 = new h0[]{this.k5};
      this.h0 = this.n5(n5(var3), this.n3);
      this.k5 = var3[0];
      h0[] var4 = new h0[]{this.u3};
      this.c8 = this.l6(n5(var4));
      this.u3 = var4[0];
      h0[] var5 = new h0[]{this.a6};
      this.t2 = this.k5(n5(var5));
      this.a6 = var5[0];
      if (this.l6 == null && this.k5 == null && this.u3 == null && this.a6 == null) {
         this.s7 = new z6(this.n5, this.u9, this.h0, this.c8, this.t2);
      }
   }

   @Override
   public boolean k5(z1 var1) {
      String var2 = var1.u3().e2();
      String var3 = var1.u3().t4();
      if (com.aspose.slides.ms.System.Xml.v8.n5(var2, var1.n5().t3)) {
         this.n5 = var1.e2(var3);
      } else if (com.aspose.slides.ms.System.Xml.v8.n5(var2, var1.n5().y0)) {
         this.l6 = com.aspose.slides.internal.v9e.h0.n5(var1, var3);
      } else if (com.aspose.slides.ms.System.Xml.v8.n5(var2, var1.n5().q0)) {
         this.k5 = com.aspose.slides.internal.v9e.h0.n5(var1, var3);
      } else if (com.aspose.slides.ms.System.Xml.v8.n5(var2, var1.n5().h6)) {
         this.u3 = com.aspose.slides.internal.v9e.h0.n5(var1, var3);
      } else {
         if (!com.aspose.slides.ms.System.Xml.v8.n5(var2, var1.n5().t2)) {
            return false;
         }

         this.a6 = com.aspose.slides.internal.v9e.h0.n5(var1, var3);
      }

      return true;
   }

   @Override
   public void n5(p3 var1, l6 var2) {
      var1.n5(
         this.s7 != null
            ? this.s7
            : new z6(
               this.n5,
               this.l6 == null ? this.u9 : this.n5(this.l6.n5(var1, var2)),
               this.k5 == null ? this.h0 : this.n5(this.k5.n5(var1, var2), this.n3),
               this.u3 == null ? this.c8 : this.l6(this.u3.n5(var1, var2)),
               this.a6 == null ? this.t2 : this.k5(this.a6.n5(var1, var2))
            )
      );
      var2.s7();
   }
}

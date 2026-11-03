package com.aspose.slides.internal.t1;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.internal.h2.a5;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.d1;

public class z3 extends com.aspose.slides.internal.e5.t9 implements u9 {
   private a5 u9;
   private int h0 = 0;
   private List<k5> c8;
   private boolean t2 = false;
   private boolean s7 = false;

   public z3(com.aspose.slides.internal.e5.t2 var1) {
      super(var1);
   }

   @Override
   public void n5(com.aspose.slides.internal.e5.w1 var1) {
      this.u9 = var1.a6(156);
   }

   @Override
   public void u9() {
      this.c8 = new List<>();
      s7 var1 = (s7)this.n5;
      var1.n5((com.aspose.slides.internal.t1.u9)(this));
   }

   @Override
   public void c8() {
      if (this.u3 == null) {
         this.l6("(conditional-page-master-reference+)");
      }
   }

   @Override
   public void n5(com.aspose.slides.internal.w2.u9 var1, String var2, String var3) {
      if (d1.a6("http://www.w3.org/1999/XSL/Format", var2) && !d1.a6(var3, "conditional-page-master-reference")) {
         this.k5(var1, var2, var3);
      }
   }

   public final int i1() {
      if (this.u9.a6() == 89) {
         return -1;
      }

      int var1 = this.u9.u9().u3();
      if (var1 < 0) {
         var1 = 0;
      }

      return var1;
   }

   @Override
   public final z8 n5(boolean var1, boolean var2, boolean var3, boolean var4) {
      if (!this.u3() && this.h0 >= this.i1()) {
         return null;
      }

      this.h0++;
      List$Enumerator var5 = this.c8.iterator();

      try {
         while (var5.hasNext()) {
            k5 var6 = (k5)var5.next();
            if (var6.n5(var1, var2, var3, var4)) {
               return var6.i1();
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var5, IDisposable.class)) {
            var5.dispose();
         }
      }

      return null;
   }

   public final void n5(k5 var1) {
      this.c8.addItem(var1);
      if (var1.e5() == 72) {
         this.t2 = true;
      }

      if (var1.e5() == 186) {
         this.s7 = true;
      }
   }

   @Override
   public final void n5() {
      this.h0 = 0;
   }

   @Override
   public final boolean l6() {
      if (this.h0 == 0) {
         return false;
      }

      this.h0--;
      return true;
   }

   @Override
   public final boolean k5() {
      return this.t2;
   }

   @Override
   public String z1() {
      return "repeatable-page-master-alternatives";
   }

   @Override
   public int z3() {
      return 62;
   }

   @Override
   public final void n5(h0 var1) {
      List$Enumerator var2 = this.c8.iterator();

      try {
         while (var2.hasNext()) {
            k5 var3 = (k5)var2.next();
            var3.n5(var1);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }
   }

   @Override
   public final boolean n5(String var1) {
      boolean var2 = true;
      List var3 = new List();
      List$Enumerator var4 = this.c8.iterator();

      try {
         while (var4.hasNext()) {
            k5 var5 = (k5)var4.next();
            if (var5.n5(true, false, false, false) || var5.n5(false, false, false, false)) {
               var3.addItem(var5);
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      if (var3.size() != 0) {
         var2 = false;
         List$Enumerator var15 = var3.iterator();

         try {
            while (var15.hasNext()) {
               k5 var6 = (k5)var15.next();
               z8 var7 = var6.i1();
               if (var7 == null) {
                  var2 = true;
               } else {
                  var2 |= d1.a6(var7.h0(58).b3(), var1);
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var15, IDisposable.class)) {
               var15.dispose();
            }
         }
      }

      return var2;
   }

   @Override
   public final boolean u3() {
      return this.i1() == -1;
   }

   @Override
   public final boolean a6() {
      return false;
   }
}

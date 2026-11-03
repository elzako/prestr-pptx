package com.aspose.slides.internal.t1;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.d1;

public class s7 extends com.aspose.slides.internal.e5.t9 {
   private String u9;
   private h0 h0;
   private List<u9> c8;
   private u9 t2;
   private int s7 = -1;
   private com.aspose.slides.internal.p3.w1 x8;

   public s7(com.aspose.slides.internal.e5.t2 var1, com.aspose.slides.internal.p3.w1 var2) {
      super(var1);
      this.x8 = var2;
   }

   @Override
   public void n5(com.aspose.slides.internal.e5.w1 var1) {
      this.u9 = var1.u3(153).j_();
      if (d1.n5(this.u9)) {
         this.k5("master-name");
      }
   }

   @Override
   public void u9() {
      this.c8 = new List<>();
      this.h0 = this.n5.e2().b3();
      this.h0.n5(this.u9, this);
   }

   @Override
   public void c8() {
      if (this.u3 == null) {
         this.l6(d1.n5(new String[]{"(single-page-master-reference|", "repeatable-page-master-reference|repeatable-page-master-alternatives)+"}));
      }
   }

   @Override
   public void n5(com.aspose.slides.internal.w2.u9 var1, String var2, String var3) {
      if (d1.a6("http://www.w3.org/1999/XSL/Format", var2)
         && !d1.a6(var3, "single-page-master-reference")
         && !d1.a6(var3, "repeatable-page-master-reference")
         && !d1.a6(var3, "repeatable-page-master-alternatives")) {
         this.k5(var1, var2, var3);
      }
   }

   public final void n5(u9 var1) {
      this.c8.addItem(var1);
   }

   private u9 z7() {
      this.s7++;
      return this.s7 >= 0 && this.s7 < this.c8.size() ? this.c8.get_Item(this.s7) : null;
   }

   public final List<u9> i1() {
      return this.c8;
   }

   public final void e5() {
      this.s7 = -1;
      this.t2 = null;
      if (this.c8 != null) {
         List$Enumerator var1 = this.c8.iterator();

         try {
            while (var1.hasNext()) {
               u9 var2 = (u9)var1.next();
               var2.n5();
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var1, IDisposable.class)) {
               var1.dispose();
            }
         }
      }
   }

   public final boolean b3() {
      if (this.t2 != null) {
         boolean var1 = this.t2.l6();
         if (!var1) {
            if (this.s7 > 0) {
               this.s7--;
               this.t2 = this.c8.get_Item(this.s7);
            } else {
               this.t2 = null;
            }
         }
      }

      return this.t2 != null;
   }

   public final boolean o0() {
      return this.t2 != null && this.t2.k5();
   }

   public final z8 n5(boolean var1, boolean var2, boolean var3, boolean var4, String var5) {
      if (this.t2 == null) {
         this.t2 = this.z7();
         if (this.t2 == null) {
            this.x8.n5(this, this.u9, this.m_());
         }

         if (this.t2.u3() && !this.t2.n5(var5)) {
            throw new Exception("The current sub-sequence will not terminate whilst processing then main flow");
         }
      }

      z8 var6 = this.t2.n5(var1, var2, var3, var4);
      boolean var7 = true;

      while (var6 == null) {
         u9 var8 = this.z7();
         if (var8 == null) {
            this.x8.n5(this, this.u9, var7 & this.t2.a6(), this.m_());
            this.t2.n5();
            if (!this.t2.n5(var5)) {
               throw new Exception("The last simple-page-master does not reference the main flow");
            }

            var7 = false;
         } else {
            this.t2 = var8;
         }

         var6 = this.t2.n5(var1, var2, var3, var4);
         if (var6 == null && !var7) {
            throw new Exception("The current sub-sequence will not terminate whilst processing then main flow");
         }
      }

      return var6;
   }

   @Override
   public String z1() {
      return "page-sequence-master";
   }

   @Override
   public int z3() {
      return 54;
   }
}

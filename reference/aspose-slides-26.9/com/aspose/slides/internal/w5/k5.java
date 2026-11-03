package com.aspose.slides.internal.w5;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericEnumerable;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.internal.f5.d5;
import com.aspose.slides.internal.f5.e2;
import com.aspose.slides.internal.f5.r4;
import com.aspose.slides.internal.h0.z8;
import com.aspose.slides.internal.j3.z3;
import com.aspose.slides.internal.k5.k7;
import com.aspose.slides.internal.k5.m1;
import com.aspose.slides.internal.k5.m3;
import com.aspose.slides.internal.k5.s7;
import com.aspose.slides.internal.k5.y4;
import com.aspose.slides.internal.y4.z1;
import com.aspose.slides.ms.System.d1;

public class k5 extends com.aspose.slides.internal.h6.n5 implements k7 {
   public String l6 = null;
   private z8 k5;
   private boolean u3;
   private y4 a6;
   private m3 u9;
   private m3 h0;
   private Dictionary<String, z1> c8 = new Dictionary<>();
   private String t2 = "DEFAULT_STYLE";
   private com.aspose.slides.internal.k5.n5 s7;
   private com.aspose.slides.internal.t9.u3 x8 = null;

   public k5(e2 var1, com.aspose.slides.internal.f5.z1 var2) {
      this(var1, var2, true);
      this.u3 = true;
   }

   public k5(e2 var1, com.aspose.slides.internal.f5.z1 var2, boolean var3) {
      super(var1, var2);
      this.u3 = var3;
   }

   public void n5(a6 var1) {
      if (this.a3() != null) {
         if (this.a3().k7().h0() != 21) {
            if (this.u3) {
               var1.h0(this);
            } else {
               var1.n5(this);
            }

            this.l6(var1);
            if (this.u3) {
               var1.c8(this);
            } else {
               var1.l6(this);
            }
         }
      }
   }

   public final void l6(a6 var1) {
      if ((this.a3().k7().h0() == 6 || this.a3().k7().h0() == 7) && this.t4() != null) {
         switch (((k5)this.t4()).a3().k7().h0()) {
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
               return;
         }
      }

      for (r4 var2 = this.a0(); var2 != null; var2 = var2.s3()) {
         k5 var3 = com.aspose.slides.internal.v6g.k5.n5(var2, k5.class);
         if (var3 != null) {
            var3.n5(var1);
         } else {
            d5 var4 = com.aspose.slides.internal.v6g.k5.n5(var2, d5.class);
            if (var4 != null) {
               var1.n5(var4);
            }
         }
      }
   }

   public final com.aspose.slides.internal.t9.u3 a3() {
      return this.x8 == null ? (this.x8 = com.aspose.slides.internal.t9.u3.n5(this)) : this.x8;
   }

   public final k5 p3() {
      return com.aspose.slides.internal.v6g.k5.n5(this.y2(), k5.class);
   }

   public final <T> T n5(Class<T> var1) {
      for (k5 var2 = this.p3(); var2 != null; var2 = var2.p3()) {
         Object var3 = com.aspose.slides.internal.v6g.k5.n5(var2, var1);
         if (var3 != null) {
            return (T)var3;
         }
      }

      return null;
   }

   public final <T> T l6(Class<T> var1) {
      for (z3 var2 = this.t4(); var2 != null; var2 = var2.m1()) {
         Object var3 = com.aspose.slides.internal.v6g.k5.n5(var2, var1);
         if (var3 != null) {
            return (T)var3;
         }
      }

      return null;
   }

   protected final int l6(IGenericEnumerable<com.aspose.slides.internal.j3.z8> var1) {
      IGenericEnumerator var2 = var1.iterator();
      int var3 = -1;

      while (var2.hasNext()) {
         if (var2.next() == null) {
            return -1;
         }

         var3++;
         if (((com.aspose.slides.internal.j3.z8)var2.next()).equals(this)) {
            return var3;
         }
      }

      return -1;
   }

   protected final void k5(String var1, boolean var2) {
      if (var2 && !this.u9().n5(var1)) {
         this.u9().n5(com.aspose.slides.internal.v6g.k5.n5(this.y4().t2(var1), com.aspose.slides.internal.f5.n5.class));
      } else if (!var2 && this.u9().n5(var1)) {
         this.u9().k5(var1);
      }
   }

   public final z8 x9() {
      if (this.k5 == null) {
         this.k5 = ((m1)this.y4()).n5();
      }

      return this.k5;
   }

   @Override
   public final m3 k5() {
      if (this.h0 == null) {
         if (!this.t2("style")) {
            this.h0 = this.x9().l6(d1.n5, this);
         } else {
            String var1 = this.u3("style");
            if (var1 == null) {
               var1 = d1.n5;
            }

            String var2 = var1;
            if (d1.u3(var2, '&') != -1) {
               var2 = d1.n5(var2, "&quot;", "\"");
            }

            this.h0 = this.x9().l6(var2, this);
         }
      }

      return this.h0;
   }

   @Override
   public final z1 n5(String var1) {
      if (d1.n5(var1)) {
         var1 = this.t2;
      } else {
         var1 = d1.s7(var1);
      }

      return this.c8.containsKey(var1) ? this.c8.get_Item(var1) : null;
   }

   @Override
   public final void n5(String var1, z1 var2) {
      if (d1.n5(var1)) {
         var1 = this.t2;
      } else {
         var1 = d1.s7(var1);
      }

      if (this.c8.containsKey(var1)) {
         this.c8.set_Item(var1, var2);
      } else {
         this.c8.addItem(var1, var2);
      }
   }

   @Override
   public final m3 B_() {
      if (this.u9 == null) {
         this.u9 = this.x9().n5((com.aspose.slides.internal.k5.k7)(this));
      }

      return this.u9;
   }

   @Override
   public final y4 l6() {
      if (this.a6 == null) {
         this.a6 = this.x9().l6(this);
      }

      return this.a6;
   }

   public final s7 y0() {
      if (this.s7 == null) {
         this.s7 = new com.aspose.slides.internal.k5.n5(this.B_());
      }

      return this.s7;
   }
}

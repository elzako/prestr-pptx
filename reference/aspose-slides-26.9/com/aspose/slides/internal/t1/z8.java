package com.aspose.slides.internal.t1;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.Dictionary$ValueCollection$Enumerator;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.a3;
import com.aspose.slides.ms.System.d1;

public class z8 extends com.aspose.slides.internal.e5.t9 {
   private com.aspose.slides.internal.h2.n3 u9;
   private String h0;
   private com.aspose.slides.internal.f2.k5 c8;
   private com.aspose.slides.internal.f2.k5 t2;
   private com.aspose.slides.internal.f2.u3 s7;
   private com.aspose.slides.internal.v8.n3 x8;
   private Dictionary<String, x8> n3;
   private boolean y4 = false;
   private boolean e2 = false;
   private boolean t9 = false;
   private boolean z1 = false;
   private boolean t4 = false;

   public z8(com.aspose.slides.internal.e5.t2 var1) {
      super(var1);
   }

   @Override
   public void n5(com.aspose.slides.internal.e5.w1 var1) {
      this.u9 = var1.h0();
      this.h0 = var1.u3(153).j_();
      this.c8 = var1.u3(183).c8();
      this.t2 = var1.u3(186).c8();
      this.s7 = var1.u3(197).u9();
      this.x8 = com.aspose.slides.internal.v8.n3.n5(var1.u3(267).a6());
      if (d1.n5(this.h0)) {
         this.k5("master-name");
      }
   }

   @Override
   public void u9() {
      h0 var1 = (h0)this.n5;
      if (this.h0 == null) {
         this.k5("master-name");
      } else {
         var1.n5(this);
      }

      this.n3 = new Dictionary<>(5);
   }

   @Override
   public void c8() {
      if (!this.y4) {
         this.l6("(region-body, region-before?, region-after?, region-start?, region-end?)");
      }
   }

   @Override
   public void n5(com.aspose.slides.internal.w2.u9 var1, String var2, String var3) {
      if (d1.a6("http://www.w3.org/1999/XSL/Format", var2)) {
         if (d1.a6(var3, "region-body")) {
            if (this.y4) {
               this.n5(var1, "fo:region-body");
            } else {
               this.y4 = true;
            }
         } else if (d1.a6(var3, "region-before")) {
            if (!this.y4) {
               this.l6(var1, "fo:region-body", "fo:region-before");
            } else if (this.e2) {
               this.n5(var1, "fo:region-before");
            } else if (this.t9) {
               this.l6(var1, "fo:region-before", "fo:region-after");
            } else if (this.z1) {
               this.l6(var1, "fo:region-before", "fo:region-start");
            } else if (this.t4) {
               this.l6(var1, "fo:region-before", "fo:region-end");
            } else {
               this.e2 = true;
            }
         } else if (d1.a6(var3, "region-after")) {
            if (!this.y4) {
               this.l6(var1, "fo:region-body", "fo:region-after");
            } else if (this.t9) {
               this.n5(var1, "fo:region-after");
            } else if (this.z1) {
               this.l6(var1, "fo:region-after", "fo:region-start");
            } else if (this.t4) {
               this.l6(var1, "fo:region-after", "fo:region-end");
            } else {
               this.t9 = true;
            }
         } else if (d1.a6(var3, "region-start")) {
            if (!this.y4) {
               this.l6(var1, "fo:region-body", "fo:region-start");
            } else if (this.z1) {
               this.n5(var1, "fo:region-start");
            } else if (this.t4) {
               this.l6(var1, "fo:region-start", "fo:region-end");
            } else {
               this.z1 = true;
            }
         } else if (d1.a6(var3, "region-end")) {
            if (!this.y4) {
               this.l6(var1, "fo:region-body", "fo:region-end");
            } else if (this.t4) {
               this.n5(var1, "fo:region-end");
            } else {
               this.t4 = true;
            }
         } else {
            this.k5(var1, var2, var3);
         }
      }
   }

   @Override
   public boolean j5() {
      return true;
   }

   @Override
   public void n5(com.aspose.slides.internal.e5.t2 var1) {
      if (com.aspose.slides.internal.v6g.k5.l6(var1, x8.class)) {
         this.n5((x8)var1);
      } else {
         super.n5(var1);
      }
   }

   protected final void n5(x8 var1) {
      this.n3.set_Item(a3.l6(var1.z3()), var1);
   }

   public final com.aspose.slides.internal.f2.u9 a6(int var1) {
      return this.s7.u3() % 180 == 0
         ? new com.aspose.slides.internal.f2.t2(null, var1, this.o0().u3())
         : new com.aspose.slides.internal.f2.t2(null, var1, this.z7().u3());
   }

   public final com.aspose.slides.internal.f2.u9 u9(int var1) {
      return this.s7.u3() % 180 == 0
         ? new com.aspose.slides.internal.f2.t2(null, var1, this.z7().u3())
         : new com.aspose.slides.internal.f2.t2(null, var1, this.o0().u3());
   }

   public final x8 h0(int var1) {
      return this.n3.containsKey(a3.l6(var1)) ? this.n3.get_Item(a3.l6(var1)) : null;
   }

   public final Dictionary<String, x8> i1() {
      return this.n3;
   }

   public final boolean a6(String var1) {
      Dictionary$ValueCollection$Enumerator var2 = this.n3.getValues().iterator();

      try {
         while (var2.hasNext()) {
            x8 var3 = (x8)var2.next();
            if (d1.a6(var3.b3(), var1)) {
               return true;
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }

      return false;
   }

   public final com.aspose.slides.internal.h2.n3 e5() {
      return this.u9;
   }

   public final String b3() {
      return this.h0;
   }

   public final com.aspose.slides.internal.f2.k5 o0() {
      return this.t2;
   }

   public final com.aspose.slides.internal.f2.k5 z7() {
      return this.c8;
   }

   public final int v4() {
      return this.s7.u3();
   }

   public final com.aspose.slides.internal.v8.n3 u6() {
      return this.x8;
   }

   @Override
   public String z1() {
      return "simple-page-master";
   }

   @Override
   public int z3() {
      return 68;
   }
}

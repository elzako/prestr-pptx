package com.aspose.slides.internal.t1;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.Dictionary$ValueCollection$Enumerator;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.d1;

public class h0 extends com.aspose.slides.internal.e5.t9 {
   private Dictionary<String, z8> u9;
   private Dictionary<String, s7> h0;

   public h0(com.aspose.slides.internal.e5.t2 var1) {
      super(var1);
   }

   @Override
   public void n5(com.aspose.slides.internal.e5.w1 var1) {
   }

   @Override
   public void u9() {
      this.e2().n5(this);
      this.u9 = new Dictionary<>();
      this.h0 = new Dictionary<>();
   }

   @Override
   public void c8() {
      if (this.u3 == null) {
         this.l6("(simple-page-master|page-sequence-master)+");
      }

      this.i1();
      this.e5();
   }

   @Override
   public void n5(com.aspose.slides.internal.w2.u9 var1, String var2, String var3) {
      if (d1.a6("http://www.w3.org/1999/XSL/Format", var2) && !d1.a6(var3, "simple-page-master") && !d1.a6(var3, "page-sequence-master")) {
         this.k5(var1, var2, var3);
      }
   }

   private void i1() {
      Dictionary var1 = new Dictionary();
      Dictionary$ValueCollection$Enumerator var2 = this.u9.getValues().iterator();

      try {
         while (var2.hasNext()) {
            z8 var3 = (z8)var2.next();
            Dictionary var4 = var3.i1();
            Dictionary$ValueCollection$Enumerator var5 = var4.getValues().iterator();

            try {
               while (var5.hasNext()) {
                  x8 var6 = (x8)var5.next();
                  if (var1.containsKey(var6.b3())) {
                     String var7 = (String)var1.get_Item(var6.b3());
                     if (!d1.a6(var7, var6.i1())) {
                        this.y4().n5(this, var6.b3(), var7, var6.i1(), this.m_());
                     }
                  }

                  var1.set_Item(var6.b3(), var6.i1());
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var5, IDisposable.class)) {
                  var5.dispose();
               }
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }
   }

   private void e5() {
      Dictionary$ValueCollection$Enumerator var1 = this.h0.getValues().iterator();

      try {
         while (var1.hasNext()) {
            s7 var2 = (s7)var1.next();
            List$Enumerator var3 = var2.i1().iterator();

            try {
               while (var3.hasNext()) {
                  u9 var4 = (u9)var3.next();
                  var4.n5(this);
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
                  var3.dispose();
               }
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var1, IDisposable.class)) {
            var1.dispose();
         }
      }
   }

   public final void n5(z8 var1) {
      String var2 = var1.b3();
      if (this.c8(var2)) {
         this.y4().k5(this, this.t9(), var2, var1.m_());
      }

      this.u9.addItem(var2, var1);
   }

   private boolean c8(String var1) {
      return this.u9.containsKey(var1) || this.h0.containsKey(var1);
   }

   public final z8 a6(String var1) {
      return this.u9.containsKey(var1) ? this.u9.get_Item(var1) : null;
   }

   public final void n5(String var1, s7 var2) {
      if (this.c8(var1)) {
         this.y4().k5(this, this.t9(), var1, var2.m_());
      }

      this.h0.addItem(var1, var2);
   }

   public final s7 u9(String var1) {
      return this.h0.containsKey(var1) ? this.h0.get_Item(var1) : null;
   }

   public final boolean h0(String var1) {
      Dictionary$ValueCollection$Enumerator var2 = this.u9.getValues().iterator();

      try {
         while (var2.hasNext()) {
            z8 var3 = (z8)var2.next();
            if (var3.a6(var1)) {
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

   @Override
   public String z1() {
      return "layout-master-set";
   }

   @Override
   public int z3() {
      return 38;
   }
}

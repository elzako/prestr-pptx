package com.aspose.slides.internal.e6r;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.Dictionary$Enumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.o9b.y1;
import com.aspose.slides.internal.z4.a0;
import com.aspose.slides.internal.z4.t4;
import com.aspose.slides.internal.z4.z1;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.a3;
import com.aspose.slides.ms.System.d1;

public class c8 extends a0 {
   private String n5;
   private String k5;
   private String u3;
   private y1 a6 = new y1();
   private String u9;
   private int h0;
   private final String c8;
   private final String t2;
   private final String s7;
   private c8 x8;
   private final List<z1> n3;
   private final Dictionary<String, String> y4;

   public c8(com.aspose.slides.internal.z4.c8 var1, String var2, String var3, String var4) {
      super(var1);
      this.c8 = var2;
      this.t2 = var3;
      this.s7 = var4;
      this.n3 = new List<>();
      this.y4 = new Dictionary<>();
      this.n5(y1.n5.y4());
      this.n5(-1);
   }

   public c8(com.aspose.slides.internal.z4.c8 var1, String var2, c8 var3, String var4) {
      super(var1);
      this.c8 = var2;
      this.t2 = var3.t2();
      this.x8 = var3;
      this.s7 = var4;
      this.n3 = new List<>();
      this.y4 = new Dictionary<>();
      this.n5(y1.n5.y4());
      this.n5(-1);
   }

   public final String n5() {
      return this.c8;
   }

   public final String l6() {
      return this.n5;
   }

   public final void a6(String var1) {
      this.n5 = var1;
   }

   public final String z1() {
      return this.k5;
   }

   public final void u9(String var1) {
      this.k5 = var1;
   }

   public final String t4() {
      return this.u3;
   }

   public final void h0(String var1) {
      this.u3 = var1;
   }

   public final y1 q0() {
      return this.a6.y4();
   }

   public final void n5(y1 var1) {
      this.a6 = var1.y4();
   }

   public final String z3() {
      return this.u9;
   }

   public final void c8(String var1) {
      this.u9 = var1;
   }

   public final Dictionary<String, String> m1() {
      return this.y4;
   }

   public final c8 k7() {
      return this.x8;
   }

   public final int m3() {
      return this.h0;
   }

   public final void n5(int var1) {
      this.h0 = var1;
   }

   @Override
   public void n5(t4 var1) {
      var1.n5(this);
      var1.c8();
      var1.k5("/Type", "/StructElem");
      var1.k5("/S", this.c8);
      var1.k5("/P", this.t2);
      if (!d1.n5(this.s7)) {
         var1.k5("/Pg", this.s7);
      }

      if (y1.u3(this.q0(), y1.n5) || !d1.n5(this.z3()) || this.m1().size() > 0) {
         var1.n5("/A");
         var1.c8();
         if (y1.u3(this.q0(), y1.n5)) {
            var1.n5("/BBox", this.q0().y4());
         }

         if (y1.u3(this.q0(), y1.n5) || !d1.n5(this.z3())) {
            var1.k5("/O", "/Layout");
         }

         if (!d1.n5(this.z3())) {
            var1.k5("/Placement", this.z3());
         }

         if (this.m1().size() > 0) {
            Dictionary$Enumerator var2 = this.m1().iterator();

            try {
               while (var2.hasNext()) {
                  KeyValuePair var3 = (KeyValuePair)var2.next();
                  var1.k5((String)var3.getKey(), (String)var3.getValue());
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
                  var2.dispose();
               }
            }
         }

         var1.t2();
      }

      if (this.l6() != null) {
         var1.u3("/Alt", this.l6());
      }

      if (this.z1() != null) {
         var1.u3("/ActualText", this.z1());
      }

      var1.n5("/K");
      if (this.m3() > -1) {
         var1.u9();
         var1.n5(a3.l6(this.m3()));
      } else {
         var1.n5("[");

         for (int var7 = 0; var7 < this.n3.size(); var7++) {
            var1.n5(this.n3.get_Item(var7).t2());
            var1.u9();
         }

         var1.n5("]");
      }

      if (!d1.n5(this.t4())) {
         var1.u3("/Lang", this.t4());
      }

      var1.t2();
      var1.l6();

      for (int var8 = 0; var8 < this.n3.size(); var8++) {
         this.n3.get_Item(var8).n5(var1);
      }
   }

   public final c8 t2(String var1) {
      c8 var2 = new c8(this.h0(), "/Slide", this, var1);
      this.n3.addItem(var2);
      return var2;
   }

   public final c8 n5(String var1, y1 var2) {
      c8 var3 = new c8(this.h0(), "/Figure", this, this.s7);
      var3.a6(var1);
      var3.n5(var2.y4());
      var3.c8("/Block");
      this.n3.addItem(var3);
      return var3;
   }

   public final c8 s7(String var1) {
      c8 var2 = new c8(this.h0(), var1, this, this.s7);
      this.n3.addItem(var2);
      return var2;
   }

   public final c8 n5(String var1, String var2) {
      c8 var3 = new c8(this.h0(), var1, this, this.s7);
      var3.u9(var2);
      this.n3.addItem(var3);
      return var3;
   }

   public final c8 x8(String var1) {
      c8 var2 = new c8(this.h0(), "/Link", this, this.s7);
      var2.n3.addItem(new a6(this.h0(), var1, this.s7));
      this.n3.addItem(var2);
      return var2;
   }
}

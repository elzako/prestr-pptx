package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.ms.System.IDisposable;

class r3q extends com.aspose.slides.internal.v6g.h0<r3q> implements Comparable<r3q> {
   private int l6;
   private int k5;
   private TextFrame u3;
   private List<t3r> a6;
   public e2n n5;

   public r3q() {
      this.u3 = null;
      this.n5 = null;
   }

   public r3q(e2n var1, int var2, int var3) {
      this.n5 = var1;
      this.l6 = var2;
      this.k5 = var3;
      this.u3 = var1.l6.x8().k5();
      this.a6 = new List<>();
      List$Enumerator var4 = var1.u3().iterator();

      try {
         while (var4.hasNext()) {
            m4i var5 = (m4i)var4.next();
            t3r var6 = new t3r(this.u3, var1, var5);
            this.a6.addItem(var6);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      while (this.l6 < this.a6.size() - 1 && this.a6.get_Item(this.l6).k5() == 0) {
         this.l6++;
      }

      this.z1();
   }

   public final m4i n5() {
      return this.a6.get_Item(this.l6).n5();
   }

   public final char l6() {
      if (this.k5 >= 0 && this.n5() != null && com.aspose.slides.internal.v6g.k5.l6(this.n5().k5, Portion.class) && this.k5 < this.n5().l6.length()) {
         return this.n5().l6.charAt(this.k5);
      } else {
         return (char)(com.aspose.slides.internal.v6g.k5.l6(this.n5().k5, MathPortion.class) ? '\ue002' : '\u0000');
      }
   }

   public final r1f k5() {
      return this.k5 >= 0
            && this.n5() != null
            && com.aspose.slides.internal.v6g.k5.l6(this.n5().k5, MathPortion.class)
            && this.k5 < this.a6.get_Item(this.l6).k5()
         ? this.a6.get_Item(this.l6).l6().get_Item(this.a6())
         : null;
   }

   public final void u3() {
      if (this.k5 >= 0
         && this.n5() != null
         && com.aspose.slides.internal.v6g.k5.l6(this.n5().k5, MathPortion.class)
         && this.k5 < this.a6.get_Item(this.l6).k5()) {
         List var1 = this.a6.get_Item(this.l6).l6();
         List var2 = x5n.n5((r1f)var1.get_Item(this.a6()), this.u3.s7().d2().getWrapText(), new char[]{'+', '-'});
         if (var2.size() > 1) {
            var1.removeAt(this.a6());
            List$Enumerator var3 = var1.iterator();

            try {
               while (var3.hasNext()) {
                  r1f var4 = (r1f)var3.next();
                  var4.n5(((r1f)var2.get_Item(0)).l6());
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
                  var3.dispose();
               }
            }

            var1.insertRange(this.a6(), var2);
            this.a6.get_Item(this.l6).n5(var1);
            this.a6.get_Item(this.l6).n5(var1.size());
         }
      }
   }

   public final int a6() {
      return this.k5;
   }

   public final int u9() {
      return com.aspose.slides.internal.n2d.u9.m1(this.l6()) ? com.aspose.slides.internal.n2d.u9.n5(this.n5().l6, this.k5) : this.l6();
   }

   public final byte h0() {
      return com.aspose.slides.internal.n2d.u9.a6(this.u9());
   }

   private void z1() {
      List var1 = this.n5.u3();

      while (this.k5 < 0) {
         if (this.l6 <= 0) {
            this.k5 = -1;
            break;
         }

         this.l6--;
         this.k5 = this.k5 + this.a6.get_Item(this.l6).k5();
      }

      while (this.l6 + 1 < this.a6.size() && this.k5 >= this.a6.get_Item(this.l6).k5()) {
         this.k5 = this.k5 - this.a6.get_Item(this.l6).k5();
         this.l6++;
      }

      if (this.l6 >= this.a6.size() - 1 && this.k5 >= this.a6.get_Item(this.l6).k5()) {
         this.l6 = var1.size() - 1;
         this.k5 = this.a6.get_Item(this.l6).k5();
      }
   }

   public final int n5(r3q var1) {
      if (this.n5 != var1.n5) {
         throw new Exception("iterators mismatch");
      }

      if (this.l6 == var1.l6) {
         if (this.k5 == var1.k5) {
            return 0;
         } else {
            return this.k5 < var1.k5 ? -1 : 1;
         }
      } else {
         return this.l6 < var1.l6 ? -1 : 1;
      }
   }

   public final boolean l6(r3q var1) {
      if (this.n5 != var1.n5) {
         throw new Exception("iterators mismatch");
      } else {
         return this.l6 == var1.l6 && this.k5 == var1.k5;
      }
   }

   public final void c8() {
      this.k5++;
      this.z1();
   }

   public final void t2() {
      this.k5--;
      this.z1();
   }

   public final r3q s7() {
      r3q var1 = this.t9();
      var1.c8();
      return var1;
   }

   public final r3q x8() {
      r3q var1 = this.t9();
      var1.t2();
      return var1;
   }

   public static boolean n5(r3q var0, r3q var1) {
      return var0.l6(var1.t9());
   }

   public static boolean l6(r3q var0, r3q var1) {
      return var0.n5(var1.t9()) < 0;
   }

   static r3q n5(e2n var0) {
      return new r3q(var0, 0, 0);
   }

   final r3q n3() {
      r3q var1 = this.t9();
      t3r var2 = this.a6.get_Item(this.a6.size() - 1);
      var1.n5(this.a6.size() - 1, var2.k5());
      return var1;
   }

   final void n5(int var1, int var2) {
      this.l6 = var1;
      this.k5 = this.a6.get_Item(this.l6).k5();
      this.z1();
   }

   final r3q y4() {
      r3q var1 = this.t9();
      t3r var2 = this.a6.get_Item(this.a6.size() - 1);
      var1.n5(this.l6, var2.k5());
      return var1;
   }

   public final int e2() {
      return this.l6;
   }

   public void k5(r3q var1) {
      var1.l6 = this.l6;
      var1.k5 = this.k5;
      var1.u3 = this.u3;
      var1.a6 = this.a6;
      var1.n5 = this.n5;
   }

   public r3q t9() {
      r3q var1 = new r3q();
      this.k5(var1);
      return var1;
   }

   @Override
   public Object clone() {
      return this.t9();
   }

   @Override
   public int hashCode() {
      return com.aspose.slides.internal.n2d.q0.n5(this.l6, this.k5, this.n5);
   }

   private boolean u3(r3q var1) {
      return var1.l6 == this.l6
         && var1.k5 == this.k5
         && com.aspose.slides.ms.System.j8.n5(var1.u3, this.u3)
         && com.aspose.slides.ms.System.j8.n5(var1.a6, this.a6)
         && com.aspose.slides.ms.System.j8.n5(var1.n5, this.n5);
   }

   @Override
   public boolean equals(Object obj) {
      if (com.aspose.slides.ms.System.j8.l6(null, obj)) {
         return false;
      } else if (com.aspose.slides.ms.System.j8.l6(this, obj)) {
         return true;
      } else {
         return !(obj instanceof r3q) ? false : this.u3((r3q)obj);
      }
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public r3q Clone() {
      return this.t9();
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public void CloneTo(r3q bridgeArg0) {
      this.k5(bridgeArg0);
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public int compareTo(r3q bridgeArg0) {
      return this.n5(bridgeArg0);
   }

}

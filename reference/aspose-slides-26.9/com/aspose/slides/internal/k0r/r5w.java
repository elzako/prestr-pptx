package com.aspose.slides.internal.k0r;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.NotImplementedException;

public class r5w {
   private d2a n5;
   private final e6r l6;
   private int k5;
   private int u3;
   private w1n a6;
   private y8m u9;
   private m4d h0;
   private w4w c8;
   private c9t t2;
   private n8 s7;
   private q8g x8;
   private final List<z1n> n3 = new List<>();
   private final List<r6a> y4 = new List<>();
   private final List<b1> e2 = new List<>();

   public r5w(d2a var1) {
      this.n5 = var1;
      this.l6 = this.n5.l6();
   }

   public d2a n5() {
      return this.n5;
   }

   public boolean l6() {
      return (this.k5 & 65535) == 0;
   }

   public void n5(boolean var1) {
      if (var1) {
         this.s3();
      }
   }

   private void s3() {
      if ((this.k5 & 65535) != 0) {
         for (e6r var3 : this.d2()) {
            ((b1)var3).n5(null);
         }

         this.a6 = null;
         this.u9 = null;
         this.h0 = null;
         this.c8 = null;
         this.t2 = null;
         this.s7 = null;
         this.x8 = null;
         this.n3.clear();
         this.y4.clear();
         this.e2.clear();
         this.k5 = 0;
      }
   }

   boolean n5(int var1) {
      switch (var1) {
         case 1011:
            if ((this.k5 & 65535) != 0) {
               return false;
            }
            break;
         case 3998:
         case 4000:
         case 4008:
            if (this.u3(12)) {
               return false;
            }
            break;
         case 3999:
            if (this.a6() || this.u3(12)) {
               return false;
            }
      }

      return true;
   }

   private void n5(e6r var1) {
      switch (var1.w1().u3()) {
         case 1011:
            this.a6 = (w1n)var1;
            this.n5(1, true);
            break;
         case 3998:
            this.h0 = (m4d)var1;
            this.n5(8, true);
            break;
         case 3999:
            this.u9 = (y8m)var1;
            this.n5(2, true);
            break;
         case 4000:
         case 4008:
            this.h0 = (m4d)var1;
            this.n5(4, true);
            break;
         case 4001:
            this.c8 = (w4w)var1;
            this.n5(16, true);
            break;
         case 4002:
            this.s7 = (n8)var1;
            this.n5(64, true);
            break;
         case 4006:
            this.x8 = (q8g)var1;
            this.n5(128, true);
            break;
         case 4007:
            this.n3.addItem((z1n)var1);
            this.n5(256, true);
            break;
         case 4010:
            this.t2 = (c9t)var1;
            this.n5(32, true);
            break;
         case 4056:
         case 4087:
         case 4088:
         case 4089:
         case 4090:
         case 4117:
            this.y4.addItem((r6a)var1);
            this.n5(1024, true);
            this.l6(this.k5(var1.w1().u3()), true);
            break;
         case 4063:
         case 4082:
            this.e2.addItem((b1)var1);
            this.n5(512, true);
            break;
         default:
            this.n5(2048, true);
            throw new NotImplementedException();
      }
   }

   private int k5(int var1) {
      switch (var1) {
         case 4056:
            return 1;
         case 4087:
            return 2;
         case 4088:
            return 4;
         case 4089:
            return 8;
         case 4090:
            return 16;
         case 4117:
            return 32;
         default:
            return 0;
      }
   }

   public void n5(b1 var1) {
      this.n5((e6r)var1);
      var1.n5(this);
      ((e6r)var1).l6(this.l6);
   }

   public boolean k5() {
      return this.u3(1);
   }

   public boolean u3() {
      return this.u3(8);
   }

   public boolean a6() {
      return this.u3(2);
   }

   public boolean u9() {
      return this.u3(4);
   }

   public boolean h0() {
      return this.u3(16);
   }

   public boolean c8() {
      return this.u3(1024);
   }

   public boolean t2() {
      return this.u3(256);
   }

   public boolean s7() {
      return this.u3(32);
   }

   public boolean x8() {
      return this.u3(512);
   }

   public boolean n3() {
      return this.u3(128);
   }

   public boolean y4() {
      return this.u3(64);
   }

   public boolean e2() {
      return this.a6(1);
   }

   public boolean t9() {
      return this.a6(2);
   }

   public boolean z1() {
      return this.a6(4);
   }

   public boolean t4() {
      return this.a6(8);
   }

   public boolean q0() {
      return this.a6(16);
   }

   public w1n z3() {
      return this.a6;
   }

   public y8m m1() {
      return this.u9;
   }

   public q8g k7() {
      return this.x8;
   }

   public String m3() {
      if (this.u9()) {
         m4d var1 = this.h0;
         x1f var2 = var1 instanceof x1f ? (x1f)var1 : null;
         return var2 != null ? var2.l6() : ((k2p)this.h0).l6();
      } else {
         return null;
      }
   }

   public int z8() {
      if (this.u9()) {
         m4d var1 = this.h0;
         x1f var2 = var1 instanceof x1f ? (x1f)var1 : null;
         return var2 != null ? var2.l6().length() : ((k2p)this.h0).l6().length();
      } else {
         return 0;
      }
   }

   public final g9 j5() {
      return this.u3() ? (g9)this.h0 : null;
   }

   public w4w w1() {
      return this.c8;
   }

   public c9t r4() {
      return this.t2;
   }

   public List<z1n> c4() {
      return this.n3;
   }

   public List<r6a> y2() {
      return this.y4;
   }

   public List<b1> y1() {
      return this.e2;
   }

   public n8 a0() {
      return this.s7;
   }

   public final List<r6a> l6(int var1) {
      List var2 = new List();

      for (int var3 = 0; var3 < this.y4.size(); var3++) {
         if ((this.y4.get_Item(var3).w1().u3() & 65535) == var1) {
            var2.addItem(this.y4.get_Item(var3));
         }
      }

      return var2.size() > 0 ? var2 : null;
   }

   public List<e6r> d2() {
      List var1 = new List();
      if (this.k5()) {
         var1.addItem(this.a6);
      }

      if (this.u3()) {
         var1.addItem(this.h0);
      }

      if (this.a6()) {
         var1.addItem(this.u9);
      }

      if (this.u9()) {
         var1.addItem(this.h0);
      }

      if (this.h0()) {
         var1.addItem(this.c8);
      }

      if (this.c8()) {
         for (int var2 = 0; var2 < this.y4.size(); var2++) {
            var1.addItem(this.y4.get_Item(var2));
         }
      }

      if (this.t2()) {
         for (int var3 = 0; var3 < this.n3.size(); var3++) {
            var1.addItem(this.n3.get_Item(var3));
         }
      }

      if (this.s7()) {
         var1.addItem(this.t2);
      }

      if (this.x8()) {
         for (int var4 = 0; var4 < this.e2.size(); var4++) {
            var1.addItem((e6r)this.e2.get_Item(var4));
         }
      }

      if (this.n3()) {
         var1.addItem(this.x8);
      }

      if (this.y4()) {
         var1.addItem(this.s7);
      }

      return var1;
   }

   void n5(com.aspose.slides.internal.z0k.l6 var1) {
      List var2 = this.d2();

      for (int var3 = 0; var3 < var2.size(); var3++) {
         ((e6r)var2.get_Item(var3)).l6(var1);
      }
   }

   int d5() {
      int var1 = 0;
      List var2 = this.d2();

      for (int var3 = 0; var3 < var2.size(); var3++) {
         var1 += 8 + ((e6r)var2.get_Item(var3)).n5();
      }

      return var1;
   }

   private boolean u3(int var1) {
      return (this.k5 & 65535 & var1 & 4294967295L) != 0L;
   }

   private void n5(int var1, boolean var2) {
      this.k5 &= 65535 ^ var1 & 65535;
      if (var2) {
         this.k5 |= var1;
      }
   }

   private boolean a6(int var1) {
      return (this.u3 & 65535 & var1 & 4294967295L) != 0L;
   }

   private void l6(int var1, boolean var2) {
      this.u3 &= 65535 ^ var1 & 65535;
      if (var2) {
         this.u3 |= var1;
      }
   }
}

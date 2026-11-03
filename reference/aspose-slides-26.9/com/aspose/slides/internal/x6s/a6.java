package com.aspose.slides.internal.x6s;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericDictionary;
import com.aspose.slides.exceptions.XPathException;
import com.aspose.slides.internal.b8c.j9e;
import com.aspose.slides.internal.b8c.p6t;
import com.aspose.slides.internal.b8c.u4;
import com.aspose.slides.internal.b8c.v5;
import com.aspose.slides.internal.l7h.a5;
import com.aspose.slides.internal.v7y.i6;
import com.aspose.slides.internal.v7y.j9;
import com.aspose.slides.internal.v7y.n1;
import com.aspose.slides.internal.v7y.r8;
import com.aspose.slides.internal.v7y.t3;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.j8;
import com.aspose.slides.ms.System.v4;
import com.aspose.slides.ms.System.y8;
import com.aspose.slides.ms.System.Xml.a3;
import com.aspose.slides.ms.System.Xml.z9;

public abstract class a6 extends u3 implements n5, a3, v4 {
   public static final u9 n5 = new u9();
   public static final char[] l6 = new char[]{'R', 'E', 'A', 'N', 'T', 'S', 'W', 'P', 'C', 'X'};
   public static final char[] k5 = new char[]{
      'A',
      'B',
      'C',
      'D',
      'E',
      'F',
      'G',
      'H',
      'I',
      'J',
      'K',
      'L',
      'M',
      'N',
      'O',
      'P',
      'Q',
      'R',
      'S',
      'T',
      'U',
      'V',
      'W',
      'X',
      'Y',
      'Z',
      '1',
      '2',
      '3',
      '4',
      '5',
      '6'
   };
   public static final int[] u3 = new int[]{1, 2, 0, 0, 112, 32, 64, 128, 256, 2147483635};

   @Override
   public String toString() {
      return this.c8();
   }

   @Override
   public Object n5(y8 var1, a3 var2) {
      if (var2 == null) {
         var2 = this;
      }

      u4 var3 = this.k7();
      if (var3 != null) {
         if (var3.ak_() == 1) {
            j9e var4 = var3.al_();
            if (var4 == null) {
               var4 = var3.am_();
            }

            if (var4 != null) {
               return var4.z7().n5(this.c8(), var1, var2);
            }
         } else {
            j9e var6 = var3.am_();
            if (var6 != null) {
               v5 var5 = var6.b3();
               if (var5 != null) {
                  return var6.z7().n5(var5.n5(this.c8(), this.l6(), var2), var1, var2);
               }
            }
         }
      }

      return p6t.n5.n5(this.c8(), var1, var2);
   }

   @Override
   public a6 createNavigator() {
      return this.n5();
   }

   public abstract z9 l6();

   @Override
   public String n5(String var1) {
      if (var1 == null) {
         return null;
      }

      if (this.k5() != 1) {
         a6 var2 = this.n5();
         if (var2.q0()) {
            return var2.n5(var1);
         }
      } else if (this.k5(var1)) {
         String var3 = this.c8();
         this.q0();
         return var3;
      }

      if (var1.length() == 0) {
         return d1.n5;
      } else if ("xml".equals(var1)) {
         return "http://www.w3.org/XML/1998/namespace";
      } else {
         return "xmlns".equals(var1) ? "http://www.w3.org/2000/xmlns/" : null;
      }
   }

   @Override
   public String l6(String var1) {
      if (var1 == null) {
         return null;
      }

      a6 var2 = this.n5();
      if (this.k5() != 1) {
         if (var2.q0()) {
            return var2.l6(var1);
         }
      } else if (var2.l6(0)) {
         do {
            if (d1.a6(var1, var2.c8())) {
               return var2.u3();
            }
         } while (var2.k5(0));
      }

      if (d1.a6(var1, this.n5(d1.n5))) {
         return d1.n5;
      } else if ("http://www.w3.org/XML/1998/namespace".equals(var1)) {
         return "xml";
      } else {
         return "http://www.w3.org/2000/xmlns/".equals(var1) ? "xmlns" : null;
      }
   }

   @Override
   public IGenericDictionary<String, String> n5(int var1) {
      int var2 = this.k5();
      if (var2 != 1 && var1 != 2 || var2 == 2 || var2 == 3) {
         a6 var3 = this.n5();
         if (var3.q0()) {
            return var3.n5(var1);
         }
      }

      Dictionary var6 = new Dictionary();
      if (var1 == 0) {
         var6.set_Item("xml", "http://www.w3.org/XML/1998/namespace");
      }

      if (this.l6(var1)) {
         do {
            String var4 = this.u3();
            String var5 = this.c8();
            if (var4.length() != 0 || var5.length() != 0 || var1 == 2) {
               var6.set_Item(var4, var5);
            }
         } while (this.k5(var1));

         this.q0();
      }

      return var6;
   }

   public abstract a6 n5();

   public abstract int k5();

   public abstract String u3();

   public abstract String u9();

   public abstract String a6();

   public abstract String h0();

   public abstract String t2();

   public abstract boolean s7();

   public String x8() {
      a6 var1 = this.n5();

      while (!var1.l6("lang", "http://www.w3.org/XML/1998/namespace")) {
         if (!var1.q0()) {
            return d1.n5;
         }
      }

      return var1.c8();
   }

   public Object n3() {
      return null;
   }

   public boolean y4() {
      if (!this.e2()) {
         return false;
      }

      this.q0();
      return true;
   }

   public String n5(String var1, String var2) {
      if (!this.l6(var1, var2)) {
         return "";
      }

      String var3 = this.c8();
      this.q0();
      return var3;
   }

   public boolean l6(String var1, String var2) {
      if (this.e2()) {
         do {
            if (d1.a6(var1, this.u3()) && d1.a6(var2, this.a6())) {
               return true;
            }
         } while (this.t9());

         this.q0();
      }

      return false;
   }

   public abstract boolean e2();

   public abstract boolean t9();

   public boolean k5(String var1) {
      if (this.l6(0)) {
         do {
            if (d1.a6(var1, this.u3())) {
               return true;
            }
         } while (this.k5(0));

         this.q0();
      }

      return false;
   }

   public abstract boolean l6(int var1);

   public abstract boolean k5(int var1);

   public final boolean z8() {
      return this.l6(0);
   }

   public final boolean j5() {
      return this.k5(0);
   }

   public abstract boolean z1();

   public abstract boolean t4();

   public abstract boolean q0();

   public void z3() {
      while (this.q0()) {
      }
   }

   public abstract boolean n5(a6 var1);

   public abstract boolean u3(String var1);

   public boolean k5(String var1, String var2) {
      if (this.t4()) {
         do {
            if (this.k5() == 1 && d1.a6(var1, this.u3()) && d1.a6(var2, this.a6())) {
               return true;
            }
         } while (this.z1());

         this.q0();
      }

      return false;
   }

   public boolean u3(int var1) {
      if (this.t4()) {
         int var2 = h0(var1);

         do {
            if ((1 << this.k5() & var2) != 0) {
               return true;
            }
         } while (this.z1());

         this.q0();
      }

      return false;
   }

   public boolean n5(String var1, String var2, a6 var3) {
      a6 var4 = this.n5();
      if (var3 != null) {
         switch (var3.k5()) {
            case 2:
            case 3:
               var3 = var3.n5();
               var3.w1();
         }
      }

      switch (this.k5()) {
         case 2:
         case 3:
            if (!this.q0()) {
               return false;
            }
      }

      do {
         if (!this.t4()) {
            while (!this.z1()) {
               if (!this.q0()) {
                  this.n5(var4);
                  return false;
               }
            }
         }

         if (var3 != null && this.l6(var3)) {
            this.n5(var4);
            return false;
         }
      } while (this.k5() != 1 || !d1.a6(var1, this.u3()) || !d1.a6(var2, this.a6()));

      return true;
   }

   public boolean n5(int var1, a6 var2) {
      a6 var3 = this.n5();
      int var4 = h0(var1);
      if (var2 != null) {
         switch (var2.k5()) {
            case 2:
            case 3:
               var2 = var2.n5();
               var2.w1();
         }
      }

      switch (this.k5()) {
         case 2:
         case 3:
            if (!this.q0()) {
               return false;
            }
      }

      do {
         if (!this.t4()) {
            while (!this.z1()) {
               if (!this.q0()) {
                  this.n5(var3);
                  return false;
               }
            }
         }

         if (var2 != null && this.l6(var2)) {
            this.n5(var3);
            return false;
         }
      } while ((1 << this.k5() & var4) == 0);

      return true;
   }

   public boolean u3(String var1, String var2) {
      a6 var3 = this.n5();

      while (this.z1()) {
         if (this.k5() == 1 && d1.a6(var1, this.u3()) && d1.a6(var2, this.a6())) {
            return true;
         }
      }

      this.n5(var3);
      return false;
   }

   public boolean a6(int var1) {
      a6 var2 = this.n5();
      int var3 = h0(var1);

      while (this.z1()) {
         if ((1 << this.k5() & var3) != 0) {
            return true;
         }
      }

      this.n5(var2);
      return false;
   }

   public boolean m1() {
      if (this.t4()) {
         this.q0();
         return true;
      } else {
         return false;
      }
   }

   public abstract boolean l6(a6 var1);

   public boolean k5(a6 var1) {
      if (var1 != null) {
         var1 = var1.n5();

         while (var1.q0()) {
            if (var1.l6(this)) {
               return true;
            }
         }
      }

      return false;
   }

   public int u3(a6 var1) {
      if (var1 == null) {
         return 3;
      }

      if (this.l6(var1)) {
         return 2;
      }

      a6 var2 = this.n5();
      a6 var3 = var1.n5();
      int var4 = a6(var2.n5());
      int var5 = a6(var3.n5());
      if (var4 > var5) {
         while (var4 > var5) {
            var2.q0();
            var4--;
         }

         if (var2.l6(var3)) {
            return 1;
         }
      }

      if (var5 > var4) {
         while (var5 > var4) {
            var3.q0();
            var5--;
         }

         if (var2.l6(var3)) {
            return 0;
         }
      }

      a6 var6 = var2.n5();
      a6 var7 = var3.n5();

      while (var6.q0() && var7.q0()) {
         if (var6.l6(var7)) {
            if (!"Microsoft.VisualStudio.Modeling.StoreNavigator".equals(j8.n5(var2).toString())) {
            }

            return this.n5(var2, var3);
         }

         var2.q0();
         var3.q0();
      }

      return 3;
   }

   public u4 k7() {
      return com.aspose.slides.internal.v6g.k5.n5(this, u4.class);
   }

   public k5 a6(String var1) {
      return com.aspose.slides.internal.x6s.k5.n5(var1);
   }

   public h0 u9(String var1) {
      return this.n5(com.aspose.slides.internal.x6s.k5.n5(var1));
   }

   public h0 n5(k5 var1) {
      h0 var2 = com.aspose.slides.internal.v6g.k5.n5(this.l6(var1), h0.class);
      if (var2 == null) {
         throw XPathException.create("Expression must evaluate to a node-set.");
      } else {
         return var2;
      }
   }

   public Object l6(k5 var1) {
      return this.n5(var1, null);
   }

   public Object n5(k5 var1, h0 var2) {
      t3 var3 = com.aspose.slides.internal.v6g.k5.n5(var1, t3.class);
      if (var3 == null) {
         throw XPathException.create("This is an invalid object. Only objects returned from Compile() can be passed as input.");
      }

      j9 var4 = j9.n5(var3.l6());
      var4.t2();
      if (var2 == null) {
         var2 = new r8(this.n5(), true);
      }

      Object var5 = var4.n5(var2);
      return com.aspose.slides.internal.v6g.k5.l6(var5, h0.class) ? new i6(var2.k5(), var4) : var5;
   }

   public h0 u9(int var1) {
      return new n1(this.n5(), var1);
   }

   public h0 a6(String var1, String var2) {
      return new n1(this.n5(), var1, var2);
   }

   public h0 n5(int var1, boolean var2) {
      return new com.aspose.slides.internal.v7y.d1(this.n5(), var1, var2);
   }

   public h0 n5(String var1, String var2, boolean var3) {
      return new com.aspose.slides.internal.v7y.d1(this.n5(), var1, var2, var3);
   }

   public final boolean w1() {
      if (this.k5() == 0) {
         return false;
      }

      if (this.z1()) {
         return true;
      }

      a6 var1 = this.n5();
      if (!this.q0()) {
         return false;
      }

      switch (var1.k5()) {
         case 2:
         case 3:
            if (this.t4()) {
               return true;
            }
         default:
            while (!this.z1()) {
               if (!this.q0()) {
                  this.n5(var1);
                  return false;
               }
            }

            return true;
      }
   }

   public final long r4() {
      a6 var1 = this.n5();
      long var2 = 0L;
      switch (this.k5()) {
         case 2:
            while (var1.t9()) {
               var2++;
            }
            break;
         case 3:
            while (var1.j5()) {
               var2++;
            }
            break;
         default:
            while (var1.z1()) {
               var2++;
            }
      }

      return var2;
   }

   public String c4() {
      a6 var1 = this.n5();
      a5 var2 = new a5();
      var2.n5(l6[this.k5()]);

      while (true) {
         long var3 = var1.r4();
         if (!var1.q0()) {
            return var2.toString();
         }

         if ((var3 & 4294967295L) <= 31L) {
            var2.n5(k5[(int)var3]);
         } else {
            var2.n5('0');

            do {
               var2.n5(k5[(int)(var3 & 4294967295L & 31L & 4294967295L)]);
               var3 = (var3 & 4294967295L) >> 5 & 4294967295L;
            } while ((var3 & 4294967295L) != 0L);

            var2.n5('0');
         }
      }
   }

   private static int a6(a6 var0) {
      int var1 = 0;

      while (var0.q0()) {
         var1++;
      }

      return var1;
   }

   private int n5(a6 var1, a6 var2) {
      int var3 = 0;
      switch (var1.k5()) {
         case 2:
            var3++;
         case 3:
            break;
         default:
            var3 += 2;
      }

      switch (var2.k5()) {
         case 2:
            if (--var3 == 0) {
               while (var1.t9()) {
                  if (var1.l6(var2)) {
                     return 0;
                  }
               }
            }
            break;
         case 3:
            if (var3 == 0) {
               while (var1.j5()) {
                  if (var1.l6(var2)) {
                     return 0;
                  }
               }
            }
            break;
         default:
            var3 -= 2;
            if (var3 == 0) {
               while (var1.z1()) {
                  if (var1.l6(var2)) {
                     return 0;
                  }
               }
            }
      }

      return var3 < 0 ? 0 : 1;
   }

   public static int h0(int var0) {
      return u3[var0];
   }

   public static int c8(int var0) {
      if (var0 == 9) {
         return Integer.MAX_VALUE;
      } else {
         return var0 == 4 ? 112 : 1 << var0;
      }
   }

   public static boolean t2(int var0) {
      return (var0 - 4 & 4294967295L) <= 2L;
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public a6 deepClone() {
      return this.n5();
   }

}

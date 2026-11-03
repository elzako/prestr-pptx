package com.aspose.slides.ms.System.Xml;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.ms.System.IDisposable;

public abstract class c7 implements IDisposable {
   private static long n5 = 24600L;
   private static long l6 = 123324L;
   private static long k5 = 157084L;

   public w4 n5() {
      return null;
   }

   public abstract int s7();

   public String x8() {
      return this.e2().length() == 0 ? this.n3() : this.y1().n5(com.aspose.slides.ms.System.d1.n5(new String[]{this.e2(), ":", this.n3()}));
   }

   public abstract String n3();

   public abstract String y4();

   public abstract String e2();

   public boolean t9() {
      return a6(this.s7());
   }

   public abstract String z1();

   public abstract int t4();

   public abstract String q0();

   public abstract boolean m1();

   public boolean l6() {
      return false;
   }

   public char d5() {
      return '"';
   }

   public int k7() {
      return 0;
   }

   public com.aspose.slides.internal.b8c.u4 m3() {
      return com.aspose.slides.internal.v6g.k5.n5(this, com.aspose.slides.internal.b8c.u4.class);
   }

   public abstract int z8();

   public abstract String u3(String var1);

   public abstract String k5(int var1);

   public abstract boolean k5(String var1);

   public void l6(int var1) {
      if (var1 >= 0 && var1 < this.z8()) {
         this.a6();
         this.k5();

         for (int var2 = 0; var2 < var1; var2++) {
            this.u3();
         }
      } else {
         throw new ArgumentOutOfRangeException("i");
      }
   }

   public abstract boolean k5();

   public abstract boolean u3();

   public abstract boolean a6();

   public abstract boolean c8();

   public abstract boolean u9();

   public abstract boolean j5();

   public void w1() {
   }

   public abstract int h0();

   public void r4() {
      if (this.h0() == 1) {
         this.t2();
      }
   }

   public abstract z9 y1();

   public abstract String n5(String var1);

   public boolean z3() {
      return false;
   }

   public abstract void a0();

   public boolean s3() {
      return false;
   }

   public int n5(char[] var1, int var2, int var3) {
      throw new NotSupportedException(
         v3.n5("ReadValueChunk method is not supported on this XmlReader. Use CanReadValueChunk property to find out if an XmlReader implements it.")
      );
   }

   public String c4() {
      if (this.h0() != 1) {
         return com.aspose.slides.ms.System.d1.n5;
      }

      this.a6();
      if (this.s7() == 1) {
         if (this.m1()) {
            return com.aspose.slides.ms.System.d1.n5;
         }

         if (!this.u9()) {
            throw new InvalidOperationException(v3.n5("Operation is not valid due to the current state of the object."));
         }

         if (this.s7() == 15) {
            return com.aspose.slides.ms.System.d1.n5;
         }
      }

      String var1 = com.aspose.slides.ms.System.d1.n5;

      while (u3(this.s7())) {
         var1 = com.aspose.slides.ms.System.d1.n5(var1, this.z1());
         if (!this.u9()) {
            break;
         }
      }

      return var1;
   }

   public int p8() {
      while (true) {
         switch (this.s7()) {
            case 1:
            case 3:
            case 4:
            case 5:
            case 15:
            case 16:
               return this.s7();
            case 2:
               this.a6();
               return this.s7();
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            default:
               if (!this.u9()) {
                  return this.s7();
               }
         }
      }
   }

   public boolean f2() {
      return this.p8() == 1;
   }

   public boolean a6(String var1) {
      if (var1 != null && var1.length() != 0) {
         var1 = this.y1().n5(var1);

         while (this.u9()) {
            if (this.s7() == 1 && v8.n5(var1, this.x8())) {
               return true;
            }
         }

         return false;
      } else {
         throw f4.n5(var1, "name");
      }
   }

   public boolean n5(String var1, String var2) {
      if (var1 == null || var1.length() == 0) {
         throw f4.n5(var1, "localName");
      }

      if (var2 == null) {
         throw new ArgumentNullException("namespaceURI");
      }

      int var3 = this.t4();
      if (this.s7() != 1) {
         if (this.h0() != 0) {
            return false;
         }

         var3--;
      } else if (this.m1()) {
         return false;
      }

      var1 = this.y1().n5(var1);
      var2 = this.y1().n5(var2);

      while (this.u9() && this.t4() > var3) {
         if (this.s7() == 1 && v8.n5(var1, this.n3()) && v8.n5(var2, this.y4())) {
            return true;
         }
      }

      return false;
   }

   public String i1() {
      if (this.h0() != 1) {
         return com.aspose.slides.ms.System.d1.n5;
      }

      if (this.s7() != 2 && this.s7() != 1) {
         this.u9();
         return com.aspose.slides.ms.System.d1.n5;
      }

      com.aspose.slides.internal.z0k.r4 var1 = new com.aspose.slides.internal.z0k.r4(com.aspose.slides.internal.x7n.l6.k5());
      l1 var2 = this.n5(var1);

      try {
         if (this.s7() == 2) {
            ((k3)var2).k5(this.d5());
            this.n5(var2);
         }

         if (this.s7() == 1) {
            this.n5(var2, false);
         }
      } finally {
         var2.a6();
      }

      return var1.toString();
   }

   private void n5(l1 var1, boolean var2) {
      int var3 = this.s7() == 0 ? -1 : this.t4();

      while (this.u9() && var3 < this.t4()) {
         switch (this.s7()) {
            case 1:
               var1.n5(this.e2(), this.n3(), this.y4());
               ((k3)var1).k5(this.d5());
               var1.n5(this, var2);
               if (this.m1()) {
                  var1.s7();
               }
            case 2:
            case 6:
            case 9:
            case 11:
            case 12:
            case 16:
            default:
               break;
            case 3:
               var1.l6(this.z1());
               break;
            case 4:
               var1.a6(this.z1());
               break;
            case 5:
               var1.k5(this.x8());
               break;
            case 7:
            case 17:
               var1.n5(this.x8(), this.z1());
               break;
            case 8:
               var1.u9(this.z1());
               break;
            case 10:
               var1.n5(this.x8(), this.u3("PUBLIC"), this.u3("SYSTEM"), this.z1());
               break;
            case 13:
            case 14:
               var1.h0(this.z1());
               break;
            case 15:
               var1.x8();
         }
      }

      if (var3 == this.t4() && this.s7() == 15) {
         this.u9();
      }
   }

   private void n5(l1 var1) {
      String var2 = this.x8();

      while (this.c8()) {
         if (this.s7() == 5) {
            var1.k5(this.x8());
         } else {
            var1.l6(this.z1());
         }
      }

      this.k5(var2);
   }

   public String e5() {
      if (this.h0() != 1) {
         return com.aspose.slides.ms.System.d1.n5;
      }

      if (this.s7() != 2 && this.s7() != 1) {
         this.u9();
         return com.aspose.slides.ms.System.d1.n5;
      }

      com.aspose.slides.internal.z0k.r4 var1 = new com.aspose.slides.internal.z0k.r4(com.aspose.slides.internal.x7n.l6.k5());
      l1 var2 = this.n5(var1);

      try {
         if (this.s7() == 2) {
            var2.u3(this.e2(), this.n3(), this.y4());
            this.n5(var2);
            var2.l6();
         } else {
            var2.l6(this, false);
         }
      } finally {
         var2.a6();
      }

      return var1.toString();
   }

   private l1 n5(com.aspose.slides.internal.z0k.r4 var1) {
      k3 var2 = new k3(var1);
      this.n5(var2);
      return var2;
   }

   private void n5(k3 var1) {
      p5 var2 = com.aspose.slides.internal.v6g.k5.n5(this, p5.class);
      if (var2 != null) {
         var1.k5(var2.t2());
      } else {
         l8 var3 = com.aspose.slides.internal.v6g.k5.n5(this, l8.class);
         if (var3 != null) {
            var1.k5(var3.z7());
         }
      }
   }

   public boolean y2() {
      return this.z8() > 0;
   }

   @Override
   public final void dispose() {
      this.n5(true);
   }

   protected void n5(boolean var1) {
      if (var1 && this.h0() != 4) {
         this.w1();
      }
   }

   public s2 b3() {
      return null;
   }

   public static boolean u3(int var0) {
      return 0L != (n5 & 4294967295L & 1 << var0 & 4294967295L);
   }

   public static boolean a6(int var0) {
      return 0L != (k5 & 4294967295L & 1 << var0 & 4294967295L);
   }

   private boolean t2() {
      this.a6();
      if (this.s7() == 1 && !this.m1()) {
         int var1 = this.t4();

         while (this.u9() && var1 < this.t4()) {
         }

         return this.s7() == 15 ? this.u9() : false;
      } else {
         return this.u9();
      }
   }

   public final boolean o0() {
      if (this.l6()) {
         return true;
      }

      com.aspose.slides.internal.b8c.u4 var1 = this.m3();
      return var1 != null && var1.l6();
   }

   public z7 d2() {
      return null;
   }

   public static int n5(c7 var0) {
      b0 var1 = l6(var0);
      return var1 != null ? var1.n1() : 2;
   }

   private static b0 l6(c7 var0) {
      b0 var1 = com.aspose.slides.internal.v6g.k5.n5(var0, b0.class);
      if (var1 != null) {
         return var1;
      }

      p5 var2 = com.aspose.slides.internal.v6g.k5.n5(var0, p5.class);
      if (var2 != null) {
         return var2.u6();
      }

      s8 var3 = com.aspose.slides.internal.v6g.k5.n5(var0, s8.class);
      if (var3 != null) {
         return var3.v4();
      }

      l8 var4 = com.aspose.slides.internal.v6g.k5.n5(var0, l8.class);
      return var4 != null ? var4.v4().v4() : null;
   }

   public static c7 u9(String var0) {
      return n5(var0, (w4)null, (b1)null);
   }

   public static c7 n5(String var0, w4 var1, b1 var2) {
      if (var1 == null) {
         var1 = new w4();
      }

      return var1.n5(var0, var2);
   }

   public static c7 n5(com.aspose.slides.internal.z0k.t4 var0) {
      return n5(var0, (w4)null, com.aspose.slides.ms.System.d1.n5);
   }

   public static c7 n5(com.aspose.slides.internal.z0k.t4 var0, w4 var1, String var2) {
      if (var1 == null) {
         var1 = new w4();
      }

      return var1.n5(var0, null, var2, null);
   }

   public static c7 n5(com.aspose.slides.internal.z0k.y1 var0) {
      return n5(var0, (w4)null, com.aspose.slides.ms.System.d1.n5);
   }

   public static c7 n5(com.aspose.slides.internal.z0k.y1 var0, w4 var1) {
      return n5(var0, var1, com.aspose.slides.ms.System.d1.n5);
   }

   public static c7 n5(com.aspose.slides.internal.z0k.y1 var0, w4 var1, String var2) {
      if (var1 == null) {
         var1 = new w4();
      }

      return var1.n5(var0, var2, null);
   }

   public static c7 n5(com.aspose.slides.internal.z0k.y1 var0, w4 var1, b1 var2) {
      if (var1 == null) {
         var1 = new w4();
      }

      return var1.n5(var0, com.aspose.slides.ms.System.d1.n5, var2);
   }

   public static c7 n5(c7 var0, w4 var1) {
      if (var1 == null) {
         var1 = new w4();
      }

      return var1.n5(var0);
   }

   public static int l6(com.aspose.slides.internal.z0k.t4 var0) {
      int var1 = 4096;
      if (var0.canSeek()) {
         long var2 = var0.getLength();
         if (var2 < var1) {
            var1 = (int)var2;
         } else if (var2 > 65536L) {
            var1 = 8192;
         }
      }

      return var1;
   }
}

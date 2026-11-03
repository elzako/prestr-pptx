package com.aspose.slides.internal.e5a;

import com.aspose.slides.Collections.Generic.IGenericEnumerable;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.exceptions.IOException;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.e5;
import com.aspose.slides.ms.System.q1;

public class d2 implements IGenericEnumerable<y2>, IDisposable {
   private boolean s7;
   private int x8;
   private boolean n3;
   private int y4;
   public static final com.aspose.slides.internal.l7h.j5 n5 = com.aspose.slides.internal.n2d.x8.n5("IBM437");
   private int e2;
   private int t9;
   private q0 z1;
   private w1 t4;
   private boolean q0;
   private com.aspose.slides.internal.z0k.a0 z3;
   private boolean m1;
   private com.aspose.slides.internal.z0k.t4 k7;
   private com.aspose.slides.internal.z0k.t4 m3;
   private boolean z8;
   private List<y2> j5;
   private boolean w1;
   private String r4;
   private String c4;
   public String l6;
   private boolean y2 = true;
   private boolean y1;
   private int a0 = 0;
   private long d2;
   private boolean d5;
   private String s3;
   private boolean p8;
   private boolean f2;
   private String i1;
   private boolean e5 = true;
   private Object b3 = new Object();
   private boolean o0;
   private boolean z7;
   private int v4;
   private boolean u6;
   private boolean t1;
   private long a5 = -1L;
   private byte h2;
   public boolean k5;
   private com.aspose.slides.internal.l7h.j5 v0 = com.aspose.slides.internal.n2d.x8.n5("IBM437");
   private int f0 = 8192;
   public int u3 = 0;
   private com.aspose.slides.ms.System.i1 a3;
   public final com.aspose.slides.internal.v6g.n5<com.aspose.slides.ms.System.i1> a6 = new d2$1(this);
   private com.aspose.slides.ms.System.i1 p3;
   public final com.aspose.slides.internal.v6g.n5<com.aspose.slides.ms.System.i1> u9 = new d2$2(this);
   private long x9 = -99L;
   private com.aspose.slides.ms.System.i1 y0;
   public final com.aspose.slides.internal.v6g.n5<com.aspose.slides.ms.System.i1> h0 = new d2$3(this);
   private com.aspose.slides.ms.System.i1 j9;
   public final com.aspose.slides.internal.v6g.n5<com.aspose.slides.ms.System.i1> c8 = new d2$4(this);
   private com.aspose.slides.ms.System.i1 z6;
   public final com.aspose.slides.internal.v6g.n5<com.aspose.slides.ms.System.i1> t2 = new d2$5(this);

   public final boolean n5() {
      return this.s7;
   }

   public final int l6() {
      return this.f0;
   }

   public final int k5() {
      return this.x8;
   }

   public final boolean u3() {
      return this.n3;
   }

   public final int a6() {
      return this.a0;
   }

   public final String u9() {
      return this.r4;
   }

   public final int h0() {
      return this.y4;
   }

   public final void n5(int var1) {
      this.y4 = var1;
   }

   public final String c8() {
      return this.c4;
   }

   public final void n5(String var1) {
      this.c4 = var1;
      this.p8 = true;
   }

   public final boolean t2() {
      return this.z3 != null;
   }

   public final boolean s7() {
      return this.m1;
   }

   public final int x8() {
      return this.u3;
   }

   public final void l6(int var1) {
      this.u3 = var1;
   }

   public final com.aspose.slides.internal.l7h.j5 n3() {
      return this.v0;
   }

   public final void n5(com.aspose.slides.internal.l7h.j5 var1) {
      this.v0 = var1;
   }

   public final com.aspose.slides.internal.z0k.a0 y4() {
      return this.z3;
   }

   public final boolean e2() {
      return this.w1;
   }

   public final void n5(boolean var1) {
      this.w1 = var1;
   }

   public final String t9() {
      return this.i1;
   }

   public final int z1() {
      return this.e2;
   }

   public final int t4() {
      return this.t9;
   }

   public final int q0() {
      return this.v4;
   }

   public final q0 z3() {
      return this.z1;
   }

   public final w1 m1() {
      return this.t4;
   }

   public final boolean k7() {
      return this.q0;
   }

   public final void l6(boolean var1) {
      this.q0 = var1;
   }

   @Override
   public String toString() {
      return d1.n5("ZipFile/{0}", new Object[]{this.u9()});
   }

   public final void m3() {
      this.p8 = true;
   }

   public final com.aspose.slides.internal.z0k.t4 z8() {
      if (this.k7 == null && this.r4 != null) {
         try {
            this.k7 = com.aspose.slides.internal.z0k.u9.u3(this.r4);
            this.e5 = true;
         } catch (IOException var2) {
            throw new a0("Error opening the file", var2);
         }
      }

      return this.k7;
   }

   public final void j5() {
      if (this.u6) {
         d2 var1 = new d2();
         var1.r4 = this.r4;
         var1.n5(this.n3());
         n5(var1);
         IGenericEnumerator var2 = var1.iterator();

         try {
            while (var2.hasNext()) {
               y2 var3 = (y2)var2.next();
               IGenericEnumerator var4 = this.iterator();

               try {
                  while (var4.hasNext()) {
                     y2 var5 = (y2)var4.next();
                     if (d1.a6(var3.u3(), var5.u3())) {
                        var5.n5(var3);
                     }
                  }
               } finally {
                  if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
                     var4.dispose();
                  }
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
               var2.dispose();
            }
         }

         this.u6 = false;
      }
   }

   public d2(String var1) {
      try {
         this.n5(var1, null);
      } catch (RuntimeException var3) {
         throw new a0(d1.n5("{0} is not a valid zip file", new Object[]{var1}), var3);
      }
   }

   public d2() {
      this.n5((String)null, (com.aspose.slides.internal.z0k.a0)null);
   }

   private void n5(String var1, com.aspose.slides.internal.z0k.a0 var2) {
      this.r4 = var1;
      this.z3 = var2;
      this.p8 = true;
      this.n5(6);
      this.j5 = new List<>();
      if (com.aspose.slides.internal.z0k.u9.k5(this.r4)) {
         if (this.n5()) {
            u3(this);
         } else {
            n5(this);
         }

         this.d5 = true;
      }
   }

   public final y2 k5(int var1) {
      return this.j5.get_Item(var1);
   }

   public final y2 l6(String var1) {
      String var2 = d1.a6(d1.n5(var1, '\\', '/'), '/');
      int var3 = this.s7() ? 2 : 3;
      List$Enumerator var4 = this.j5.iterator();

      try {
         while (var4.hasNext()) {
            y2 var5 = (y2)var4.next();
            if (d1.u3(var2, d1.a6(var5.u3(), '/'), (short)var3)) {
               return var5;
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      return null;
   }

   public final List<String> w1() {
      List var1 = new List();
      List$Enumerator var2 = this.j5.iterator();

      try {
         while (var2.hasNext()) {
            y2 var3 = (y2)var2.next();
            var1.addItem(var3.u3());
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }

      return var1;
   }

   public final List<y2> r4() {
      return this.j5;
   }

   public final int c4() {
      return this.j5.size();
   }

   public final void n5(y2 var1) {
      if (!this.j5.containsItem(var1)) {
         throw new ArgumentException("The entry you specified does not exist in the zip archive.");
      }

      this.j5.removeItem(var1);
      this.p8 = true;
   }

   public final void k5(String var1) {
      String var2 = com.aspose.slides.internal.e5a.y2.n5(var1, null);
      y2 var3 = this.l6(var2);
      if (var3 == null) {
         throw new ArgumentException("The entry you specified was not found in the zip archive.");
      }

      this.n5(var3);
   }

   @Override
   public final void dispose() {
      this.k5(true);
      com.aspose.slides.ms.System.e5.n5(this);
   }

   protected void k5(boolean var1) {
      if (!this.z8) {
         if (var1) {
            if (this.e5 && this.k7 != null) {
               this.k7.close();
               this.k7 = null;
            }

            if (this.s3 != null && this.r4 != null && this.m3 != null) {
               this.m3.close();
               this.m3 = null;
            }
         }

         this.z8 = true;
      }
   }

   private com.aspose.slides.internal.z0k.t4 a0() {
      if (this.m3 == null && this.r4 != null) {
         if (".".equals(this.t9())) {
            this.s3 = com.aspose.slides.internal.e5a.k7.n5();
         } else if (this.t9() != null) {
            this.s3 = com.aspose.slides.internal.z0k.z1.l6(this.t9(), com.aspose.slides.internal.e5a.k7.n5());
         } else {
            String var1 = com.aspose.slides.internal.z0k.z1.u9(this.r4);
            this.s3 = com.aspose.slides.internal.z0k.z1.l6(var1, com.aspose.slides.internal.e5a.k7.n5());
         }

         this.m3 = new com.aspose.slides.internal.z0k.n3(this.s3, 1);
      }

      return this.m3;
   }

   private void k5(com.aspose.slides.internal.z0k.t4 var1) {
      if (var1 != null) {
         throw new a0("Whoa!", new ArgumentException("Cannot set the stream to a non-null value.", "value"));
      }

      this.m3 = null;
   }

   public final y2 n5(String var1, String var2, com.aspose.slides.internal.z0k.t4 var3) {
      String var4 = com.aspose.slides.internal.e5a.y2.n5(var1, var2);
      y2 var5 = com.aspose.slides.internal.e5a.y2.n5(var1, var4, true, var3);
      var5.k5(this.e2());
      var5.l6(this.z1());
      var5.k5(this.t4());
      var5.n5(this.z3());
      var5.n5(this.m1());
      var5.n5(this.n3());
      var5.e2 = this;
      var5.n5(this.q0());
      var5.l6(this.l6);
      var5.n5(this.y2);
      var5.l6(this.y1);
      if (this.t2()) {
         this.y4().l6("adding {0}...", var1);
      }

      this.u3(var5);
      this.j5.addItem(var5);
      this.k5(var5);
      this.p8 = true;
      return var5;
   }

   public final y2 n5(String var1, String var2, byte[] var3) {
      if (var3 == null) {
         throw new ArgumentException("bad argument", "byteContent");
      }

      com.aspose.slides.internal.z0k.e2 var4 = new com.aspose.slides.internal.z0k.e2(var3);
      return this.n5(var1, var2, var4);
   }

   private void u3(y2 var1) {
      List$Enumerator var2 = this.j5.iterator();

      try {
         while (var2.hasNext()) {
            y2 var3 = (y2)var2.next();
            if (d1.a6(com.aspose.slides.internal.e5a.k7.l6(var1.u3()), var3.u3())) {
               throw new ArgumentException(d1.n5("The entry '{0}' already exists in the zip archive.", new Object[]{var1.u3()}));
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }
   }

   private String d2() {
      return this.r4 != null ? this.r4 : "(stream)";
   }

   public final boolean n5(y2 var1, long var2, long var4) {
      if (this.a3 != null) {
         synchronized (this.b3) {
            m1 var7 = com.aspose.slides.internal.e5a.m1.n5(this.d2(), var1, var2, var4);
            this.a3.n5(this, var7);
            if (var7.n5()) {
               this.o0 = true;
            }
         }
      }

      return this.o0;
   }

   private void n5(int var1, y2 var2, boolean var3) {
      if (this.a3 != null) {
         synchronized (this.b3) {
            m1 var5 = new m1(this.d2(), var3, this.j5.size(), var1, var2);
            this.a3.n5(this, var5);
            if (var5.n5()) {
               this.o0 = true;
            }
         }
      }
   }

   private void u3(int var1) {
      if (this.a3 != null) {
         synchronized (this.b3) {
            m1 var3 = new m1(this.d2(), var1);
            this.a3.n5(this, var3);
            if (var3.n5()) {
               this.o0 = true;
            }
         }
      }
   }

   private void d5() {
      if (this.a3 != null) {
         synchronized (this.b3) {
            m1 var2 = com.aspose.slides.internal.e5a.m1.n5(this.d2());
            this.a3.n5(this, var2);
         }
      }
   }

   private void s3() {
      if (this.a3 != null) {
         synchronized (this.b3) {
            m1 var2 = com.aspose.slides.internal.e5a.m1.l6(this.d2());
            this.a3.n5(this, var2);
         }
      }
   }

   private void p8() {
      if (this.p3 != null) {
         synchronized (this.b3) {
            z3 var2 = com.aspose.slides.internal.e5a.z3.n5(this.d2());
            this.p3.n5(this, var2);
         }
      }
   }

   private void f2() {
      if (this.p3 != null) {
         synchronized (this.b3) {
            z3 var2 = com.aspose.slides.internal.e5a.z3.l6(this.d2());
            this.p3.n5(this, var2);
         }
      }
   }

   public final void l6(y2 var1) {
      if (this.p3 != null) {
         synchronized (this.b3) {
            z3 var3 = com.aspose.slides.internal.e5a.z3.n5(this.d2(), var1, this.z8().getPosition(), this.i1());
            this.p3.n5(this, var3);
         }
      }
   }

   public final void n5(boolean var1, y2 var2) {
      if (this.p3 != null) {
         synchronized (this.b3) {
            z3 var4 = var1
               ? com.aspose.slides.internal.e5a.z3.n5(this.d2(), this.j5.size())
               : com.aspose.slides.internal.e5a.z3.n5(this.d2(), var2, this.j5.size());
            this.p3.n5(this, var4);
         }
      }
   }

   private long i1() {
      if (this.x9 == -99L) {
         if (this.e5) {
            com.aspose.slides.internal.z0k.t2 var1 = new com.aspose.slides.internal.z0k.t2(this.r4);
            this.x9 = var1.k5();
         } else {
            this.x9 = -1L;
         }
      }

      return this.x9;
   }

   public final boolean l6(y2 var1, long var2, long var4) {
      if (this.y0 != null) {
         synchronized (this.b3) {
            n3 var7 = com.aspose.slides.internal.e5a.n3.n5(this.d2(), var1, var2, var4);
            this.y0.n5(this, var7);
            if (var7.n5()) {
               this.z7 = true;
            }
         }
      }

      return this.z7;
   }

   public final boolean n5(y2 var1, String var2, boolean var3) {
      if (this.y0 != null) {
         synchronized (this.b3) {
            n3 var5 = var3 ? com.aspose.slides.internal.e5a.n3.n5(this.d2(), var1, var2) : com.aspose.slides.internal.e5a.n3.k5(this.d2(), var1, var2);
            this.y0.n5(this, var5);
            if (var5.n5()) {
               this.z7 = true;
            }
         }
      }

      return this.z7;
   }

   public final boolean n5(y2 var1, String var2) {
      if (this.y0 != null) {
         synchronized (this.b3) {
            n3 var4 = com.aspose.slides.internal.e5a.n3.l6(this.d2(), var1, var2);
            this.y0.n5(this, var4);
            if (var4.n5()) {
               this.z7 = true;
            }
         }
      }

      return this.z7;
   }

   public final void k5(y2 var1) {
      if (this.j9 != null) {
         synchronized (this.b3) {
            n5 var3 = com.aspose.slides.internal.e5a.n5.n5(this.d2(), var1, this.j5.size());
            this.j9.n5(this, var3);
         }
      }
   }

   public final boolean n5(y2 var1, Exception var2) {
      if (this.z6 != null) {
         synchronized (this.b3) {
            y1 var4 = com.aspose.slides.internal.e5a.y1.n5(this.u9(), var1, var2);
            this.z6.n5(this, var4);
            if (var4.n5()) {
               this.o0 = true;
            }
         }
      }

      return this.o0;
   }

   public static d2 u3(String var0) {
      return n5(var0, null, n5);
   }

   public static d2 n5(String var0, com.aspose.slides.internal.z0k.a0 var1, com.aspose.slides.internal.l7h.j5 var2) {
      return n5(var0, var1, var2, null);
   }

   public static d2 n5(String var0, com.aspose.slides.internal.z0k.a0 var1, com.aspose.slides.internal.l7h.j5 var2, com.aspose.slides.ms.System.i1 var3) {
      d2 var4 = new d2();
      var4.n5(var2);
      var4.z3 = var1;
      var4.r4 = var0;
      if (var3 != null) {
         var4.u9.k5(var3);
      }

      if (var4.t2()) {
         var4.z3.l6("reading from {0}...", var0);
      }

      try {
         n5(var4);
         var4.d5 = true;
         return var4;
      } catch (RuntimeException var6) {
         throw new a0(d1.n5("{0} could not be read", new Object[]{var0}), var6);
      }
   }

   public static d2 n5(com.aspose.slides.internal.z0k.t4 var0) {
      return n5(var0, null, n5);
   }

   public static d2 n5(com.aspose.slides.internal.z0k.t4 var0, boolean var1) {
      if (var0 == null) {
         throw new a0("Cannot read.", new ArgumentException("The stream must be non-null", "zipStream"));
      }

      d2 var2 = new d2();
      var2.k7 = var0;
      var2.e5 = false;
      var2.l6(var1);
      n5(var2);
      return var2;
   }

   public static d2 n5(com.aspose.slides.internal.z0k.t4 var0, com.aspose.slides.internal.z0k.a0 var1, com.aspose.slides.internal.l7h.j5 var2) {
      return n5(var0, var1, var2, null);
   }

   public static d2 n5(
      com.aspose.slides.internal.z0k.t4 var0,
      com.aspose.slides.internal.z0k.a0 var1,
      com.aspose.slides.internal.l7h.j5 var2,
      com.aspose.slides.ms.System.i1 var3
   ) {
      if (var0 == null) {
         throw new a0("Cannot read.", new ArgumentException("The stream must be non-null", "zipStream"));
      }

      d2 var4 = new d2();
      var4.v0 = var2;
      if (var3 != null) {
         var4.u9.l6(var3);
      }

      var4.z3 = var1;
      var4.k7 = var0;
      var4.e5 = false;
      if (var4.t2()) {
         var4.z3.l6("reading from stream...");
      }

      n5(var4);
      return var4;
   }

   public static d2 n5(byte[] var0) {
      return n5(var0, null, n5);
   }

   public static d2 n5(byte[] var0, com.aspose.slides.internal.z0k.a0 var1, com.aspose.slides.internal.l7h.j5 var2) {
      d2 var3 = new d2();
      var3.z3 = var1;
      var3.v0 = var2;
      var3.k7 = new com.aspose.slides.internal.z0k.e2(var0);
      var3.e5 = true;
      if (var3.t2()) {
         var3.z3.l6("reading from byte[]...");
      }

      n5(var3);
      return var3;
   }

   private static void n5(d2 var0) {
      com.aspose.slides.internal.z0k.t4 var1 = var0.z8();

      try {
         if (!var1.canSeek()) {
            u3(var0);
            return;
         }

         var0.p8();
         var0.d2 = var1.getPosition();
         long var2 = u3(var1);
         if (var2 == 101010256L) {
            return;
         }

         int var4 = 0;
         boolean var5 = false;
         long var6 = var1.getLength() - 64L;
         long var8 = q1.n5(var1.getLength() - 16384L, 10L);

         do {
            var1.seek(var6, 0);
            long var10 = com.aspose.slides.internal.e5a.k7.n5(var1, 101010256);
            if (var10 != -1L) {
               var5 = true;
            } else {
               var4++;
               var6 -= 32 * (var4 + 1) * var4;
               if (var6 < 0L) {
                  var6 = 0L;
               }
            }
         } while (!var5 && var6 > var8);

         if (var5) {
            var0.a5 = var1.getPosition() - 4L;
            byte[] var12 = new byte[16];
            var0.z8().read(var12, 0, var12.length);
            int var13 = 12;
            long var14 = (var12[var13++] & 255) + (var12[var13++] & 255) * 256 + (var12[var13++] & 255) * 256 * 256 + (var12[var13++] & 255) * 256 * 256 * 256
               & 4294967295L;
            if (var14 == 4294967295L) {
               l6(var0);
            } else {
               var0.n5(var14 & 4294967295L);
            }

            k5(var0);
         } else {
            var1.seek(var0.d2, 0);
            u3(var0);
         }
      } catch (RuntimeException var17) {
         if (var0.e5 && var0.k7 != null) {
            var0.k7.close();
            var0.k7 = null;
         }

         throw var17;
      }

      var0.p8 = false;
   }

   private static void l6(d2 var0) {
      com.aspose.slides.internal.z0k.t4 var1 = var0.z8();
      byte[] var2 = new byte[16];
      var1.seek(-40L, 1);
      var1.read(var2, 0, 16);
      long var3 = com.aspose.slides.ms.System.x8.u9(var2, 8);
      var0.n5(var3);
      long var5 = com.aspose.slides.internal.e5a.k7.l6(var1) & 4294967295L;
      if ((var5 & 4294967295L) != 101075792L) {
         throw new a6(d1.n5("  ZipFile::Read(): Bad signature (0x{0:X8}) looking for ZIP64 EoCD Record at position 0x{1:X8}", var5, var1.getPosition()));
      }

      var1.read(var2, 0, 8);
      long var7 = com.aspose.slides.ms.System.x8.u9(var2, 0);
      var2 = new byte[(int)var7];
      var1.read(var2, 0, var2.length);
      var3 = com.aspose.slides.ms.System.x8.u9(var2, 36);
      var0.n5(var3);
   }

   private static long u3(com.aspose.slides.internal.z0k.t4 var0) {
      return com.aspose.slides.internal.e5a.k7.l6(var0) & 4294967295L;
   }

   private static void k5(d2 var0) {
      y2 var1;
      while ((var1 = com.aspose.slides.internal.e5a.y2.n5(var0)) != null) {
         var1.r4();
         var0.n5(true, null);
         if (var0.t2()) {
            var0.y4().l6("entry {0}", var1.u3());
         }

         var0.j5.addItem(var1);
      }

      if (var0.a5 > 0L) {
         var0.n5(var0.a5);
      }

      a6(var0);
      if (var0.t2() && var0.c8() != null && var0.c8().length() > 0) {
         var0.y4().l6("Zip file Comment: {0}", var0.c8());
      }

      if (var0.t2()) {
         var0.y4().l6("read in {0} entries.", var0.j5.size());
      }

      var0.f2();
   }

   private static void u3(d2 var0) {
      var0.p8();
      var0.j5 = new List<>();
      if (var0.t2()) {
         if (var0.u9() == null) {
            var0.y4().l6("Reading zip from stream...");
         } else {
            var0.y4().l6("Reading zip {0}...", var0.u9());
         }
      }

      y2 var2;
      for (boolean var1 = true; (var2 = com.aspose.slides.internal.e5a.y2.n5(var0, var1)) != null; var1 = false) {
         if (var0.t2()) {
            var0.y4().l6("  {0}", var2.u3());
         }

         var0.j5.addItem(var2);
      }

      y2 var3;
      while ((var3 = com.aspose.slides.internal.e5a.y2.n5(var0)) != null) {
         List$Enumerator var4 = var0.j5.iterator();

         try {
            while (var4.hasNext()) {
               y2 var5 = (y2)var4.next();
               if (d1.a6(var5.u3(), var3.u3())) {
                  var5.h0 = var3.a6();
                  if (var3.w1()) {
                     var5.m3();
                  }
                  break;
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
               var4.dispose();
            }
         }
      }

      if (var0.a5 > 0L) {
         var0.n5(var0.a5);
      }

      a6(var0);
      if (var0.t2() && var0.c8() != null && var0.c8().length() > 0) {
         var0.y4().l6("Zip file Comment: {0}", var0.c8());
      }

      var0.f2();
   }

   private static void a6(d2 var0) {
      com.aspose.slides.internal.z0k.t4 var1 = var0.z8();
      int var2 = com.aspose.slides.internal.e5a.k7.n5(var1);
      if (var2 == 101075792L) {
         byte[] var3 = new byte[52];
         var1.read(var3, 0, var3.length);
         long var4 = com.aspose.slides.ms.System.x8.u9(var3, 0);
         if (var4 < 44L) {
            throw new a0("Bad DataSize in the ZIP64 Central Directory.");
         }

         var3 = new byte[(int)(var4 - 44L)];
         var1.read(var3, 0, var3.length);
         var2 = com.aspose.slides.internal.e5a.k7.n5(var1);
         if (var2 != 117853008L) {
            throw new a0("Inconsistent metadata in the ZIP64 Central Directory.");
         }

         var3 = new byte[16];
         var1.read(var3, 0, var3.length);
         var2 = com.aspose.slides.internal.e5a.k7.n5(var1);
      }

      if (var2 != 101010256L) {
         var1.seek(-4L, 1);
         if (!var0.k7()) {
            throw new a6(d1.n5("  ZipFile::Read(): Bad signature ({0:X8}) at position 0x{1:X8}", var2, var1.getPosition()));
         }
      }

      byte[] var9 = new byte[16];
      var0.z8().read(var9, 0, var9.length);
      u9(var0);
   }

   private static void u9(d2 var0) {
      byte[] var1 = new byte[2];
      var0.z8().read(var1, 0, var1.length);
      short var2 = (short)((var1[0] & 255) + (var1[1] & 255) * 256);
      if (var2 > 0) {
         var1 = new byte[var2];
         var0.z8().read(var1, 0, var1.length);
         String var3 = n5.l6(var1, 0, var1.length);
         byte[] var4 = n5.u3(var3);
         if (n5(var1, var4)) {
            var0.n5(var3);
         } else {
            com.aspose.slides.internal.l7h.j5 var5 = var0.v0.t9() == 437 ? com.aspose.slides.internal.l7h.j5.z3() : var0.v0;
            var0.n5(var5.l6(var1, 0, var1.length));
         }
      }
   }

   private static boolean n5(byte[] var0, byte[] var1) {
      if (var0.length != var1.length) {
         return false;
      }

      for (int var2 = 0; var2 < var0.length; var2++) {
         if ((var0[var2] & 255) != (var1[var2] & 255)) {
            return false;
         }
      }

      return true;
   }

   public final void n5(long var1) {
      this.z8().seek(var1 + this.d2, 0);
   }

   public final long y2() {
      return this.z8().getPosition() - this.d2;
   }

   public final void y1() {
      try {
         boolean var1 = false;
         this.o0 = false;
         this.d5();
         if (this.a0() == null) {
            throw new u9("You haven't specified where to save the zip.");
         }

         if (this.r4 != null && d1.k5(this.r4, ".exe")) {
            throw new u9("You specified an EXE for a plain zip file.");
         }

         if (this.p8) {
            if (this.t2()) {
               this.y4().l6("saving....");
            }

            if (this.j5.size() >= 65535 && this.u3 == 0) {
               throw new a0("The number of entries is 65535 or greater. Consider setting the UseZip64WhenSaving property on the ZipFile instance.");
            }

            int var2 = 0;
            List$Enumerator var3 = this.j5.iterator();

            try {
               while (var3.hasNext()) {
                  y2 var4 = (y2)var3.next();
                  this.n5(var2, var4, true);
                  var4.u3(this.a0());
                  if (this.o0) {
                     break;
                  }

                  var4.e2 = this;
                  this.n5(++var2, var4, false);
                  if (this.o0) {
                     break;
                  }

                  if (var4.q0()) {
                     var1 |= var4.u9() == 1;
                  }
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
                  var3.dispose();
               }
            }

            if (!this.o0) {
               this.a6(this.a0());
               this.u3(12);
               this.f2 = true;
               this.p8 = false;
               var1 |= this.t1;
               this.h2 = (byte)(var1 ? 1 : 0);
               if (this.s3 != null && this.r4 != null) {
                  this.a0().close();
                  this.k5((com.aspose.slides.internal.z0k.t4)null);
                  if (this.o0) {
                     return;
                  }

                  if (this.d5 && this.k7 != null) {
                     this.k7.close();
                     this.k7 = null;
                  }

                  if (this.d5) {
                     com.aspose.slides.internal.z0k.u9.l6(this.r4);
                     this.u3(13);
                     com.aspose.slides.internal.z0k.u9.k5(this.s3, this.r4);
                     this.u3(14);
                  } else {
                     com.aspose.slides.internal.z0k.u9.k5(this.s3, this.r4);
                  }

                  this.d5 = true;
               }

               this.s3();
               this.u6 = true;
            }
         }
      } finally {
         this.b3();
      }
   }

   private void e5() {
      try {
         if (com.aspose.slides.internal.z0k.u9.k5(this.s3)) {
            com.aspose.slides.internal.z0k.u9.l6(this.s3);
         }
      } catch (RuntimeException var2) {
         if (this.t2()) {
            this.y4().l6("ZipFile::Save: could not delete temp file: {0}.", var2.getMessage());
         }
      }
   }

   private void b3() {
      if (this.s3 != null && this.r4 != null) {
         if (this.m3 != null) {
            try {
               this.m3.close();
            } catch (RuntimeException var3) {
            }

            try {
               this.m3.close();
            } catch (RuntimeException var2) {
            }
         }

         this.m3 = null;
         this.e5();
         this.s3 = null;
      }
   }

   public final void a6(String var1) {
      if (this.r4 == null) {
         this.m3 = null;
      }

      this.r4 = var1;
      if (com.aspose.slides.internal.z0k.u3.k5(this.r4)) {
         throw new a0("Bad Directory", new ArgumentException("That name specifies an existing directory. Please specify a filename.", "fileName"));
      }

      this.p8 = true;
      this.d5 = com.aspose.slides.internal.z0k.u9.k5(this.r4);
      this.y1();
   }

   public final void l6(com.aspose.slides.internal.z0k.t4 var1) {
      if (!var1.canWrite()) {
         throw new ArgumentException("The outputStream must be a writable stream.");
      }

      this.r4 = null;
      this.m3 = new c8(var1);
      this.p8 = true;
      this.d5 = false;
      this.y1();
   }

   private void a6(com.aspose.slides.internal.z0k.t4 var1) {
      c8 var2 = com.aspose.slides.internal.v6g.k5.n5(var1, c8.class);
      long var3 = var2 != null ? var2.n5() : var1.getPosition();
      List$Enumerator var5 = this.j5.iterator();

      try {
         while (var5.hasNext()) {
            y2 var6 = (y2)var5.next();
            if (var6.q0()) {
               var6.k5(var1);
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var5, IDisposable.class)) {
            var5.dispose();
         }
      }

      long var8 = var2 != null ? var2.n5() : var1.getPosition();
      long var10 = var8 - var3;
      this.t1 = this.u3 == 2 || this.o0() >= 65535 || var10 > 4294967295L || var3 > 4294967295L;
      if (this.t1) {
         if (this.u3 == 0) {
            throw new a0("The archive requires a ZIP64 Central Directory. Consider setting the UseZip64WhenSaving property.");
         }

         this.n5(var1, var3, var8);
      }

      this.l6(var1, var3, var8);
   }

   private int o0() {
      int var1 = 0;
      List$Enumerator var2 = this.j5.iterator();

      try {
         while (var2.hasNext()) {
            y2 var3 = (y2)var2.next();
            if (var3.q0()) {
               var1++;
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }

      return var1;
   }

   private void n5(com.aspose.slides.internal.z0k.t4 var1, long var2, long var4) {
      byte var6 = 76;
      byte[] var7 = new byte[76];
      int var8 = 0;
      byte[] var9 = com.aspose.slides.ms.System.x8.n5(101075792L);
      com.aspose.slides.ms.System.u3.n5(com.aspose.slides.ms.System.u3.n5((Object)(var9)), 0, com.aspose.slides.ms.System.u3.n5((Object)(var7)), var8, 4);
      var8 += 4;
      long var10 = 44L;
      com.aspose.slides.ms.System.u3.n5(
         com.aspose.slides.ms.System.u3.n5((Object)(com.aspose.slides.ms.System.x8.l6(var10))), 0, com.aspose.slides.ms.System.u3.n5((Object)(var7)), var8, 8
      );
      var8 += 8;
      var7[var8++] = 45;
      var7[var8++] = 0;
      var7[var8++] = 45;
      var7[var8++] = 0;

      for (int var12 = 0; var12 < 8; var12++) {
         var7[var8++] = 0;
      }

      long var13 = this.o0();
      com.aspose.slides.ms.System.u3.n5(
         com.aspose.slides.ms.System.u3.n5((Object)(com.aspose.slides.ms.System.x8.l6(var13))), 0, com.aspose.slides.ms.System.u3.n5((Object)(var7)), var8, 8
      );
      var8 += 8;
      com.aspose.slides.ms.System.u3.n5(
         com.aspose.slides.ms.System.u3.n5((Object)(com.aspose.slides.ms.System.x8.l6(var13))), 0, com.aspose.slides.ms.System.u3.n5((Object)(var7)), var8, 8
      );
      var8 += 8;
      long var15 = var4 - var2;
      com.aspose.slides.ms.System.u3.n5(
         com.aspose.slides.ms.System.u3.n5((Object)(com.aspose.slides.ms.System.x8.l6(var15))), 0, com.aspose.slides.ms.System.u3.n5((Object)(var7)), var8, 8
      );
      var8 += 8;
      com.aspose.slides.ms.System.u3.n5(
         com.aspose.slides.ms.System.u3.n5((Object)(com.aspose.slides.ms.System.x8.l6(var2))), 0, com.aspose.slides.ms.System.u3.n5((Object)(var7)), var8, 8
      );
      var8 += 8;
      var9 = com.aspose.slides.ms.System.x8.n5(117853008L);
      com.aspose.slides.ms.System.u3.n5(com.aspose.slides.ms.System.u3.n5((Object)(var9)), 0, com.aspose.slides.ms.System.u3.n5((Object)(var7)), var8, 4);
      var8 += 4;
      var7[var8++] = 0;
      var7[var8++] = 0;
      var7[var8++] = 0;
      var7[var8++] = 0;
      com.aspose.slides.ms.System.u3.n5(
         com.aspose.slides.ms.System.u3.n5((Object)(com.aspose.slides.ms.System.x8.l6(var4))), 0, com.aspose.slides.ms.System.u3.n5((Object)(var7)), var8, 8
      );
      var8 += 8;
      var7[var8++] = 1;
      var7[var8++] = 0;
      var7[var8++] = 0;
      var7[var8++] = 0;
      var1.write(var7, 0, var8);
   }

   private void l6(com.aspose.slides.internal.z0k.t4 var1, long var2, long var4) {
      int var6 = 0;
      int var7 = 24;
      byte[] var8 = null;
      short var9 = 0;
      if (this.c8() != null && this.c8().length() != 0) {
         var8 = this.n3().u3(this.c8());
         var9 = (short)var8.length;
      }

      var7 += var9;
      byte[] var10 = new byte[var7];
      int var11 = 0;
      byte[] var12 = com.aspose.slides.ms.System.x8.n5(101010256L);
      com.aspose.slides.ms.System.u3.n5(com.aspose.slides.ms.System.u3.n5((Object)(var12)), 0, com.aspose.slides.ms.System.u3.n5((Object)(var10)), var11, 4);
      var11 += 4;
      var10[var11++] = 0;
      var10[var11++] = 0;
      var10[var11++] = 0;
      var10[var11++] = 0;
      if (this.o0() < 65535 && this.u3 != 2) {
         int var13 = this.o0();
         var10[var11++] = (byte)(var13 & 0xFF);
         var10[var11++] = (byte)((var13 & 0xFF00) >> 8);
         var10[var11++] = (byte)(var13 & 0xFF);
         var10[var11++] = (byte)((var13 & 0xFF00) >> 8);
      } else {
         for (int var16 = 0; var16 < 4; var16++) {
            var10[var11++] = -1;
         }
      }

      long var14 = var4 - var2;
      if (var14 < 4294967295L && var2 < 4294967295L) {
         var10[var11++] = (byte)(var14 & 255L);
         var10[var11++] = (byte)((var14 & 65280L) >> 8);
         var10[var11++] = (byte)((var14 & 16711680L) >> 16);
         var10[var11++] = (byte)((var14 & 4278190080L) >> 24);
         var10[var11++] = (byte)(var2 & 255L);
         var10[var11++] = (byte)((var2 & 65280L) >> 8);
         var10[var11++] = (byte)((var2 & 16711680L) >> 16);
         var10[var11++] = (byte)((var2 & 4278190080L) >> 24);
      } else {
         for (int var17 = 0; var17 < 8; var17++) {
            var10[var11++] = -1;
         }
      }

      if (this.c8() != null && this.c8().length() != 0) {
         if (var9 + var11 + 2 > var10.length) {
            var9 = (short)(var10.length - var11 - 2);
         }

         var10[var11++] = (byte)(var9 & 0xFF);
         var10[var11++] = (byte)((var9 & '\uff00') >> 8);
         if (var9 != 0) {
            for (var6 = 0; var6 < var9 && var11 + var6 < var10.length; var6++) {
               var10[var11 + var6] = var8[var6];
            }

            var11 += var6;
         }
      } else {
         var10[var11++] = 0;
         var10[var11++] = 0;
      }

      var1.write(var10, 0, var11);
   }

   @Override
   public final IGenericEnumerator<y2> iterator() {
      return this.j5.iterator();
   }

   // $VF: synthetic method
   static com.aspose.slides.ms.System.i1 n5(d2 var0, com.aspose.slides.ms.System.i1 var1) {
      return var0.a3 = var1;
   }

   // $VF: synthetic method
   static com.aspose.slides.ms.System.i1 l6(d2 var0, com.aspose.slides.ms.System.i1 var1) {
      return var0.p3 = var1;
   }

   // $VF: synthetic method
   static com.aspose.slides.ms.System.i1 k5(d2 var0, com.aspose.slides.ms.System.i1 var1) {
      return var0.y0 = var1;
   }

   // $VF: synthetic method
   static com.aspose.slides.ms.System.i1 u3(d2 var0, com.aspose.slides.ms.System.i1 var1) {
      return var0.j9 = var1;
   }

   // $VF: synthetic method
   static com.aspose.slides.ms.System.i1 a6(d2 var0, com.aspose.slides.ms.System.i1 var1) {
      return var0.z6 = var1;
   }
}

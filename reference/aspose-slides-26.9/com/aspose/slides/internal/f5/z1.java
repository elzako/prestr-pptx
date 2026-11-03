package com.aspose.slides.internal.f5;

import com.aspose.slides.Collections.Generic.IGenericDictionary;
import com.aspose.slides.Collections.Generic.IGenericEnumerable;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.Xml.j9;
import com.aspose.slides.ms.System.Xml.s2;
import com.aspose.slides.ms.System.Xml.z9;

public class z1 extends r4 implements com.aspose.slides.internal.j3.z1 {
   public final String n5;
   public final String l6;
   public final String k5;
   public final String u3;
   public final String a6;
   public final String u9;
   public String h0;
   public String c8;
   public String t2;
   public String s7;
   public String x8;
   private k5 n3;
   private s7 y4;
   private z9 e2;
   private s2 t9;
   private boolean z1;
   private String t4;
   private com.aspose.slides.internal.j3.c8 q0;
   private r4 z3;
   private byte m1 = 0;

   public z1(k5 var1) {
      this.n3 = var1;
      this.y4 = (s7)var1.k5();
      this.q0 = new com.aspose.slides.internal.j3.n5();
      this.e2 = new j9();
      this.t9 = new s2(this.e2);
      this.u3 = this.e2.n5("#document");
      this.k5 = this.e2.n5("#document-fragment");
      this.l6 = this.e2.n5("#comment");
      this.u9 = this.e2.n5("#text");
      this.n5 = this.e2.n5("#cdata-section");
      this.a6 = this.e2.n5("#entity");
      this.x8 = this.e2.n5("xmlns");
      this.s7 = this.e2.n5("xml");
      this.c8 = this.e2.n5(" http://www.w3.org/2000/xmlns/");
      this.h0 = this.e2.n5("http://www.w3.org/XML/1998/namespace");
      this.t2 = this.e2.n5("http://www.w3.org/1999/xhtml");
      this.t9.n5(d1.n5, this.t2);
   }

   public final z9 k5() {
      return this.e2;
   }

   public final s2 u3() {
      return this.t9;
   }

   @Override
   public final com.aspose.slides.internal.j3.q0 a6() {
      return com.aspose.slides.internal.v6g.k5.n5(this.n5((byte)10), q0.class);
   }

   @Override
   public final com.aspose.slides.internal.j3.x8 u9() {
      return this.y4;
   }

   @Override
   public z1 y4() {
      return this;
   }

   protected r4 n5(byte var1) {
      for (r4 var2 = this.a0(); var2 != null; var2 = var2.s3()) {
         if (var2.n3() == var1) {
            return var2;
         }
      }

      return null;
   }

   protected z3 u3(String var1) {
      com.aspose.slides.internal.d1.u3 var2 = this.n5(this.a0(), 1, new com.aspose.slides.internal.r8.u3(var1), false);
      return com.aspose.slides.internal.v6g.k5.n5(var2.n5(), z3.class);
   }

   @Override
   public final com.aspose.slides.internal.j3.z3 e2() {
      z3 var1 = this.u3("HTML");
      return var1 != null ? var1 : com.aspose.slides.internal.v6g.k5.n5(this.n5((byte)1), z3.class);
   }

   @Override
   public final com.aspose.slides.internal.j3.z3 a6(String var1) {
      String var2 = null;
      String var3 = null;
      String[] var4 = new String[]{var2};
      String[] var5 = new String[]{var3};
      n5(var1, var4, var5);
      var2 = var4[0];
      var3 = var5[0];
      return this.n5(var2, var3, (java.lang.String)null);
   }

   public com.aspose.slides.internal.j3.z3 n5(String var1, String var2, String var3) {
      return this.y4.n5() != null
         ? this.y4.n5().n5((com.aspose.slides.internal.j3.e2)(new e2(var1, var2, var3, this)), (com.aspose.slides.internal.j3.z1)this)
         : new z3(new e2(var1, var2, var3, this), this);
   }

   public final com.aspose.slides.internal.j3.t4 t9() {
      return new t4(this);
   }

   @Override
   public final com.aspose.slides.internal.j3.c4 u9(String var1) {
      return new d5(var1, this);
   }

   @Override
   public final com.aspose.slides.internal.j3.h0 h0(String var1) {
      return new j5(var1, this);
   }

   public final com.aspose.slides.internal.j3.a6 c8(String var1) {
      return new u3(var1, this);
   }

   public final com.aspose.slides.internal.j3.r4 n5(String var1, String var2) {
      return new a0(var1, var2, this);
   }

   @Override
   public final com.aspose.slides.internal.j3.k5 t2(String var1) {
      String var2 = d1.n5;
      String var3 = d1.n5;
      String var4 = d1.n5;
      String[] var5 = new String[]{var2};
      String[] var6 = new String[]{var3};
      n5(var1, var5, var6);
      var2 = var5[0];
      var3 = var6[0];
      return this.l6(var2, var3, var4);
   }

   public final n5 l6(String var1, String var2) {
      String var3 = d1.n5;
      String var4 = d1.n5;
      String[] var5 = new String[]{var3};
      String[] var6 = new String[]{var4};
      n5(var2, var5, var6);
      var3 = var5[0];
      var4 = var6[0];
      return this.l6(var3, var4, var1);
   }

   public final n5 l6(String var1, String var2, String var3) {
      e2 var4 = new e2(var1, var2, var3, this);
      n5 var5 = new n5(var4, this);
      if (this.y4.n5() != null) {
         var5.n5(this.y4.n5().n5(var4));
      }

      return var5;
   }

   public final com.aspose.slides.internal.j3.k7 s7(String var1) {
      return new z8(var1, this);
   }

   public final p8 k5(String var1, String var2, String var3) {
      return new p8(var1, var2, var3, this);
   }

   @Override
   public final com.aspose.slides.internal.j3.q0 n5(String var1, String var2, String var3, String var4) {
      return new q0(var1, var2, var3, var4, this);
   }

   @Override
   public final com.aspose.slides.internal.j3.j5 x8(String var1) {
      return k7.n5(this, var1);
   }

   public final c4 n5(IGenericEnumerable<String> var1) {
      return k7.n5(this, var1);
   }

   protected final c4 n5(IGenericDictionary<String, IGenericEnumerable<KeyValuePair<String, String>>> var1) {
      return k7.n5(this, var1, 0);
   }

   protected final c4 l6(IGenericDictionary<String, IGenericEnumerable<KeyValuePair<String, String>>> var1) {
      return k7.n5(this, var1, 1);
   }

   public final com.aspose.slides.internal.j3.z8 n5(com.aspose.slides.internal.j3.z8 var1, boolean var2) {
      var1.l6(var2);
      ((r4)var1).a6(this);
      return var1;
   }

   @Override
   public final com.aspose.slides.internal.j3.z3 k5(String var1, String var2) {
      String var3 = null;
      String var4 = null;
      String[] var5 = new String[]{var3};
      String[] var6 = new String[]{var4};
      n5(var2, var5, var6);
      var3 = var5[0];
      var4 = var6[0];
      this.u3().k5();
      this.u3().n5(var3, var1);
      com.aspose.slides.internal.j3.z3 var7 = this.n5(var3, var4, var1);
      this.u3().u3();
      return var7;
   }

   public final com.aspose.slides.internal.j3.k5 u3(String var1, String var2) {
      String var3 = null;
      String var4 = null;
      String[] var5 = new String[]{var3};
      String[] var6 = new String[]{var4};
      n5(var2, var5, var6);
      var3 = var5[0];
      var4 = var6[0];
      return this.l6(var3, var4, var1);
   }

   public final com.aspose.slides.internal.j3.j5 a6(String var1, String var2) {
      return k7.n5(this, var1, var2);
   }

   public final com.aspose.slides.internal.j3.z3 n3(String var1) {
      com.aspose.slides.internal.d1.a6 var2 = this.y4().l6(this, 1, new com.aspose.slides.internal.r8.l6(var1), false);

      try {
         return com.aspose.slides.internal.v6g.k5.n5(var2.a6(), z3.class);
      } finally {
         if (var2 != null) {
            var2.dispose();
         }
      }
   }

   public final p8 z1() {
      return com.aspose.slides.internal.v6g.k5.n5(this.a0(), p8.class);
   }

   public final String t4() {
      return this.n3.h0().s7();
   }

   public final String q0() {
      p8 var1 = this.z1();
      return var1 != null ? var1.n5() : null;
   }

   public final boolean z3() {
      p8 var1 = this.z1();
      return var1 != null ? "yes".equals(var1.l6()) : false;
   }

   public final void n5(boolean var1) {
      p8 var2 = this.z1();
      if (var2 != null) {
         var2.u3(var1 ? "yes" : "no");
      }
   }

   public final String m1() {
      p8 var1 = this.z1();
      return var1 != null ? var1.k5() : null;
   }

   public final void y4(String var1) {
      p8 var2 = this.z1();
      if (var2 != null) {
         var2.a6(var1);
      }
   }

   public final boolean k7() {
      return this.z1;
   }

   public final void k5(boolean var1) {
      this.z1 = var1;
   }

   public final String m3() {
      return this.t4;
   }

   @Override
   public final void e2(String var1) {
      this.t4 = var1;
   }

   public final com.aspose.slides.internal.j3.z8 n5(com.aspose.slides.internal.j3.z8 var1) {
      throw new NotImplementedException();
   }

   @Override
   public final com.aspose.slides.internal.j3.c8 z8() {
      return this.q0;
   }

   public final com.aspose.slides.internal.j3.z8 n5(com.aspose.slides.internal.j3.z8 var1, String var2, String var3) {
      throw new NotImplementedException();
   }

   @Override
   public String j5() {
      return this.t4;
   }

   @Override
   public String h0() {
      return this.u3;
   }

   @Override
   public byte n3() {
      return 9;
   }

   @Override
   public com.aspose.slides.internal.j3.z8 l6(boolean var1) {
      com.aspose.slides.internal.j3.z1 var2 = this.u9().n5(this.s7(), this.h0(), this.a6());
      var2.e2(this.m3());
      if (var1) {
      }

      return var2;
   }

   @Override
   public final com.aspose.slides.internal.d1.u3 n5(com.aspose.slides.internal.j3.z8 var1, int var2, com.aspose.slides.internal.d1.k5 var3, boolean var4) {
      return new com.aspose.slides.internal.r8.u9(var1, var2, var3, var4);
   }

   @Override
   public final com.aspose.slides.internal.d1.a6 l6(com.aspose.slides.internal.j3.z8 var1, int var2, com.aspose.slides.internal.d1.k5 var3, boolean var4) {
      return new com.aspose.slides.internal.r8.h0(var1, var2, var3, var4);
   }

   @Override
   public r4 w1() {
      return this.z3;
   }

   @Override
   public void n5(r4 var1) {
      this.z3 = var1;
   }

   public final k5 r4() {
      return this.n3;
   }

   public final void n5(String... var1) {
      this.n3.n5(var1);
   }

   public final void l6(String... var1) {
      this.n3.l6(var1);
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public z1 c4() {
      return this.y4();
   }

}

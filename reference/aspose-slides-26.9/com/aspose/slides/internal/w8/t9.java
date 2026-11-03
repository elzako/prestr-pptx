package com.aspose.slides.internal.w8;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.ms.System.d1;

public class t9 extends com.aspose.slides.internal.f5.z1 implements com.aspose.slides.internal.k5.m1 {
   private String n3;
   private com.aspose.slides.internal.h0.z8 y4;
   private Dictionary<String, com.aspose.slides.internal.y4.z1> e2 = new Dictionary<>();
   private String t9 = "DEFAULT_ELEMENT";
   private com.aspose.slides.internal.h0.z1 z1 = new com.aspose.slides.internal.h0.z1();
   private com.aspose.slides.internal.k5.i1 t4;
   private com.aspose.slides.internal.k5.e5 q0;
   private static final com.aspose.slides.internal.v6g.u9 z3 = new com.aspose.slides.internal.v6g.u9(
      "HEAD", "BASE", "COMMAND", "LINK", "META", "STYLE", "TITLE"
   );

   public t9(com.aspose.slides.internal.f5.k5 var1) {
      super(var1);
   }

   public final String h2() {
      com.aspose.slides.internal.w5.k5 var1 = this.s0();
      return var1 == null ? null : var1.e5();
   }

   public final void m1(String var1) {
      com.aspose.slides.internal.w5.k5 var2 = this.s0();
      if (var2 != null) {
         var2.t9(var1);
      }
   }

   private com.aspose.slides.internal.w5.k5 s0() {
      com.aspose.slides.internal.f5.z3 var1 = this.u3("HTML").c8("HEAD");
      return var1 == null ? null : com.aspose.slides.internal.v6g.k5.n5(var1.c8("TITLE"), com.aspose.slides.internal.w5.k5.class);
   }

   public final String v0() {
      return null;
   }

   public final String f0() {
      return null;
   }

   public final String a3() {
      return null;
   }

   public final c8 p3() {
      com.aspose.slides.internal.f5.z3 var1 = this.u3("HTML");
      return var1 == null ? null : com.aspose.slides.internal.v6g.k5.n5(var1.c8("BODY"), c8.class);
   }

   public final void n5(c8 var1) {
      com.aspose.slides.internal.w3.n5.n5(var1, "value");
      j5 var2 = (j5)this.u3("HTML");
      c8 var3 = this.p3();
      if (var3 != null) {
         var2.k5(var3, var1);
      } else {
         var2.k5(var1);
      }
   }

   public final m1 x9() {
      com.aspose.slides.internal.f5.z3 var1 = this.u3("HTML");
      return var1 == null ? null : com.aspose.slides.internal.v6g.k5.n5(var1.c8("FRAMESET"), m1.class);
   }

   public final s7 y0() {
      return new x8(this.x8("IMG"));
   }

   public final s7 j9() {
      Dictionary var1 = new Dictionary(2);
      var1.addItem("APPLET", null);
      List var2 = new List(2);
      var2.addItem(new KeyValuePair<>("classid", "clsid:CAFEEFAC-00"));
      var2.addItem(new KeyValuePair<>("classid", "clsid:8AD9C840-044E-11D1-B3E9-00805F499D93"));
      var1.addItem("OBJECT", var2);
      List var3 = new List(3);
      var3.addItem(new KeyValuePair<>("type", "application/x-java-applet"));
      var3.addItem(new KeyValuePair<>("type", "application/x-java-bean"));
      var3.addItem(new KeyValuePair<>("type", "application/x-java-vm"));
      var1.addItem("EMBED", var3);
      return new x8(this.n5((com.aspose.slides.Collections.Generic.IGenericDictionary<String, com.aspose.slides.Collections.Generic.IGenericEnumerable<com.aspose.slides.Collections.Generic.KeyValuePair<String, String>>>)(var1)));
   }

   public final s7 z6() {
      Dictionary var1 = new Dictionary(2);
      KeyValuePair var2 = new KeyValuePair<>("href", null);
      List var3 = new List();
      var3.addItem(var2);
      var1.addItem("A", var3);
      var1.addItem("AREA", null);
      return new x8(this.l6(var1));
   }

   public final s7 e9() {
      return new x8(this.x8("FORM"));
   }

   public final s7 o5() {
      Dictionary var1 = new Dictionary(1);
      KeyValuePair var2 = new KeyValuePair<>("name", null);
      List var3 = new List();
      var3.addItem(var2);
      var1.addItem("A", var3);
      return new x8(this.l6(var1));
   }

   public final String j8() {
      return this.n3;
   }

   public final void k7(String var1) {
      this.n3 = var1;
   }

   public final com.aspose.slides.internal.j3.j5 m3(String var1) {
      return this.x8(var1);
   }

   public final void n5(com.aspose.slides.internal.w5.a6 var1) {
      com.aspose.slides.internal.w5.k5 var2 = com.aspose.slides.internal.v6g.k5.n5(this.e2(), com.aspose.slides.internal.w5.k5.class);
      if (var2 != null) {
         var2.n5(var1);
      }
   }

   @Override
   public final com.aspose.slides.internal.k5.i1 l6() {
      if (this.t4 == null) {
         this.t4 = new com.aspose.slides.internal.u5.n5(this);
      }

      return this.t4;
   }

   @Override
   public final com.aspose.slides.internal.k5.m3 n5(com.aspose.slides.internal.j3.z3 var1, String var2) {
      return ((com.aspose.slides.internal.k5.k7)var1).B_();
   }

   @Override
   public final com.aspose.slides.internal.h0.z8 n5() {
      return this.y4;
   }

   public final void n5(com.aspose.slides.internal.h0.z8 var1) {
      this.y4 = var1;
   }

   @Override
   public final com.aspose.slides.internal.y4.z1 n5(String var1) {
      if (d1.n5(var1)) {
         var1 = this.t9;
      } else {
         var1 = d1.s7(var1);
      }

      return this.e2.containsKey(var1) ? this.e2.get_Item(var1) : null;
   }

   @Override
   public final void n5(String var1, com.aspose.slides.internal.y4.z1 var2) {
      if (d1.n5(var1)) {
         var1 = this.t9;
      } else {
         var1 = d1.s7(var1);
      }

      if (this.e2.containsKey(var1)) {
         this.e2.set_Item(var1, var2);
      } else {
         this.e2.addItem(var1, var2);
      }
   }

   @Override
   public final com.aspose.slides.internal.k5.m3 l6(com.aspose.slides.internal.j3.z3 var1, String var2) {
      com.aspose.slides.internal.k5.k7 var3 = (com.aspose.slides.internal.k5.k7)var1;
      com.aspose.slides.internal.y4.z1 var4 = var3.n5(var2);
      if (var4 == null) {
         this.n5().k5(var3);
         var4 = var3.n5(var2);
      }

      return this.z1.n5(var4, this.y4);
   }

   public final com.aspose.slides.internal.k5.e5 w2() {
      if (this.q0 == null) {
         this.q0 = new com.aspose.slides.internal.k5.a5(this);
      }

      return this.q0;
   }
}

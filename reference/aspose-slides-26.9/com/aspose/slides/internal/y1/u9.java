package com.aspose.slides.internal.y1;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.exceptions.NullReferenceException;
import com.aspose.slides.internal.p3.y1;
import com.aspose.slides.internal.z6.j5;
import com.aspose.slides.internal.z6.t4;
import com.aspose.slides.internal.z6.z8;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.d1;

public class u9 implements t2, IDisposable {
   private z8 n5;
   private j5 l6;
   private t4 k5;
   private com.aspose.slides.internal.e5.u9 u3;
   private com.aspose.slides.internal.r4.s7 a6;
   private com.aspose.slides.internal.v0.c8 u9;
   private String h0 = null;
   private boolean c8 = false;
   private String t2 = null;
   private Dictionary<String, String> s7 = null;
   private boolean x8 = true;
   private boolean n3 = true;
   private float y4 = 96.0F;
   private float e2 = 96.0F;
   private String t9 = "11in";
   private String z1 = "8.26in";
   private boolean t4 = true;
   private boolean q0 = false;
   private y1 z3 = null;
   private k5 m1;

   protected u9() {
      this.u3 = new com.aspose.slides.internal.e5.u9(this);
      this.m1 = new k5(this.q0());
      this.u9 = new u9$n5(null);
      this.a6 = new com.aspose.slides.internal.r4.s7(this);
      this.n5 = new z8();
      this.l6 = new j5();
      this.k5 = new t4();
   }

   public static u9 n5() {
      return new u9();
   }

   public final u3 l6() {
      return new u3(this);
   }

   public final boolean k5() {
      return this.c8;
   }

   public final boolean u3() {
      return this.t4;
   }

   public final a6 n5(String var1, u3 var2, com.aspose.slides.internal.z0k.t4 var3) {
      if (var2 == null) {
         throw new NullReferenceException("The userAgent parameter must not be null!");
      } else {
         return new a6(var1, var2, var3);
      }
   }

   public final z8 a6() {
      return this.n5;
   }

   public final com.aspose.slides.internal.e5.u9 u9() {
      return this.u3;
   }

   public final com.aspose.slides.internal.r4.s7 h0() {
      return this.a6;
   }

   public final void n5(com.aspose.slides.internal.e5.a6 var1) {
      this.u3.n5(var1);
   }

   public final y1 c8() {
      return this.z3;
   }

   public final String t2() {
      return this.h0;
   }

   public final void n5(com.aspose.slides.internal.r4.c8 var1) {
      this.m1.n5(var1);
   }

   public final k5 s7() {
      return this.m1;
   }

   public final boolean x8() {
      return this.x8;
   }

   public final boolean n3() {
      return this.q0;
   }

   public final float y4() {
      return this.y4;
   }

   public final void n5(float var1) {
      this.y4 = var1;
   }

   public final float e2() {
      return this.e2;
   }

   public final String t9() {
      return this.t9;
   }

   public final String z1() {
      return this.z1;
   }

   public final boolean n5(String var1) {
      return false;
   }

   public final com.aspose.slides.internal.z6.t2 t4() {
      return null;
   }

   public final boolean q0() {
      return this.n3;
   }

   public final com.aspose.slides.internal.v0.c8 z3() {
      return this.u9;
   }

   public final com.aspose.slides.internal.z0k.t4 n5(String var1, String var2, String var3) {
      com.aspose.slides.internal.z0k.t4 var4 = null;

      try {
         var4 = this.m1.n5(var1, var2, var3);
      } catch (RuntimeException var6) {
         com.aspose.slides.ms.System.t4.n5().l6(d1.n5(new String[]{"Attempt to resolve URI '", var1, "' failed: "}));
      }

      return var4;
   }

   @Override
   public final void dispose() {
      if (this.a6 != null) {
         this.a6.dispose();
         this.a6 = null;
      }
   }
}

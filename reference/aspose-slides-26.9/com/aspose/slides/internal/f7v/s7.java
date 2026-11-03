package com.aspose.slides.internal.f7v;

import java.util.HashMap;
import java.util.Map;

public abstract class s7 {
   public final String n5;
   public final boolean l6;
   public final boolean k5;
   public final boolean u3;
   protected final com.aspose.slides.internal.c5e.l6 a6;
   private boolean t2 = false;
   protected int u9 = -1;
   protected int h0 = -1;
   protected long c8 = 0L;
   private static final Map<String, s3> s7 = new HashMap<>();

   static void n5(String var0, s3 var1) {
      s7.put(var0, var1);
   }

   public static boolean n5(String var0) {
      return s7.containsKey(var0);
   }

   protected s7(String var1, com.aspose.slides.internal.c5e.l6 var2) {
      this.n5 = var1;
      this.a6 = var2;
      this.l6 = com.aspose.slides.internal.f7v.n5.l6(var1);
      this.k5 = com.aspose.slides.internal.f7v.n5.k5(var1);
      this.u3 = com.aspose.slides.internal.f7v.n5.u3(var1);
   }

   public static s7 n5(a6 var0, com.aspose.slides.internal.c5e.l6 var1) {
      s7 var2 = n5(com.aspose.slides.internal.f7v.n5.n5(var0.l6), var1);
      var2.h0 = var0.n5;
      var2.n5(var0);
      return var2;
   }

   public static s7 n5(String var0, com.aspose.slides.internal.c5e.l6 var1) {
      s7 var2 = null;

      try {
         s3 var3 = s7.get(var0);
         if (var3 != null) {
            var2 = var3.n5(var1);
         }
      } catch (Exception var4) {
      }

      if (var2 == null) {
         var2 = new o5(var0, var1);
      }

      return var2;
   }

   public final void n5(int var1) {
      this.u9 = var1;
   }

   public void n5(long var1) {
      this.c8 = var1;
   }

   public abstract void n5(a6 var1);

   public abstract boolean n5();

   @Override
   public String toString() {
      return "chunk id= " + this.n5 + " (len=" + this.h0 + " offset=" + this.c8 + ") c=" + this.getClass().getSimpleName();
   }

   static {
      n5("IDAT", new x8());
      n5("IHDR", new m3());
      n5("PLTE", new j5());
      n5("IEND", new w1());
      n5("tEXt", new r4());
      n5("iTXt", new c4());
      n5("zTXt", new y2());
      n5("bKGD", new y1());
      n5("gAMA", new a0());
      n5("pHYs", new n3());
      n5("iCCP", new y4());
      n5("tIME", new e2());
      n5("tRNS", new t9());
      n5("cHRM", new z1());
      n5("sBIT", new t4());
      n5("sRGB", new q0());
      n5("hIST", new z3());
      n5("sPLT", new m1());
      n5("oFFs", new k7());
      n5("sTER", new z8());
   }
}

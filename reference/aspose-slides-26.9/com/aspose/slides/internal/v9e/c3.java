package com.aspose.slides.internal.v9e;

import com.aspose.slides.Collections.Hashtable;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.XsltException;
import com.aspose.slides.ms.System.Xml.f4;
import com.aspose.slides.ms.System.Xml.k6;

public class c3 extends t9 implements Cloneable {
   private int n5 = 4;
   private int l6 = Integer.MAX_VALUE;
   private com.aspose.slides.internal.l7h.j5 k5 = com.aspose.slides.internal.l7h.j5.z3();
   private int u3 = Integer.MAX_VALUE;
   private String a6;
   private int u9 = Integer.MAX_VALUE;
   private boolean h0;
   private int c8 = Integer.MAX_VALUE;
   private boolean t2;
   private int s7 = Integer.MAX_VALUE;
   private String x8;
   private int n3 = Integer.MAX_VALUE;
   private String y4;
   private int e2 = Integer.MAX_VALUE;
   private boolean t9;
   private int z1 = Integer.MAX_VALUE;
   private String t4 = "text/html";
   private int q0 = Integer.MAX_VALUE;
   private Hashtable z3;
   private static final com.aspose.slides.internal.v6g.u9 m1 = new com.aspose.slides.internal.v6g.u9("xml", "html", "text");

   public void l6(z1 var1) {
      this.u3(var1);
      this.a6(var1);
   }

   @Override
   public boolean k5(z1 var1) {
      String var2 = var1.u3().e2();
      String var3 = var1.u3().t4();
      if (com.aspose.slides.ms.System.Xml.v8.n5(var2, var1.n5().v8)) {
         if (var1.l6() <= this.l6) {
            this.n5 = n5(var3, var1);
            this.l6 = var1.l6();
            if (this.z1 == Integer.MAX_VALUE) {
               this.t9 = this.n5 == 1;
            }
         }
      } else if (com.aspose.slides.ms.System.Xml.v8.n5(var2, var1.n5().m8)) {
         if (var1.l6() <= this.u9) {
            this.a6 = var3;
            this.u9 = var1.l6();
         }
      } else if (com.aspose.slides.ms.System.Xml.v8.n5(var2, var1.n5().a0)) {
         if (var1.l6() <= this.u3) {
            try {
               this.k5 = com.aspose.slides.internal.l7h.j5.k5(var3);
               this.u3 = var1.l6();
            } catch (UnsupportedOperationException var7) {
            } catch (ArgumentException var8) {
            }
         }
      } else if (com.aspose.slides.ms.System.Xml.v8.n5(var2, var1.n5().s4)) {
         if (var1.l6() <= this.c8) {
            this.h0 = var1.c8(var3);
            this.c8 = var1.l6();
         }
      } else if (com.aspose.slides.ms.System.Xml.v8.n5(var2, var1.n5().h5)) {
         if (var1.l6() <= this.s7) {
            this.t2 = var1.c8(var3);
            this.s7 = var1.l6();
         }
      } else if (com.aspose.slides.ms.System.Xml.v8.n5(var2, var1.n5().w1)) {
         if (var1.l6() <= this.n3) {
            this.x8 = var3;
            this.n3 = var1.l6();
         }
      } else if (com.aspose.slides.ms.System.Xml.v8.n5(var2, var1.n5().r4)) {
         if (var1.l6() <= this.e2) {
            this.y4 = var3;
            this.e2 = var1.l6();
         }
      } else if (com.aspose.slides.ms.System.Xml.v8.n5(var2, var1.n5().a3)) {
         if (var1.l6() <= this.z1) {
            this.t9 = var1.c8(var3);
            this.z1 = var1.l6();
         }
      } else if (com.aspose.slides.ms.System.Xml.v8.n5(var2, var1.n5().w2)) {
         if (var1.l6() <= this.q0) {
            this.t4 = var3;
            this.q0 = var1.l6();
         }
      } else {
         if (!com.aspose.slides.ms.System.Xml.v8.n5(var2, var1.n5().s7)) {
            return false;
         }

         String[] var4 = f4.c4(var3);
         if (this.z3 == null) {
            this.z3 = new Hashtable(var4.length);
         }

         for (int var5 = 0; var5 < var4.length; var5++) {
            k6 var6 = var1.x8(var4[var5]);
            this.z3.set_Item(var6, var6);
         }
      }

      return true;
   }

   @Override
   public void n5(p3 var1, l6 var2) {
   }

   private static int n5(String var0, z1 var1) {
      k6 var2 = var1.s7(var0);
      if (var2.n5().length() != 0) {
         return 3;
      }

      switch (m1.n5(var2.l6())) {
         case 0:
            return 0;
         case 1:
            return 1;
         case 2:
            return 2;
         default:
            if (var1.n3()) {
               return 4;
            } else {
               throw XsltException.create("'{1}' is an invalid value for the '{0}' attribute.", "method", var0);
            }
      }
   }
}

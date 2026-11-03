package com.aspose.slides.internal.u1;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericDictionary;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.exceptions.IOException;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.d1;

public class y4 extends t2 {
   private n3 u9;
   protected static final Dictionary<String, com.aspose.slides.internal.v2.c8> a6 = new Dictionary<>();

   public y4() {
      this.n5();
      this.n5.l6(com.aspose.slides.internal.v2.c8.u7f, com.aspose.slides.internal.v2.c8.o5k);
   }

   public y4(com.aspose.slides.internal.v2.k5 var1) {
      super(var1);
      this.n5();
      this.j5();
      a6 var2 = this.t4();
      if (var2 != null && com.aspose.slides.internal.v6g.k5.l6(var2, u9.class)) {
         com.aspose.slides.internal.e7.s7 var3 = ((u9)var2).e2();
         if (var3 != null) {
            try {
               this.u9 = new n3(this.n5);
            } catch (IOException var5) {
            }
         }
      }
   }

   public y4(String var1) {
      this();
      this.n5(var1);
      this.n5(new com.aspose.slides.internal.p2.h0());
      this.n5((com.aspose.slides.internal.v2.s7)com.aspose.slides.internal.v2.c8.y4k);
   }

   private void n5() {
      com.aspose.slides.internal.x2.k5 var1 = null;
      com.aspose.slides.internal.v2.s7 var2 = this.n5.n3(com.aspose.slides.internal.v2.c8.e0);
      com.aspose.slides.internal.v2.s7 var3 = this.l6(var2);
      if (var3 == null) {
         com.aspose.slides.internal.v2.c8 var4 = this.n5.a6(com.aspose.slides.internal.v2.c8.y2);
         if (!a6.containsKey(this.a6()) || !com.aspose.slides.internal.v2.c8.y4u.equals(var4) && !com.aspose.slides.internal.v2.c8.h6t.equals(var4)) {
            this.n5((com.aspose.slides.internal.v2.c8)null);
         } else {
            this.n5(var4);
         }

         var1 = this.y4();
         if (var1 != null) {
            IGenericDictionary var5 = var1.u3();
            IGenericEnumerator var6 = var5.iterator();

            try {
               while (var6.hasNext()) {
                  KeyValuePair var7 = (KeyValuePair)var6.next();
                  this.c8().n5((Integer)var7.getKey(), (Integer)var7.getValue());
                  this.s7().n5((Integer)var7.getValue(), (Integer)var7.getKey());
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var6, IDisposable.class)) {
                  var6.dispose();
               }
            }
         }
      } else if (com.aspose.slides.internal.v6g.k5.l6(var3, com.aspose.slides.internal.v2.c8.class)) {
         this.n5((com.aspose.slides.internal.v2.c8)var3);
      } else if (com.aspose.slides.internal.v6g.k5.l6(var3, com.aspose.slides.internal.v2.k5.class)) {
         com.aspose.slides.internal.v2.k5 var13 = (com.aspose.slides.internal.v2.k5)var3;
         com.aspose.slides.internal.v2.s7 var14 = var13.n3(com.aspose.slides.internal.v2.c8.c4);
         var3 = this.l6(var14);
         if (var3 == null) {
            this.n5((com.aspose.slides.internal.v2.c8)null);
         } else {
            this.n5((com.aspose.slides.internal.v2.c8)var3);
         }

         this.n5(var13, var1);
      }

      this.m3();
   }

   @Override
   public String k5(byte[] var1, int var2, int var3) {
      if (this.u9 != null && this.u3() == null) {
         String var4 = this.u9.k5(var1, var2, var3);
         if (!d1.n5(var4)) {
            return var4;
         }
      }

      return super.k5(var1, var2, var3);
   }

   private void j5() {
      com.aspose.slides.internal.p2.l6 var1 = this.u3();
      if (var1 == null) {
      }

      this.n5(this.u3() == null);
   }

   private void n5(boolean var1) {
      a6 var2 = this.t4();
      if (var2 != null && com.aspose.slides.internal.v6g.k5.l6(var2, u9.class)) {
      }
   }

   static {
      a6.addItem("Courier", com.aspose.slides.internal.v2.c8.a1g);
      a6.addItem("Courier-Bold", com.aspose.slides.internal.v2.c8.q5v);
      a6.addItem("Courier-BoldOblique", com.aspose.slides.internal.v2.c8.t1h);
      a6.addItem("Courier-Oblique", com.aspose.slides.internal.v2.c8.i8n);
      a6.addItem("Helvetica", com.aspose.slides.internal.v2.c8.k0y);
      a6.addItem("Helvetica-Bold", com.aspose.slides.internal.v2.c8.v7o);
      a6.addItem("Helvetica-BoldOblique", com.aspose.slides.internal.v2.c8.x5e);
      a6.addItem("Helvetica-Oblique", com.aspose.slides.internal.v2.c8.r1x);
      a6.addItem("Symbol", com.aspose.slides.internal.v2.c8.y4u);
      a6.addItem("Times-Roman", com.aspose.slides.internal.v2.c8.f9d);
      a6.addItem("Times-Bold", com.aspose.slides.internal.v2.c8.g3j);
      a6.addItem("Times-BoldItalic", com.aspose.slides.internal.v2.c8.z3b);
      a6.addItem("Times-Italic", com.aspose.slides.internal.v2.c8.r1q);
      a6.addItem("ZapfDingbats", com.aspose.slides.internal.v2.c8.h6t);
   }
}

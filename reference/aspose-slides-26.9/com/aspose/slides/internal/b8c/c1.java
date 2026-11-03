package com.aspose.slides.internal.b8c;

import com.aspose.slides.exceptions.XmlSchemaException;

public abstract class c1 extends d8 {
   private com.aspose.slides.ms.System.c4 l6 = com.aspose.slides.ms.System.c4.u3.l6();
   private com.aspose.slides.ms.System.c4 k5 = com.aspose.slides.ms.System.c4.u3.l6();
   private int u3 = 0;
   public static final c1 n5 = new c1$n5(null);

   public final String b3() {
      return (this.u3 & 1) == 0 ? null : com.aspose.slides.ms.System.Xml.f4.n5(this.l6.l6());
   }

   public final void c8(String var1) {
      if (var1 == null) {
         com.aspose.slides.ms.System.c4.u3.k7(this.l6);
         this.u3 &= -2;
      } else {
         com.aspose.slides.ms.System.Xml.f4.n3(var1).k7(this.l6);
         if (com.aspose.slides.ms.System.c4.x8(this.l6, com.aspose.slides.ms.System.c4.a6)) {
            throw new XmlSchemaException("The value for the 'minOccurs' attribute must be xsd:nonNegativeInteger.", com.aspose.slides.ms.System.d1.n5);
         }

         this.u3 |= 1;
      }
   }

   public final String o0() {
      return (this.u3 & 2) == 0
         ? null
         : (com.aspose.slides.ms.System.c4.c8(this.k5, com.aspose.slides.ms.System.c4.l6) ? "unbounded" : com.aspose.slides.ms.System.Xml.f4.n5(this.k5.l6()));
   }

   public final void t2(String var1) {
      if (var1 == null) {
         com.aspose.slides.ms.System.c4.u3.k7(this.k5);
         this.u3 &= -3;
      } else {
         if ("unbounded".equals(var1)) {
            com.aspose.slides.ms.System.c4.l6.k7(this.k5);
         } else {
            com.aspose.slides.ms.System.Xml.f4.n3(var1).k7(this.k5);
            if (com.aspose.slides.ms.System.c4.x8(this.k5, com.aspose.slides.ms.System.c4.a6)) {
               throw new XmlSchemaException(
                  "The value for the 'maxOccurs' attribute must be xsd:nonNegativeInteger or 'unbounded'.", com.aspose.slides.ms.System.d1.n5
               );
            }

            if (com.aspose.slides.ms.System.c4.c8(this.k5, com.aspose.slides.ms.System.c4.a6) && (this.u3 & 1) == 0) {
               com.aspose.slides.ms.System.c4.a6.k7(this.l6);
            }
         }

         this.u3 |= 2;
      }
   }

   public final com.aspose.slides.ms.System.c4 z7() {
      return this.l6;
   }

   public final void n5(com.aspose.slides.ms.System.c4 var1) {
      if (!com.aspose.slides.ms.System.c4.x8(var1, com.aspose.slides.ms.System.c4.a6)
         && !com.aspose.slides.ms.System.c4.h0(var1, com.aspose.slides.ms.System.c4.t2(var1.l6()))) {
         var1.k7(this.l6);
         this.u3 |= 1;
      } else {
         throw new XmlSchemaException("The value for the 'minOccurs' attribute must be xsd:nonNegativeInteger.", com.aspose.slides.ms.System.d1.n5);
      }
   }

   public final com.aspose.slides.ms.System.c4 v4() {
      return this.k5;
   }

   public final void l6(com.aspose.slides.ms.System.c4 var1) {
      if (!com.aspose.slides.ms.System.c4.x8(var1, com.aspose.slides.ms.System.c4.a6)
         && !com.aspose.slides.ms.System.c4.h0(var1, com.aspose.slides.ms.System.c4.t2(var1.l6()))) {
         var1.k7(this.k5);
         if (com.aspose.slides.ms.System.c4.c8(this.k5, com.aspose.slides.ms.System.c4.a6) && (this.u3 & 1) == 0) {
            com.aspose.slides.ms.System.c4.a6.k7(this.l6);
         }

         this.u3 |= 2;
      } else {
         throw new XmlSchemaException(
            "The value for the 'maxOccurs' attribute must be xsd:nonNegativeInteger or 'unbounded'.", com.aspose.slides.ms.System.d1.n5
         );
      }
   }

   public boolean l6() {
      return com.aspose.slides.ms.System.c4.c8(this.k5, com.aspose.slides.ms.System.c4.a6);
   }

   public String t2() {
      return com.aspose.slides.ms.System.d1.n5;
   }

   public final com.aspose.slides.ms.System.Xml.k6 u6() {
      v1 var1 = com.aspose.slides.internal.v6g.k5.n5(this, v1.class);
      if (var1 != null) {
         return var1.z8();
      }

      f7 var2 = com.aspose.slides.internal.v6g.k5.n5(this, f7.class);
      if (var2 != null) {
         String var3 = var2.n5();
         if (var3 != null) {
            var3 = com.aspose.slides.ms.System.d1.l6(var3);
         } else {
            var3 = com.aspose.slides.ms.System.d1.n5;
         }

         return new com.aspose.slides.ms.System.Xml.k6("*", var3.length() == 0 ? "##any" : var3);
      } else {
         return com.aspose.slides.ms.System.Xml.k6.n5;
      }
   }
}

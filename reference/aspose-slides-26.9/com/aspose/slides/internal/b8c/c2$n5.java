package com.aspose.slides.internal.b8c;

import com.aspose.slides.Collections.ArrayList;
import com.aspose.slides.exceptions.XmlSchemaException;

class c2$n5 extends com.aspose.slides.internal.v6g.h0<c2$n5> {
   private t4 n5;
   private r5 l6;
   private int k5;
   private int u3;
   private int a6;
   private v5 u9;
   private v5 h0;
   private int c8;
   private boolean t2;
   private com.aspose.slides.internal.l7h.a5 s7;
   private c0 x8;
   private static final c2$n5$n5[] n3 = new c2$n5$n5[]{
      new c2$n5$n5('c', "\\p{_xmlC}"),
      new c2$n5$n5('C', "\\P{_xmlC}"),
      new c2$n5$n5('d', "\\p{_xmlD}"),
      new c2$n5$n5('D', "\\P{_xmlD}"),
      new c2$n5$n5('i', "\\p{_xmlI}"),
      new c2$n5$n5('I', "\\P{_xmlI}"),
      new c2$n5$n5('w', "\\p{_xmlW}"),
      new c2$n5$n5('W', "\\P{_xmlW}")
   };

   public c2$n5() {
   }

   public c2$n5(t4 var1, r5 var2) {
      this.t2 = true;
      this.s7 = null;
      this.x8 = null;
      this.n5 = var1;
      this.l6 = var2;
      this.k5 = this.n5.y4() != null ? this.n5.y4().y4 : 0;
      this.u3 = this.n5.y4() != null ? this.n5.y4().e2 : 0;
      this.a6 = this.n5.q0();
      this.u9 = t4.k5(47).b3();
      this.c8 = !com.aspose.slides.internal.v6g.k5.l6(this.n5, h6.class) && !com.aspose.slides.internal.v6g.k5.l6(this.n5, m3.class) ? this.n5.n3() : 0;
      this.h0 = this.c8 > 0 ? t4.k5(this.c8).b3() : this.n5;
   }

   public final void n5(m6 var1) {
      this.n5(var1, 1, "The length constraining facet is prohibited for '{0}'.");
      this.l6(var1, 1, "This is a duplicate Length constraining facet.");
      this.l6.n5 = m9.l6(
         com.aspose.slides.internal.v6g.k5.u3(
               this.n5(this.u9, var1, "The Length constraining facet is invalid - {0}", null, null), com.aspose.slides.ms.System.c4.class
            )
            .l6()
      );
      if ((this.u3 & 1) != 0 && !this.n5.n5(Integer.valueOf(this.n5.y4().n5), this.l6.n5)) {
         throw new XmlSchemaException("Values that are declared as {fixed} in a base type can not be changed in a derived type.", var1);
      }

      if ((this.k5 & 1) != 0 && this.n5.y4().n5 < this.l6.n5) {
         throw new XmlSchemaException(
            "It is an error if 'length' is among the members of {facets} of {base type definition} and {value} is greater than the {value} of the parent 'length'.",
            var1
         );
      }

      if ((this.k5 & 2) != 0 && this.n5.y4().l6 > this.l6.n5) {
         throw new XmlSchemaException(
            "It is an error for both 'length' and either 'minLength' or 'maxLength' to be members of {facets}, unless they are specified in different derivation steps. In which case the following must be true: the {value} of 'minLength' <= the {value} of 'length' <= the {value} of 'maxLength'.",
            var1
         );
      }

      if ((this.k5 & 4) != 0 && this.n5.y4().k5 < this.l6.n5) {
         throw new XmlSchemaException(
            "It is an error for both 'length' and either 'minLength' or 'maxLength' to be members of {facets}, unless they are specified in different derivation steps. In which case the following must be true: the {value} of 'minLength' <= the {value} of 'length' <= the {value} of 'maxLength'.",
            var1
         );
      }

      this.n5(var1, 1);
   }

   public final void l6(m6 var1) {
      this.n5(var1, 2, "The MinLength constraining facet is prohibited for '{0}'.");
      this.l6(var1, 2, "This is a duplicate MinLength constraining facet.");
      this.l6.l6 = m9.l6(
         com.aspose.slides.internal.v6g.k5.u3(
               this.n5(this.u9, var1, "The MinLength constraining facet is invalid - {0}", null, null), com.aspose.slides.ms.System.c4.class
            )
            .l6()
      );
      if ((this.u3 & 2) != 0 && !this.n5.n5(Integer.valueOf(this.n5.y4().l6), this.l6.l6)) {
         throw new XmlSchemaException("Values that are declared as {fixed} in a base type can not be changed in a derived type.", var1);
      }

      if ((this.k5 & 2) != 0 && this.n5.y4().l6 > this.l6.l6) {
         throw new XmlSchemaException(
            "It is an error if 'minLength' is among the members of {facets} of {base type definition} and {value} is less than the {value} of the parent 'minLength'.",
            var1
         );
      }

      if ((this.k5 & 1) != 0 && this.n5.y4().n5 < this.l6.l6) {
         throw new XmlSchemaException(
            "It is an error for both 'length' and either 'minLength' or 'maxLength' to be members of {facets}, unless they are specified in different derivation steps. In which case the following must be true: the {value} of 'minLength' <= the {value} of 'length' <= the {value} of 'maxLength'.",
            var1
         );
      }

      this.n5(var1, 2);
   }

   public final void k5(m6 var1) {
      this.n5(var1, 4, "The MaxLength constraining facet is prohibited for '{0}'.");
      this.l6(var1, 4, "This is a duplicate MaxLength constraining facet.");
      this.l6.k5 = m9.l6(
         com.aspose.slides.internal.v6g.k5.u3(
               this.n5(this.u9, var1, "The MaxLength constraining facet is invalid - {0}", null, null), com.aspose.slides.ms.System.c4.class
            )
            .l6()
      );
      if ((this.u3 & 4) != 0 && !this.n5.n5(Integer.valueOf(this.n5.y4().k5), this.l6.k5)) {
         throw new XmlSchemaException("Values that are declared as {fixed} in a base type can not be changed in a derived type.", var1);
      }

      if ((this.k5 & 4) != 0 && this.n5.y4().k5 < this.l6.k5) {
         throw new XmlSchemaException(
            "It is an error if 'maxLength' is among the members of {facets} of {base type definition} and {value} is greater than the {value} of the parent 'maxLength'.",
            var1
         );
      }

      if ((this.k5 & 1) != 0 && this.n5.y4().n5 > this.l6.k5) {
         throw new XmlSchemaException(
            "It is an error for both 'length' and either 'minLength' or 'maxLength' to be members of {facets}, unless they are specified in different derivation steps. In which case the following must be true: the {value} of 'minLength' <= the {value} of 'length' <= the {value} of 'maxLength'.",
            var1
         );
      }

      this.n5(var1, 4);
   }

   public final void n5(c0 var1) {
      this.n5(var1, 8, "The Pattern constraining facet is prohibited for '{0}'.");
      if (this.t2) {
         this.s7 = new com.aspose.slides.internal.l7h.a5();
         this.s7.n5("(");
         this.s7.n5(var1.n5());
         this.x8 = var1;
         this.t2 = false;
      } else {
         this.s7.n5(")|(");
         this.s7.n5(var1.n5());
      }

      this.n5(var1, 8);
   }

   public final void n5(m6 var1, com.aspose.slides.ms.System.Xml.a3 var2, com.aspose.slides.ms.System.Xml.z9 var3) {
      this.n5(var1, 16, "The Enumeration constraining facet is prohibited for '{0}'.");
      if (this.l6.a6 == null) {
         this.l6.a6 = new ArrayList();
      }

      this.l6.a6.addItem(this.n5(this.n5, var1, "The Enumeration constraining facet is invalid - {0}", var2, var3));
      this.n5(var1, 16);
   }

   public final void u3(m6 var1) {
      this.n5(var1, 32, "The WhiteSpace constraining facet is prohibited for '{0}'.");
      this.l6(var1, 32, "This is a duplicate WhiteSpace constraining facet.");
      if ("preserve".equals(var1.n5())) {
         this.l6.u9 = 0;
      } else if ("replace".equals(var1.n5())) {
         this.l6.u9 = 1;
      } else {
         if (!"collapse".equals(var1.n5())) {
            throw new XmlSchemaException("The white space character, '{0}', is invalid.", var1.n5(), var1);
         }

         this.l6.u9 = 2;
      }

      if ((this.u3 & 32) != 0 && !this.n5.n5(Integer.valueOf(this.n5.y4().u9), this.l6.u9)) {
         throw new XmlSchemaException("Values that are declared as {fixed} in a base type can not be changed in a derived type.", var1);
      }

      int var2;
      if ((this.k5 & 32) != 0) {
         var2 = this.n5.y4().u9;
      } else {
         var2 = this.n5.z3();
      }

      if (var2 != 2 || this.l6.u9 != 1 && this.l6.u9 != 0) {
         if (var2 == 1 && this.l6.u9 == 0) {
            throw new XmlSchemaException(
               "It is an error if 'whiteSpace' is among the members of {facets} of {base type definition}, {value} is 'preserve', and the {value} of the parent 'whiteSpace' is 'replace'.",
               var1
            );
         }

         this.n5(var1, 32);
      } else {
         throw new XmlSchemaException(
            "It is an error if 'whiteSpace' is among the members of {facets} of {base type definition}, {value} is 'replace' or 'preserve', and the {value} of the parent 'whiteSpace' is 'collapse'.",
            var1
         );
      }
   }

   public final void a6(m6 var1) {
      this.n5(var1, 64, "The MaxInclusive constraining facet is prohibited for '{0}'.");
      this.l6(var1, 64, "This is a duplicate MaxInclusive constraining facet.");
      this.l6.h0 = this.n5(this.h0, var1, "The MaxInclusive constraining facet is invalid - {0}", null, null);
      if ((this.u3 & 64) != 0 && !this.n5.n5(this.n5.y4().h0, this.l6.h0)) {
         throw new XmlSchemaException("Values that are declared as {fixed} in a base type can not be changed in a derived type.", var1);
      }

      this.n5(this.l6.h0, var1);
      this.n5(var1, 64);
   }

   public final void u9(m6 var1) {
      this.n5(var1, 128, "The MaxExclusive constraining facet is prohibited for '{0}'.");
      this.l6(var1, 128, "This is a duplicate MaxExclusive constraining facet.");
      this.l6.c8 = this.n5(this.h0, var1, "The MaxExclusive constraining facet is invalid - {0}", null, null);
      if ((this.u3 & 128) != 0 && !this.n5.n5(this.n5.y4().c8, this.l6.c8)) {
         throw new XmlSchemaException("Values that are declared as {fixed} in a base type can not be changed in a derived type.", var1);
      }

      this.n5(this.l6.c8, var1);
      this.n5(var1, 128);
   }

   public final void h0(m6 var1) {
      this.n5(var1, 256, "The MinInclusive constraining facet is prohibited for '{0}'.");
      this.l6(var1, 256, "This is a duplicate MinInclusive constraining facet.");
      this.l6.t2 = this.n5(this.h0, var1, "The MinInclusive constraining facet is invalid - {0}", null, null);
      if ((this.u3 & 256) != 0 && !this.n5.n5(this.n5.y4().t2, this.l6.t2)) {
         throw new XmlSchemaException("Values that are declared as {fixed} in a base type can not be changed in a derived type.", var1);
      }

      this.n5(this.l6.t2, var1);
      this.n5(var1, 256);
   }

   public final void c8(m6 var1) {
      this.n5(var1, 512, "The MinExclusive constraining facet is prohibited for '{0}'.");
      this.l6(var1, 512, "This is a duplicate MinExclusive constraining facet.");
      this.l6.s7 = this.n5(this.h0, var1, "The MinExclusive constraining facet is invalid - {0}", null, null);
      if ((this.u3 & 512) != 0 && !this.n5.n5(this.n5.y4().s7, this.l6.s7)) {
         throw new XmlSchemaException("Values that are declared as {fixed} in a base type can not be changed in a derived type.", var1);
      }

      this.n5(this.l6.s7, var1);
      this.n5(var1, 512);
   }

   public final void t2(m6 var1) {
      this.n5(var1, 1024, "The TotalDigits constraining facet is prohibited for '{0}'.");
      this.l6(var1, 1024, "This is a duplicate TotalDigits constraining facet.");
      v5 var2 = t4.k5(52).b3();
      this.l6.x8 = m9.l6(
         com.aspose.slides.internal.v6g.k5.u3(
               this.n5(var2, var1, "The TotalDigits constraining facet is invalid - {0}", null, null), com.aspose.slides.ms.System.c4.class
            )
            .l6()
      );
      if ((this.u3 & 1024) != 0 && !this.n5.n5(Integer.valueOf(this.n5.y4().x8), this.l6.x8)) {
         throw new XmlSchemaException("Values that are declared as {fixed} in a base type can not be changed in a derived type.", var1);
      }

      if ((this.k5 & 1024) != 0 && this.l6.x8 > this.n5.y4().x8) {
         throw new XmlSchemaException(
            "It is an error if the derived 'totalDigits' facet value is greater than the parent 'totalDigits' facet value.", com.aspose.slides.ms.System.d1.n5
         );
      }

      this.n5(var1, 1024);
   }

   public final void s7(m6 var1) {
      this.n5(var1, 2048, "The FractionDigits constraining facet is prohibited for '{0}'.");
      this.l6(var1, 2048, "This is a duplicate FractionDigits constraining facet.");
      this.l6.n3 = m9.l6(
         com.aspose.slides.internal.v6g.k5.u3(
               this.n5(this.u9, var1, "The FractionDigits constraining facet is invalid - {0}", null, null), com.aspose.slides.ms.System.c4.class
            )
            .l6()
      );
      if (this.l6.n3 != 0 && this.n5.n3() != 14) {
         throw new XmlSchemaException(
            "The FractionDigits constraining facet is invalid - {0}",
            com.aspose.slides.ms.System.Xml.v3.n5("FractionDigits should be equal to 0 on types other then decimal."),
            var1
         );
      }

      if ((this.k5 & 2048) != 0 && this.l6.n3 > this.n5.y4().n3) {
         throw new XmlSchemaException(
            "It is an error if the derived 'totalDigits' facet value is greater than the parent 'totalDigits' facet value.", com.aspose.slides.ms.System.d1.n5
         );
      }

      this.n5(var1, 2048);
   }

   public final void n5() {
      if (!this.t2) {
         if (this.l6.u3 == null) {
            this.l6.u3 = new ArrayList();
         }

         try {
            this.s7.n5(")");
            String var1 = this.s7.toString();
            if (com.aspose.slides.ms.System.d1.u3(var1, '|') != -1) {
               this.s7.n5(0, "(");
               this.s7.n5(")");
            }

            this.l6.u3.addItem(new com.aspose.slides.internal.r7c.c8(n5(this.s7.toString()), 0));
         } catch (RuntimeException var2) {
            throw new XmlSchemaException(
               "The Pattern constraining facet is invalid - {0}", new String[]{var2.getMessage()}, var2, this.x8.p8(), this.x8.d5(), this.x8.s3(), this.x8
            );
         }
      }
   }

   private void n5(Object var1, m6 var2) {
      r5 var3 = this.n5.y4();
      switch (var2.u9()) {
         case 7:
            if ((this.k5 & 512) != 0 && this.n5.l6(var1, var3.s7) < 0) {
               throw new XmlSchemaException(
                  "It is an error if the derived 'minExclusive' facet value is less than the parent 'minExclusive' facet value.",
                  com.aspose.slides.ms.System.d1.n5
               );
            }

            if ((this.k5 & 256) != 0 && this.n5.l6(var1, var3.t2) < 0) {
               throw new XmlSchemaException(
                  "It is an error if the derived 'minExclusive' facet value is less than or equal to the parent 'minInclusive' facet value.",
                  com.aspose.slides.ms.System.d1.n5
               );
            }

            if ((this.k5 & 128) != 0 && this.n5.l6(var1, var3.c8) >= 0) {
               throw new XmlSchemaException(
                  "It is an error if the derived 'minExclusive' facet value is greater than or equal to the parent 'maxExclusive' facet value.",
                  com.aspose.slides.ms.System.d1.n5
               );
            }
            break;
         case 8:
            if ((this.k5 & 256) != 0 && this.n5.l6(var1, var3.t2) < 0) {
               throw new XmlSchemaException(
                  "It is an error if the derived 'minInclusive' facet value is less than the parent 'minInclusive' facet value.",
                  com.aspose.slides.ms.System.d1.n5
               );
            }

            if ((this.k5 & 512) != 0 && this.n5.l6(var1, var3.s7) < 0) {
               throw new XmlSchemaException(
                  "It is an error if the derived 'minInclusive' facet value is less than or equal to the parent 'minExclusive' facet value.",
                  com.aspose.slides.ms.System.d1.n5
               );
            }

            if ((this.k5 & 128) != 0 && this.n5.l6(var1, var3.c8) >= 0) {
               throw new XmlSchemaException(
                  "It is an error if the derived 'minInclusive' facet value is greater than or equal to the parent 'maxExclusive' facet value.",
                  com.aspose.slides.ms.System.d1.n5
               );
            }
            break;
         case 9:
            if ((this.k5 & 128) != 0 && this.n5.l6(var1, var3.c8) > 0) {
               throw new XmlSchemaException(
                  "It is an error if the derived 'maxExclusive' facet value is greater than the parent 'maxExclusive' facet value.",
                  com.aspose.slides.ms.System.d1.n5
               );
            }

            if ((this.k5 & 64) != 0 && this.n5.l6(var1, var3.h0) > 0) {
               throw new XmlSchemaException(
                  "It is an error if the derived 'maxExclusive' facet value is greater than or equal to the parent 'maxInclusive' facet value.",
                  com.aspose.slides.ms.System.d1.n5
               );
            }
            break;
         case 10:
            if ((this.k5 & 64) != 0 && this.n5.l6(var1, var3.h0) > 0) {
               throw new XmlSchemaException(
                  "It is an error if the derived 'maxInclusive' facet value is greater than the parent 'maxInclusive' facet value.",
                  com.aspose.slides.ms.System.d1.n5
               );
            }

            if ((this.k5 & 128) != 0 && this.n5.l6(var1, var3.c8) >= 0) {
               throw new XmlSchemaException(
                  "It is an error if the derived 'maxInclusive' facet value is greater than or equal to the parent 'maxExclusive' facet value.",
                  com.aspose.slides.ms.System.d1.n5
               );
            }
      }
   }

   public final void l6() {
      r5 var1 = this.n5.y4();
      if ((this.l6.y4 & 64) != 0 && (this.l6.y4 & 128) != 0) {
         throw new XmlSchemaException("'maxInclusive' and 'maxExclusive' cannot both be specified for the same data type.", com.aspose.slides.ms.System.d1.n5);
      }

      if ((this.l6.y4 & 256) != 0 && (this.l6.y4 & 512) != 0) {
         throw new XmlSchemaException("'minInclusive' and 'minExclusive' cannot both be specified for the same data type.", com.aspose.slides.ms.System.d1.n5);
      }

      if ((this.l6.y4 & 1) != 0 && (this.l6.y4 & 6) != 0) {
         throw new XmlSchemaException("It is an error for both length and minLength or maxLength to be present.", com.aspose.slides.ms.System.d1.n5);
      }

      this.u3();
      if ((this.l6.y4 & 2) != 0 && (this.l6.y4 & 4) != 0 && this.l6.l6 > this.l6.k5) {
         throw new XmlSchemaException("MinLength is greater than MaxLength.", com.aspose.slides.ms.System.d1.n5);
      }

      if ((this.l6.y4 & 256) != 0 && (this.l6.y4 & 64) != 0 && this.n5.l6(this.l6.t2, this.l6.h0) > 0) {
         throw new XmlSchemaException(
            "The value specified for 'minInclusive' cannot be greater than the value specified for 'maxInclusive' for the same data type.",
            com.aspose.slides.ms.System.d1.n5
         );
      }

      if ((this.l6.y4 & 256) != 0 && (this.l6.y4 & 128) != 0 && this.n5.l6(this.l6.t2, this.l6.c8) > 0) {
         throw new XmlSchemaException(
            "The value specified for 'minInclusive' cannot be greater than the value specified for 'maxExclusive' for the same data type.",
            com.aspose.slides.ms.System.d1.n5
         );
      }

      if ((this.l6.y4 & 512) != 0 && (this.l6.y4 & 128) != 0 && this.n5.l6(this.l6.s7, this.l6.c8) > 0) {
         throw new XmlSchemaException(
            "The value specified for 'minExclusive' cannot be greater than the value specified for 'maxExclusive' for the same data type.",
            com.aspose.slides.ms.System.d1.n5
         );
      }

      if ((this.l6.y4 & 512) != 0 && (this.l6.y4 & 64) != 0 && this.n5.l6(this.l6.s7, this.l6.h0) > 0) {
         throw new XmlSchemaException(
            "The value specified for 'minExclusive' cannot be greater than the value specified for 'maxInclusive' for the same data type.",
            com.aspose.slides.ms.System.d1.n5
         );
      }

      if ((this.l6.y4 & 3072) == 3072 && this.l6.n3 > this.l6.x8) {
         throw new XmlSchemaException("FractionDigits is greater than TotalDigits.", com.aspose.slides.ms.System.d1.n5);
      }
   }

   private void u3() {
      r5 var1 = this.n5.y4();
      if ((this.l6.y4 & 1) == 0 && (this.k5 & 1) != 0) {
         this.l6.n5 = var1.n5;
         this.n5(1);
      }

      if ((this.l6.y4 & 2) == 0 && (this.k5 & 2) != 0) {
         this.l6.l6 = var1.l6;
         this.n5(2);
      }

      if ((this.l6.y4 & 4) == 0 && (this.k5 & 4) != 0) {
         this.l6.k5 = var1.k5;
         this.n5(4);
      }

      if ((this.k5 & 8) != 0) {
         if (this.l6.u3 == null) {
            this.l6.u3 = var1.u3;
         } else {
            this.l6.u3.addRange(var1.u3);
         }

         this.n5(8);
      }

      if ((this.k5 & 16) != 0) {
         if (this.l6.a6 == null) {
            this.l6.a6 = var1.a6;
         }

         this.n5(16);
      }

      if ((this.l6.y4 & 32) == 0 && (this.k5 & 32) != 0) {
         this.l6.u9 = var1.u9;
         this.n5(32);
      }

      if ((this.l6.y4 & 64) == 0 && (this.k5 & 64) != 0) {
         this.l6.h0 = var1.h0;
         this.n5(64);
      }

      if ((this.l6.y4 & 128) == 0 && (this.k5 & 128) != 0) {
         this.l6.c8 = var1.c8;
         this.n5(128);
      }

      if ((this.l6.y4 & 256) == 0 && (this.k5 & 256) != 0) {
         this.l6.t2 = var1.t2;
         this.n5(256);
      }

      if ((this.l6.y4 & 512) == 0 && (this.k5 & 512) != 0) {
         this.l6.s7 = var1.s7;
         this.n5(512);
      }

      if ((this.l6.y4 & 1024) == 0 && (this.k5 & 1024) != 0) {
         this.l6.x8 = var1.x8;
         this.n5(1024);
      }

      if ((this.l6.y4 & 2048) == 0 && (this.k5 & 2048) != 0) {
         this.l6.n3 = var1.n3;
         this.n5(2048);
      }
   }

   private Object n5(v5 var1, m6 var2, String var3, com.aspose.slides.ms.System.Xml.a3 var4, com.aspose.slides.ms.System.Xml.z9 var5) {
      Object var6 = null;
      Object[] var7 = new Object[]{var6};
      RuntimeException var8 = var1.n5(var2.n5(), var5, var4, var7);
      var6 = var7[0];
      if (var8 == null) {
         return var6;
      } else {
         throw new XmlSchemaException(var3, new String[]{var8.getMessage()}, var8, var2.p8(), var2.d5(), var2.s3(), var2);
      }
   }

   private static String n5(String var0) {
      com.aspose.slides.internal.l7h.a5 var1 = new com.aspose.slides.internal.l7h.a5();
      var1.n5("^");
      char[] var2 = com.aspose.slides.ms.System.d1.c8(var0);
      int var3 = var0.length();
      int var4 = 0;

      for (int var5 = 0; var5 < var3 - 2; var5++) {
         if (var2[var5] == '\\') {
            if (var2[var5 + 1] == '\\') {
               var5++;
            } else {
               char var6 = var2[var5 + 1];

               for (int var7 = 0; var7 < n3.length; var7++) {
                  if (n3[var7].n5 == var6) {
                     if (var4 < var5) {
                        var1.n5(var2, var4, var5 - var4);
                     }

                     var1.n5(n3[var7].l6);
                     var4 = ++var5 + 1;
                     break;
                  }
               }
            }
         }
      }

      if (var4 < var3) {
         var1.n5(var2, var4, var3 - var4);
      }

      var1.n5("$");
      return var1.toString();
   }

   private void n5(m6 var1, int var2, String var3) {
      if ((this.a6 & var2) == 0) {
         throw new XmlSchemaException(var3, this.n5.j5(), var1);
      }
   }

   private void l6(m6 var1, int var2, String var3) {
      if ((this.l6.y4 & var2) != 0) {
         throw new XmlSchemaException(var3, var1);
      }
   }

   private void n5(m6 var1, int var2) {
      this.l6.y4 |= var2;
      if (var1.l6()) {
         this.l6.e2 |= var2;
      }
   }

   private void n5(int var1) {
      this.l6.y4 |= var1;
      if ((this.u3 & var1) != 0) {
         this.l6.e2 |= var1;
      }
   }

   public void n5(c2$n5 var1) {
      var1 = var1 == null ? new c2$n5() : var1;
      var1.n5 = this.n5;
      var1.l6 = this.l6;
      var1.k5 = this.k5;
      var1.u3 = this.u3;
      var1.a6 = this.a6;
      var1.u9 = this.u9;
      var1.h0 = this.h0;
      var1.c8 = this.c8;
      var1.t2 = this.t2;
      var1.s7 = this.s7;
      var1.x8 = this.x8;
   }

   public c2$n5 k5() {
      c2$n5 var1 = new c2$n5();
      this.n5(var1);
      return var1;
   }

   @Override
   public Object clone() {
      return this.k5();
   }

   private boolean l6(c2$n5 var1) {
      return com.aspose.slides.ms.System.j8.n5(var1.n5, this.n5)
         && com.aspose.slides.ms.System.j8.n5(var1.l6, this.l6)
         && var1.k5 == this.k5
         && var1.u3 == this.u3
         && var1.a6 == this.a6
         && com.aspose.slides.ms.System.j8.n5(var1.u9, this.u9)
         && com.aspose.slides.ms.System.j8.n5(var1.h0, this.h0)
         && var1.c8 == this.c8
         && var1.t2 == this.t2
         && com.aspose.slides.ms.System.j8.n5(var1.s7, this.s7)
         && com.aspose.slides.ms.System.j8.n5(var1.x8, this.x8);
   }

   @Override
   public boolean equals(Object obj) {
      if (com.aspose.slides.ms.System.j8.l6(null, obj)) {
         return false;
      } else if (com.aspose.slides.ms.System.j8.l6(this, obj)) {
         return true;
      } else {
         return !(obj instanceof c2$n5) ? false : this.l6((c2$n5)obj);
      }
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public c2$n5 Clone() {
      return this.k5();
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public void CloneTo(c2$n5 bridgeArg0) {
      this.n5(bridgeArg0);
   }

}

package com.aspose.slides.ms.System.Xml;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.InvalidOperationException;

public class k3 extends l1 {
   private com.aspose.slides.internal.z0k.a0 n5;
   private n6 l6;
   private com.aspose.slides.internal.l7h.j5 k5;
   private int u3;
   private boolean a6;
   private int u9;
   private char h0;
   private k3$l6[] c8;
   private int t2;
   private int[] s7;
   private int x8;
   private int n3;
   private m0 y4;
   private char e2;
   private char t9;
   private boolean z1;
   private int t4;
   private String q0;
   private boolean z3;
   private k3$n5[] m1;
   private int k7;
   private Dictionary<String, Integer> m3;
   private boolean z8;
   private u4 j5 = u4.n5().l6();
   private static String[] w1 = new String[]{"Start", "Prolog", "PostDTD", "Element", "Attribute", "Content", "AttrOnly", "Epilog", "Error", "Closed"};
   private static String[] r4 = new String[]{
      "PI",
      "Doctype",
      "Comment",
      "CData",
      "StartElement",
      "EndElement",
      "LongEndElement",
      "StartAttribute",
      "EndAttribute",
      "Content",
      "Base64",
      "RawData",
      "Whitespace",
      "Empty"
   };
   private static final int[] c4 = new int[]{
      1,
      1,
      2,
      5,
      5,
      5,
      8,
      7,
      2,
      2,
      8,
      8,
      8,
      8,
      8,
      8,
      1,
      1,
      2,
      5,
      5,
      5,
      8,
      7,
      5,
      5,
      8,
      5,
      5,
      5,
      8,
      7,
      3,
      3,
      3,
      3,
      3,
      3,
      8,
      3,
      8,
      8,
      8,
      5,
      5,
      5,
      8,
      8,
      8,
      8,
      8,
      5,
      5,
      5,
      8,
      8,
      6,
      8,
      8,
      4,
      4,
      8,
      8,
      8,
      8,
      8,
      8,
      8,
      3,
      8,
      7,
      8,
      5,
      5,
      8,
      5,
      4,
      5,
      4,
      7,
      5,
      5,
      8,
      5,
      4,
      5,
      4,
      7,
      1,
      1,
      2,
      5,
      4,
      5,
      4,
      7,
      1,
      1,
      2,
      5,
      4,
      5,
      4,
      7
   };
   private static final int[] y2 = new int[]{
      8,
      1,
      2,
      5,
      5,
      5,
      8,
      7,
      8,
      2,
      8,
      8,
      8,
      8,
      8,
      8,
      8,
      1,
      2,
      5,
      5,
      5,
      8,
      7,
      8,
      8,
      8,
      5,
      5,
      5,
      8,
      8,
      8,
      3,
      3,
      3,
      3,
      3,
      8,
      8,
      8,
      8,
      8,
      5,
      5,
      5,
      8,
      8,
      8,
      8,
      8,
      5,
      5,
      5,
      8,
      8,
      8,
      8,
      8,
      4,
      4,
      8,
      8,
      8,
      8,
      8,
      8,
      8,
      3,
      8,
      8,
      8,
      8,
      8,
      8,
      5,
      4,
      5,
      8,
      8,
      8,
      8,
      8,
      5,
      4,
      5,
      8,
      8,
      8,
      1,
      2,
      5,
      4,
      5,
      8,
      7,
      8,
      1,
      2,
      5,
      4,
      5,
      8,
      7
   };

   public k3() {
      this.z1 = true;
      this.u3 = 0;
      this.u9 = 2;
      this.h0 = ' ';
      this.m1 = (k3$n5[])com.aspose.slides.ms.System.u3.n5(com.aspose.slides.ms.System.u3.n5(com.aspose.slides.internal.v6g.k5.n5(k3$n5.class), 8));
      this.k7 = -1;
      this.c8 = (k3$l6[])com.aspose.slides.ms.System.u3.n5(com.aspose.slides.ms.System.u3.n5(com.aspose.slides.internal.v6g.k5.n5(k3$l6.class), 10));
      this.t2 = 0;
      this.c8[this.t2].n5(-1);
      this.e2 = '"';
      this.s7 = c4;
      this.x8 = 0;
      this.n3 = 13;
   }

   public k3(com.aspose.slides.internal.z0k.t4 var1, com.aspose.slides.internal.l7h.j5 var2) {
      this();
      this.k5 = var2;
      if (var2 != null) {
         this.n5 = new com.aspose.slides.internal.z0k.j5(var1, var2);
      } else {
         this.n5 = new com.aspose.slides.internal.z0k.j5(var1);
      }

      this.l6 = new n6(this.n5);
      this.l6.n5(this.e2);
   }

   public k3(String var1, com.aspose.slides.internal.l7h.j5 var2) {
      this(new com.aspose.slides.internal.z0k.n3(var1, 2, 2, 1), var2);
   }

   public k3(com.aspose.slides.internal.z0k.a0 var1) {
      this();
      this.n5 = var1;
      this.k5 = var1.l6();
      this.l6 = new n6(var1);
      this.l6.n5(this.e2);
   }

   public final void k5(boolean var1) {
      if (this.x8 != 0) {
         throw new InvalidOperationException(v3.n5("NotInWriteState."));
      }

      this.z1 = var1;
   }

   public final void n5(int var1) {
      this.u3 = var1;
      this.a6 = var1 == 1;
   }

   public final void l6(int var1) {
      if (var1 < 0) {
         throw new ArgumentException(v3.n5("Indentation value must be greater than 0."));
      }

      this.u9 = var1;
   }

   public final void l6(char var1) {
      this.h0 = var1;
   }

   public final void k5(char var1) {
      if (var1 != '"' && var1 != '\'') {
         throw new ArgumentException(v3.n5("Invalid XML attribute quote character. Valid attribute quote characters are ' and \"."));
      }

      this.e2 = var1;
      this.l6.n5(var1);
   }

   @Override
   public void t2() {
      this.k5(-1);
   }

   @Override
   public void l6(boolean var1) {
      this.k5(var1 ? 1 : 0);
   }

   public void n5() {
      try {
         this.k5();
         if (this.x8 != 7) {
            if (this.x8 == 9) {
               throw new ArgumentException(v3.n5("The Writer is closed or in error state."));
            } else {
               throw new ArgumentException(v3.n5("Document does not have a root element."));
            }
         } else {
            this.s7 = c4;
            this.x8 = 0;
            this.n3 = 13;
         }
      } catch (RuntimeException var2) {
         this.x8 = 8;
         throw var2;
      }
   }

   @Override
   public void n5(String var1, String var2, String var3, String var4) {
      try {
         this.n5(var1, false);
         this.u3(1);
         this.n5.n5("<!DOCTYPE ");
         this.n5.n5(var1);
         if (var2 != null) {
            this.n5.n5(com.aspose.slides.ms.System.d1.n5(new Object[]{" PUBLIC ", this.e2}));
            this.n5.n5(var2);
            this.n5.n5(com.aspose.slides.ms.System.d1.n5(new Object[]{this.e2, " ", this.e2}));
            this.n5.n5(var3);
            this.n5.n5(this.e2);
         } else if (var3 != null) {
            this.n5.n5(com.aspose.slides.ms.System.d1.n5(new Object[]{" SYSTEM ", this.e2}));
            this.n5.n5(var3);
            this.n5.n5(this.e2);
         }

         if (var4 != null) {
            this.n5.n5("[");
            this.n5.n5(var4);
            this.n5.n5("]");
         }

         this.n5.n5('>');
      } catch (RuntimeException var6) {
         this.x8 = 8;
         throw var6;
      }
   }

   @Override
   public void n5(String var1, String var2, String var3) {
      try {
         this.u3(4);
         this.y4();
         this.n5.n5('<');
         if (this.z1) {
            this.c8[this.t2].k5 = this.c8[this.t2 - 1].k5;
            if (this.c8[this.t2 - 1].u3 != 0) {
               this.c8[this.t2].u3 = 1;
            }

            this.c8[this.t2].t2 = this.c8[this.t2 - 1].t2;
            if (var3 == null) {
               if (var1 != null && var1.length() != 0 && this.u3(var1) == -1) {
                  throw new ArgumentException(v3.n5("An undefined prefix is in use."));
               }
            } else if (var1 == null) {
               String var4 = this.x8(var3);
               if (var4 != null) {
                  var1 = var4;
               } else {
                  this.n5(null, var3, false);
               }
            } else if (var1.length() == 0) {
               this.n5(null, var3, false);
            } else {
               if (var3.length() == 0) {
                  var1 = null;
               }

               this.u9(var1, var3);
               this.n5(var1, var3, false);
            }

            this.c8[this.t2].l6 = null;
            if (var1 != null && var1.length() != 0) {
               this.c8[this.t2].l6 = var1;
               this.n5.n5(var1);
               this.n5.n5(':');
            }
         } else if (var3 != null && var3.length() != 0 || var1 != null && var1.length() != 0) {
            throw new ArgumentException(v3.n5("Cannot set the namespace if Namespaces is 'false'."));
         }

         this.c8[this.t2].n5 = var2;
         this.n5.n5(var2);
      } catch (RuntimeException var5) {
         this.x8 = 8;
         throw var5;
      }
   }

   @Override
   public void s7() {
      this.u3(false);
   }

   @Override
   public void x8() {
      this.u3(true);
   }

   @Override
   public void u3(String var1, String var2, String var3) {
      try {
         this.u3(7);
         this.t4 = 0;
         if (this.z1) {
            if (var1 != null && var1.length() == 0) {
               var1 = null;
            }

            if ("http://www.w3.org/2000/xmlns/".equals(var3) && var1 == null && !"xmlns".equals(var2)) {
               var1 = "xmlns";
            }

            if ("xml".equals(var1)) {
               if ("lang".equals(var2)) {
                  this.t4 = 2;
               } else if ("space".equals(var2)) {
                  this.t4 = 1;
               }
            } else if ("xmlns".equals(var1)) {
               if (!"http://www.w3.org/2000/xmlns/".equals(var3) && var3 != null) {
                  throw new ArgumentException(v3.n5("The 'xmlns' attribute is bound to the reserved namespace 'http://www.w3.org/2000/xmlns/'."));
               }

               if (var2 != null && var2.length() != 0) {
                  this.q0 = var2;
               } else {
                  var2 = var1;
                  var1 = null;
                  this.q0 = null;
               }

               this.t4 = 3;
            } else if (var1 == null && "xmlns".equals(var2)) {
               if (!"http://www.w3.org/2000/xmlns/".equals(var3) && var3 != null) {
                  throw new ArgumentException(v3.n5("The 'xmlns' attribute is bound to the reserved namespace 'http://www.w3.org/2000/xmlns/'."));
               }

               this.t4 = 3;
               this.q0 = null;
            } else if (var3 == null) {
               if (var1 != null && this.u3(var1) == -1) {
                  throw new ArgumentException(v3.n5("An undefined prefix is in use."));
               }
            } else if (var3.length() == 0) {
               var1 = com.aspose.slides.ms.System.d1.n5;
            } else {
               this.u9(var1, var3);
               if (var1 != null && this.s7(var1) != -1) {
                  var1 = null;
               }

               String var4 = this.x8(var3);
               if (var4 == null || var1 != null && !com.aspose.slides.ms.System.d1.a6(var1, var4)) {
                  if (var1 == null) {
                     var1 = this.h0();
                  }

                  this.n5(var1, var3, false);
               } else {
                  var1 = var4;
               }
            }

            if (var1 != null && var1.length() != 0) {
               this.n5.n5(var1);
               this.n5.n5(':');
            }
         } else {
            if (var3 != null && var3.length() != 0 || var1 != null && var1.length() != 0) {
               throw new ArgumentException(v3.n5("Cannot set the namespace if Namespaces is 'false'."));
            }

            if ("xml:lang".equals(var2)) {
               this.t4 = 2;
            } else if ("xml:space".equals(var2)) {
               this.t4 = 1;
            }
         }

         this.l6.n5(this.t4 != 0);
         this.n5.n5(var2);
         this.n5.n5('=');
         if (this.t9 != this.e2) {
            this.t9 = this.e2;
            this.l6.n5(this.e2);
         }

         this.n5.n5(this.t9);
      } catch (RuntimeException var5) {
         this.x8 = 8;
         throw var5;
      }
   }

   @Override
   public void l6() {
      try {
         this.u3(8);
      } catch (RuntimeException var2) {
         this.x8 = 8;
         throw var2;
      }
   }

   @Override
   public void a6(String var1) {
      try {
         this.u3(3);
         if (null != var1 && com.aspose.slides.ms.System.d1.u9(var1, "]]>", (short)4) >= 0) {
            throw new ArgumentException(v3.n5("Cannot have ']]>' inside an XML CDATA block."));
         }

         this.n5.n5("<![CDATA[");
         if (null != var1) {
            this.l6.l6(var1);
         }

         this.n5.n5("]]>");
      } catch (RuntimeException var3) {
         this.x8 = 8;
         throw var3;
      }
   }

   @Override
   public void u9(String var1) {
      try {
         if (null == var1 || com.aspose.slides.ms.System.d1.u9(var1, "--", (short)4) < 0 && (var1.length() == 0 || var1.charAt(var1.length() - 1) != '-')) {
            this.u3(2);
            this.n5.n5("<!--");
            if (null != var1) {
               this.l6.l6(var1);
            }

            this.n5.n5("-->");
         } else {
            throw new ArgumentException(v3.n5("An XML comment cannot contain '--', and '-' cannot be the last character."));
         }
      } catch (RuntimeException var3) {
         this.x8 = 8;
         throw var3;
      }
   }

   @Override
   public void n5(String var1, String var2) {
      try {
         if (null != var2 && com.aspose.slides.ms.System.d1.u9(var2, "?>", (short)4) >= 0) {
            throw new ArgumentException(v3.n5("Cannot have '?>' inside an XML processing instruction."));
         }

         if (0 == com.aspose.slides.ms.System.d1.a6(var1, "xml", (short)5) && this.s7 == y2) {
            throw new ArgumentException(v3.n5("Cannot write XML declaration. WriteStartDocument method has already written it."));
         }

         this.u3(0);
         this.l6(var1, var2);
      } catch (RuntimeException var4) {
         this.x8 = 8;
         throw var4;
      }
   }

   @Override
   public void k5(String var1) {
      try {
         this.n5(var1, false);
         this.u3(9);
         this.l6.k5(var1);
      } catch (RuntimeException var3) {
         this.x8 = 8;
         throw var3;
      }
   }

   @Override
   public void n5(char var1) {
      try {
         this.u3(9);
         this.l6.l6(var1);
      } catch (RuntimeException var3) {
         this.x8 = 8;
         throw var3;
      }
   }

   @Override
   public void h0(String var1) {
      try {
         if (null == var1) {
            var1 = com.aspose.slides.ms.System.d1.n5;
         }

         if (!this.j5.n5(var1)) {
            throw new ArgumentException(v3.n5("Only white space characters should be used."));
         }

         this.u3(12);
         this.l6.n5(var1);
      } catch (RuntimeException var3) {
         this.x8 = 8;
         throw var3;
      }
   }

   @Override
   public void l6(String var1) {
      try {
         if (null != var1 && var1.length() != 0) {
            this.u3(9);
            this.l6.n5(var1);
         }
      } catch (RuntimeException var3) {
         this.x8 = 8;
         throw var3;
      }
   }

   @Override
   public void n5(char var1, char var2) {
      try {
         this.u3(9);
         this.l6.l6(var1, var2);
      } catch (RuntimeException var4) {
         this.x8 = 8;
         throw var4;
      }
   }

   @Override
   public void n5(char[] var1, int var2, int var3) {
      try {
         this.u3(9);
         this.l6.n5(var1, var2, var3);
      } catch (RuntimeException var5) {
         this.x8 = 8;
         throw var5;
      }
   }

   @Override
   public void a_(char[] var1, int var2, int var3) {
      try {
         this.u3(11);
         this.l6.l6(var1, var2, var3);
      } catch (RuntimeException var5) {
         this.x8 = 8;
         throw var5;
      }
   }

   @Override
   public void c8(String var1) {
      try {
         this.u3(11);
         this.l6.l6(var1);
      } catch (RuntimeException var3) {
         this.x8 = 8;
         throw var3;
      }
   }

   @Override
   public void n5(byte[] var1, int var2, int var3) {
      try {
         if (!this.z3) {
            this.u3(10);
         }

         this.z3 = true;
         if (null == this.y4) {
            this.y4 = new m0(this.l6);
         }

         this.y4.n5(var1, var2, var3);
      } catch (RuntimeException var5) {
         this.x8 = 8;
         throw var5;
      }
   }

   @Override
   public void l6(byte[] var1, int var2, int var3) {
      try {
         this.u3(9);
         com.aspose.slides.ms.System.Xml.u3.n5(var1, var2, var3, this);
      } catch (RuntimeException var5) {
         this.x8 = 8;
         throw var5;
      }
   }

   @Override
   public int n3() {
      switch (this.x8) {
         case 0:
            return 0;
         case 1:
         case 2:
            return 1;
         case 3:
            return 2;
         case 4:
         case 6:
            return 3;
         case 5:
         case 7:
            return 4;
         case 8:
            return 6;
         case 9:
            return 5;
         default:
            return 6;
      }
   }

   @Override
   public void a6() {
      try {
         this.k5();
      } catch (RuntimeException var5) {
      } finally {
         this.x8 = 9;
         this.n5.u3();
      }
   }

   @Override
   public void u9() {
      this.n5.k5();
   }

   public String n5(String var1) {
      if (var1 != null && var1.length() != 0) {
         String var2 = this.x8(var1);
         if (var2 == null && com.aspose.slides.ms.System.d1.a6(var1, this.c8[this.t2].k5)) {
            var2 = com.aspose.slides.ms.System.d1.n5;
         }

         return var2;
      } else {
         throw new ArgumentException(v3.n5("The empty string '' is not a valid name."));
      }
   }

   private void k5(int var1) {
      try {
         if (this.x8 != 0) {
            throw new InvalidOperationException(v3.n5("WriteStartDocument needs to be the first call."));
         }

         this.s7 = y2;
         this.x8 = 1;
         com.aspose.slides.internal.l7h.a5 var2 = new com.aspose.slides.internal.l7h.a5(128);
         var2.n5(com.aspose.slides.ms.System.d1.n5(new Object[]{"version=", this.e2, "1.0", this.e2}));
         if (this.k5 != null) {
            var2.n5(" encoding=");
            var2.n5(this.e2);
            var2.n5(this.k5.s7());
            var2.n5(this.e2);
         }

         if (var1 >= 0) {
            var2.n5(" standalone=");
            var2.n5(this.e2);
            var2.n5(var1 == 0 ? "no" : "yes");
            var2.n5(this.e2);
         }

         this.l6("xml", var2.toString());
      } catch (RuntimeException var3) {
         this.x8 = 8;
         throw var3;
      }
   }

   private void u3(int var1) {
      if (this.x8 == 9) {
         throw new InvalidOperationException(v3.n5("The Writer is closed."));
      }

      if (this.x8 == 8) {
         throw new InvalidOperationException(v3.n5("Token {0} in state {1} would result in an invalid XML document.", r4[var1], w1[8]));
      }

      int var2 = this.s7[var1 * 8 + this.x8];
      if (var2 == 8) {
         throw new InvalidOperationException(v3.n5("Token {0} in state {1} would result in an invalid XML document.", r4[var1], w1[this.x8]));
      }

      switch (var1) {
         case 0:
         case 2:
         case 3:
         case 4:
            if (this.x8 == 4) {
               this.u3();
               this.a6(false);
            } else if (this.x8 == 3) {
               this.a6(false);
            }

            if (var1 == 3) {
               this.c8[this.t2].t2 = true;
            } else if (this.a6 && this.x8 != 0) {
               this.u9(false);
            }
            break;
         case 1:
            if (this.a6 && this.x8 != 0) {
               this.u9(false);
            }
            break;
         case 5:
         case 6:
            if (this.z3) {
               this.e2();
            }

            if (this.x8 == 4) {
               this.u3();
            }

            if (this.x8 == 5) {
               var1 = 6;
            } else {
               this.a6(var1 == 5);
            }

            if (y2 == this.s7 && this.t2 == 1) {
               var2 = 7;
            }
            break;
         case 7:
            if (this.z3) {
               this.e2();
            }

            if (this.x8 == 4) {
               this.u3();
               this.n5.n5(' ');
            } else if (this.x8 == 3) {
               this.n5.n5(' ');
            }
            break;
         case 8:
            if (this.z3) {
               this.e2();
            }

            this.u3();
            break;
         case 9:
         case 10:
         case 11:
         case 12:
            if (var1 != 10 && this.z3) {
               this.e2();
            }

            if (this.x8 == 3 && this.n3 != 9) {
               this.a6(false);
            }

            if (var2 == 5) {
               this.c8[this.t2].t2 = true;
            }
            break;
         default:
            throw new InvalidOperationException(v3.n5("Operation is not valid due to the current state of the object."));
      }

      this.x8 = var2;
      this.n3 = var1;
   }

   private void k5() {
      if (this.z3) {
         this.e2();
      }

      while (this.t2 > 0) {
         this.s7();
      }
   }

   private void u3(boolean var1) {
      try {
         if (this.t2 <= 0) {
            throw new InvalidOperationException(v3.n5("There was no XML start tag open."));
         }

         this.u3(var1 ? 6 : 5);
         if (this.n3 == 6) {
            if (this.a6) {
               this.u9(true);
            }

            this.n5.n5('<');
            this.n5.n5('/');
            if (this.z1 && this.c8[this.t2].l6 != null) {
               this.n5.n5(this.c8[this.t2].l6);
               this.n5.n5(':');
            }

            this.n5.n5(this.c8[this.t2].n5);
            this.n5.n5('>');
         }

         int var2 = this.c8[this.t2].h0;
         if (this.z8 && var2 < this.k7) {
            this.n5(var2 + 1, this.k7);
         }

         this.k7 = var2;
         this.t2--;
      } catch (RuntimeException var3) {
         this.x8 = 8;
         throw var3;
      }
   }

   private void a6(boolean var1) {
      this.l6.n5(false);

      for (int var2 = this.k7; var2 > this.c8[this.t2].h0; var2--) {
         if (!this.m1[var2].k5) {
            this.n5.n5(" xmlns");
            this.n5.n5(':');
            this.n5.n5(this.m1[var2].n5);
            this.n5.n5('=');
            this.n5.n5(this.e2);
            this.l6.n5(this.m1[var2].l6);
            this.n5.n5(this.e2);
         }
      }

      if (!com.aspose.slides.ms.System.d1.a6(this.c8[this.t2].k5, this.c8[this.t2 - 1].k5) && this.c8[this.t2].u3 == 2) {
         this.n5.n5(" xmlns");
         this.n5.n5('=');
         this.n5.n5(this.e2);
         this.l6.n5(this.c8[this.t2].k5);
         this.n5.n5(this.e2);
         this.c8[this.t2].u3 = 3;
      }

      this.l6.n5();
      if (var1) {
         this.n5.n5(" /");
      }

      this.n5.n5('>');
   }

   private void u3() {
      if (this.t4 != 0) {
         this.c8();
      }

      this.l6.n5();
      this.n5.n5(this.t9);
   }

   private void u9(boolean var1) {
      if (this.t2 == 0) {
         this.n5.Z_();
      } else if (!this.c8[this.t2].t2) {
         this.n5.Z_();
         int var2 = var1 ? this.t2 - 1 : this.t2;

         for (int var3 = var2 * this.u9; var3 > 0; var3--) {
            this.n5.n5(this.h0);
         }
      }
   }

   private void n5(String var1, String var2, boolean var3) {
      if ("http://www.w3.org/2000/xmlns/".equals(var2)) {
         throw new ArgumentException(v3.n5("Cannot bind to the reserved namespace."));
      }

      if (var1 == null) {
         switch (this.c8[this.t2].u3) {
            case 0:
            case 1:
               this.c8[this.t2].k5 = var2;
            case 2:
               this.c8[this.t2].u3 = var3 ? 3 : 2;
               break;
            default:
               return;
         }
      } else {
         if (var1.length() != 0 && var2.length() == 0) {
            throw new ArgumentException(v3.n5("Cannot use a prefix with an empty namespace."));
         }

         int var4 = this.u3(var1);
         if (var4 != -1 && com.aspose.slides.ms.System.d1.a6(this.m1[var4].l6, var2)) {
            if (var3) {
               this.m1[var4].k5 = true;
            }
         } else {
            if (var3 && var4 != -1 && var4 > this.c8[this.t2].h0) {
               this.m1[var4].k5 = true;
            }

            this.l6(var1, var2, var3);
         }
      }
   }

   private void l6(String var1, String var2, boolean var3) {
      int var4 = ++this.k7;
      if (var4 == this.m1.length) {
         k3$n5[] var5 = (k3$n5[])com.aspose.slides.ms.System.u3.n5(
            com.aspose.slides.ms.System.u3.n5(com.aspose.slides.internal.v6g.k5.n5(k3$n5.class), var4 * 2)
         );
         com.aspose.slides.ms.System.u3.n5(com.aspose.slides.ms.System.u3.n5((Object)(this.m1)), com.aspose.slides.ms.System.u3.n5((Object)(var5)), var4);
         this.m1 = var5;
      }

      this.m1[var4].n5(var1, var2, var3);
      if (this.z8) {
         this.a6(var4);
      } else if (var4 == 16) {
         this.m3 = new Dictionary<>(new i9());

         for (int var6 = 0; var6 <= var4; var6++) {
            this.a6(var6);
         }

         this.z8 = true;
      }
   }

   private void a6(int var1) {
      String var2 = this.m1[var1].n5;
      int var3 = 0;
      Integer[] var4 = new Integer[]{var3};
      boolean var5 = this.m3.tryGetValue(var2, var4);
      var3 = var4[0];
      if (var5) {
         this.m1[var1].u3 = var3;
      }

      this.m3.set_Item(var2, var1);
   }

   private void n5(int var1, int var2) {
      for (int var3 = var2; var3 >= var1; var3--) {
         if (this.m1[var3].u3 == -1) {
            this.m3.removeItemByKey(this.m1[var3].n5);
         } else {
            this.m3.set_Item(this.m1[var3].n5, this.m1[var3].u3);
         }
      }
   }

   private String h0() {
      int var1 = this.c8[this.t2].c8++ + 1;
      return com.aspose.slides.ms.System.d1.n5(
         "d",
         com.aspose.slides.ms.System.a3.n5(this.t2, "d", com.aspose.slides.internal.x7n.l6.k5()),
         "p",
         com.aspose.slides.ms.System.a3.n5(var1, "d", com.aspose.slides.internal.x7n.l6.k5())
      );
   }

   private void l6(String var1, String var2) {
      this.n5.n5("<?");
      this.n5(var1, false);
      this.n5.n5(var1);
      this.n5.n5(' ');
      if (null != var2) {
         this.l6.l6(var2);
      }

      this.n5.n5("?>");
   }

   private int u3(String var1) {
      if (this.z8) {
         int var2 = 0;
         Integer[] var3 = new Integer[]{var2};
         boolean var4 = this.m3.tryGetValue(var1, var3);
         var2 = var3[0];
         if (var4) {
            return var2;
         }
      } else {
         for (int var6 = this.k7; var6 >= 0; var6--) {
            if (com.aspose.slides.ms.System.d1.a6(this.m1[var6].n5, var1)) {
               return var6;
            }
         }
      }

      return -1;
   }

   private int s7(String var1) {
      if (this.z8) {
         int var2 = 0;
         Integer[] var3 = new Integer[]{var2};
         boolean var4 = this.m3.tryGetValue(var1, var3);
         var2 = var3[0];
         if (var4 && var2 > this.c8[this.t2].h0) {
            return var2;
         }
      } else {
         for (int var6 = this.k7; var6 > this.c8[this.t2].h0; var6--) {
            if (com.aspose.slides.ms.System.d1.a6(this.m1[var6].n5, var1)) {
               return var6;
            }
         }
      }

      return -1;
   }

   private String x8(String var1) {
      for (int var2 = this.k7; var2 >= 0; var2--) {
         if (com.aspose.slides.ms.System.d1.a6(this.m1[var2].l6, var1) && this.u3(this.m1[var2].n5) == var2) {
            return this.m1[var2].n5;
         }
      }

      return null;
   }

   private void n5(String var1, boolean var2) {
      if (var1 != null && var1.length() != 0) {
         int var3 = var1.length();
         if (this.z1) {
            int var4 = -1;
            int var5 = y5.l6(var1);

            while (true) {
               if (var5 == var3) {
                  return;
               }

               if (var1.charAt(var5) != ':' || var2 || var4 != -1 || var5 <= 0 || var5 + 1 >= var3) {
                  break;
               }

               var4 = var5++;
               var5 += y5.n5(var1, var5);
            }
         } else if (y5.n5(var1)) {
            return;
         }

         throw new ArgumentException(v3.n5("Invalid name character in '{0}'.", var1));
      } else {
         throw new ArgumentException(v3.n5("The empty string '' is not a valid name."));
      }
   }

   private void c8() {
      String var1 = this.l6.l6();
      switch (this.t4) {
         case 1:
            var1 = f4.j5(var1);
            if ("default".equals(var1)) {
               this.c8[this.t2].a6 = 1;
            } else {
               if (!"preserve".equals(var1)) {
                  throw new ArgumentException(v3.n5("'{0}' is an invalid xml:space value.", var1));
               }

               this.c8[this.t2].a6 = 2;
            }
            break;
         case 2:
            this.c8[this.t2].u9 = var1;
            break;
         case 3:
            this.u9(this.q0, var1);
            this.n5(this.q0, var1, true);
      }
   }

   private void u9(String var1, String var2) {
      if (var1 != null
         && var1.length() == 3
         && (var1.charAt(0) == 'x' || var1.charAt(0) == 'X')
         && (var1.charAt(1) == 'm' || var1.charAt(1) == 'M')
         && (var1.charAt(2) == 'l' || var1.charAt(2) == 'L')
         && !"http://www.w3.org/XML/1998/namespace".equals(var2)) {
         throw new ArgumentException(
            v3.n5(
               "Prefixes beginning with \"xml\" (regardless of whether the characters are uppercase, lowercase, or some combination thereof) are reserved for use by XML."
            )
         );
      }
   }

   private void y4() {
      if (this.t2 == this.c8.length - 1) {
         k3$l6[] var1 = (k3$l6[])com.aspose.slides.ms.System.u3.n5(
            com.aspose.slides.ms.System.u3.n5(com.aspose.slides.internal.v6g.k5.n5(k3$l6.class), this.c8.length + 10)
         );
         if (this.t2 > 0) {
            com.aspose.slides.ms.System.u3.n5(com.aspose.slides.ms.System.u3.n5((Object)(this.c8)), com.aspose.slides.ms.System.u3.n5((Object)(var1)), this.t2 + 1);
         }

         this.c8 = var1;
      }

      this.t2++;
      this.c8[this.t2].n5(this.k7);
   }

   private void e2() {
      if (null != this.y4) {
         this.y4.n5();
      }

      this.z3 = false;
   }

   static {
      com.aspose.slides.internal.v6g.k5.n5(k3$n5.class, new d7());
      com.aspose.slides.internal.v6g.k5.n5(k3$l6.class, new o1());
   }
}

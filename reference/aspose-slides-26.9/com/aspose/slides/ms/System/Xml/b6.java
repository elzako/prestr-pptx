package com.aspose.slides.ms.System.Xml;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.exceptions.XmlException;

public class b6 extends l1 {
   private l1 k5;
   private v9 u3;
   private a3 a6;
   private b6$u3[] u9;
   private int h0;
   private Dictionary<String, Integer> c8;
   private boolean t2;
   private b6$k5[] s7;
   private int x8;
   private b6$n5[] n3;
   private int y4;
   private Dictionary<String, Integer> e2;
   private int t9 = 0;
   private b6$l6 z1 = new b6$l6(null);
   private String t4;
   private int[] q0;
   private int z3;
   private boolean m1;
   private boolean k7;
   private boolean m3;
   private int z8;
   private boolean j5;
   private boolean w1;
   private u4 r4 = u4.n5().l6();
   private i9 c4;
   public static final String[] n5 = new String[]{
      "Start",
      "TopLevel",
      "Document",
      "Element Start Tag",
      "Element Content",
      "Element Content",
      "Attribute",
      "EndRootElement",
      "Attribute",
      "Special Attribute",
      "End Document",
      "Root Level Attribute Value",
      "Root Level Special Attribute Value",
      "Root Level Base64 Attribute Value",
      "After Root Level Attribute",
      "Closed",
      "Error"
   };
   public static final String[] l6 = new String[]{
      "StartDocument",
      "EndDocument",
      "PI",
      "Comment",
      "DTD",
      "StartElement",
      "EndElement",
      "StartAttribute",
      "EndAttribute",
      "Text",
      "CDATA",
      "Atomic value",
      "Base64",
      "RawData",
      "Whitespace"
   };
   private static int[] y2 = new int[]{0, 1, 1, 2, 4, 4, 3, 4, 3, 3, 4, 3, 3, 3, 3, 5, 6};
   private static final int[] y1 = new int[]{
      2,
      16,
      16,
      16,
      16,
      112,
      16,
      16,
      16,
      16,
      16,
      16,
      16,
      16,
      16,
      16,
      16,
      16,
      16,
      16,
      16,
      112,
      16,
      10,
      16,
      16,
      16,
      16,
      16,
      16,
      16,
      16,
      104,
      1,
      2,
      101,
      4,
      112,
      113,
      7,
      109,
      109,
      16,
      16,
      16,
      16,
      16,
      16,
      104,
      1,
      2,
      101,
      4,
      112,
      113,
      7,
      109,
      109,
      16,
      16,
      16,
      16,
      16,
      16,
      104,
      1,
      2,
      16,
      16,
      112,
      113,
      16,
      16,
      16,
      16,
      16,
      16,
      16,
      16,
      16,
      106,
      3,
      3,
      102,
      3,
      112,
      113,
      16,
      107,
      107,
      16,
      16,
      16,
      16,
      16,
      16,
      16,
      16,
      16,
      101,
      4,
      112,
      113,
      16,
      108,
      108,
      16,
      16,
      16,
      16,
      16,
      16,
      16,
      16,
      16,
      8,
      16,
      112,
      113,
      16,
      111,
      111,
      16,
      16,
      16,
      16,
      16,
      16,
      16,
      16,
      16,
      16,
      16,
      112,
      113,
      16,
      3,
      3,
      16,
      16,
      16,
      16,
      16,
      16,
      16,
      16,
      16,
      101,
      4,
      112,
      113,
      16,
      8,
      9,
      16,
      16,
      16,
      16,
      16,
      16,
      16,
      16,
      16,
      101,
      4,
      112,
      113,
      16,
      109,
      109,
      16,
      16,
      16,
      16,
      16,
      16,
      16,
      16,
      16,
      101,
      4,
      112,
      113,
      16,
      8,
      16,
      16,
      16,
      16,
      16,
      16,
      16,
      16,
      16,
      16,
      103,
      5,
      5,
      6,
      16,
      6,
      16,
      16,
      16,
      16,
      16,
      16,
      16,
      104,
      16,
      2,
      101,
      4,
      112,
      113,
      7,
      8,
      9,
      16,
      16,
      16,
      16,
      16,
      16,
      104,
      1,
      2,
      101,
      4,
      112,
      113,
      7,
      8,
      9,
      16,
      16,
      16,
      16,
      16,
      16
   };
   private static final int[] a0 = new int[]{
      2,
      16,
      16,
      16,
      16,
      112,
      16,
      16,
      16,
      16,
      16,
      16,
      16,
      16,
      16,
      16,
      16,
      16,
      16,
      16,
      16,
      112,
      16,
      10,
      16,
      16,
      16,
      16,
      16,
      16,
      16,
      16,
      1,
      1,
      16,
      101,
      4,
      112,
      113,
      7,
      109,
      109,
      16,
      16,
      16,
      16,
      16,
      16,
      1,
      1,
      16,
      101,
      4,
      112,
      113,
      7,
      109,
      109,
      16,
      16,
      16,
      16,
      16,
      16,
      104,
      1,
      16,
      16,
      16,
      112,
      113,
      16,
      16,
      16,
      16,
      16,
      16,
      16,
      16,
      16,
      115,
      3,
      16,
      102,
      3,
      112,
      113,
      3,
      107,
      107,
      16,
      16,
      16,
      16,
      16,
      16,
      16,
      16,
      16,
      101,
      4,
      112,
      113,
      16,
      108,
      108,
      16,
      16,
      16,
      16,
      16,
      16,
      11,
      16,
      16,
      8,
      16,
      112,
      113,
      16,
      111,
      111,
      16,
      118,
      118,
      114,
      11,
      16,
      16,
      16,
      16,
      16,
      16,
      112,
      113,
      16,
      3,
      3,
      16,
      14,
      14,
      114,
      16,
      16,
      116,
      116,
      16,
      101,
      4,
      112,
      113,
      4,
      8,
      9,
      16,
      11,
      12,
      114,
      16,
      16,
      116,
      116,
      16,
      101,
      4,
      112,
      113,
      4,
      109,
      109,
      16,
      16,
      16,
      16,
      16,
      16,
      116,
      116,
      16,
      101,
      4,
      112,
      113,
      4,
      8,
      16,
      16,
      11,
      16,
      114,
      16,
      16,
      117,
      117,
      16,
      103,
      5,
      5,
      6,
      5,
      6,
      16,
      16,
      13,
      16,
      13,
      16,
      16,
      116,
      1,
      16,
      101,
      4,
      112,
      113,
      4,
      8,
      9,
      16,
      11,
      12,
      114,
      14,
      16,
      1,
      1,
      16,
      101,
      4,
      112,
      113,
      7,
      8,
      9,
      16,
      11,
      12,
      114,
      14,
      16
   };
   private static final com.aspose.slides.internal.v6g.u9 d2 = new com.aspose.slides.internal.v6g.u9("space", "lang", "lt", "gt", "quot", "apos", "amp");

   public b6(l1 var1, y7 var2) {
      this.k5 = var1;
      this.u3 = com.aspose.slides.internal.v6g.k5.n5(var1, v9.class);
      this.a6 = com.aspose.slides.internal.v6g.k5.n5(var1, a3.class);
      if (this.u3 != null) {
         this.u3.n5(new b6$a6(this));
      }

      this.m1 = var2.s7();
      this.k7 = (var2.x8() & 1) != 0;
      this.m3 = var2.n3();
      this.z8 = var2.t2();
      this.q0 = this.z8 == 2 ? y1 : a0;
      this.z3 = 0;
      this.u9 = (b6$u3[])com.aspose.slides.ms.System.u3.n5(com.aspose.slides.ms.System.u3.n5(com.aspose.slides.internal.v6g.k5.n5(b6$u3.class), 8));
      this.u9[0].n5("xmlns", "http://www.w3.org/2000/xmlns/", 3);
      this.u9[1].n5("xml", "http://www.w3.org/XML/1998/namespace", 3);
      if (this.a6 == null) {
         this.u9[2].n5(com.aspose.slides.ms.System.d1.n5, com.aspose.slides.ms.System.d1.n5, 2);
      } else {
         String var3 = this.a6.n5(com.aspose.slides.ms.System.d1.n5);
         this.u9[2].n5(com.aspose.slides.ms.System.d1.n5, var3 == null ? com.aspose.slides.ms.System.d1.n5 : var3, 2);
      }

      this.h0 = 2;
      this.s7 = (b6$k5[])com.aspose.slides.ms.System.u3.n5(com.aspose.slides.ms.System.u3.n5(com.aspose.slides.internal.v6g.k5.n5(b6$k5.class), 8));
      this.s7[0].n5(com.aspose.slides.ms.System.d1.n5, com.aspose.slides.ms.System.d1.n5, com.aspose.slides.ms.System.d1.n5, this.h0);
      this.s7[0].a6 = 0;
      this.s7[0].u9 = null;
      this.x8 = 0;
      this.n3 = (b6$n5[])com.aspose.slides.ms.System.u3.n5(com.aspose.slides.ms.System.u3.n5(com.aspose.slides.internal.v6g.k5.n5(b6$n5.class), 8));
      this.c4 = new i9();
   }

   @Override
   public int n3() {
      return this.z3 <= 16 ? y2[this.z3] : 6;
   }

   @Override
   public void t2() {
      this.l6(0);
   }

   @Override
   public void l6(boolean var1) {
      this.l6(var1 ? 1 : 2);
   }

   @Override
   public void n5(String var1, String var2, String var3, String var4) {
      try {
         if (var1 != null && var1.length() != 0) {
            f4.n5(var1, 1);
            if (this.z8 == 1) {
               throw new InvalidOperationException(v3.n5("DTD is not allowed in XML fragments."));
            }

            this.u3(4);
            if (this.j5) {
               this.z3 = 16;
               throw new InvalidOperationException(v3.n5("The DTD has already been written out."));
            }

            if (this.z8 == 0) {
               this.z8 = 2;
               this.q0 = y1;
            }

            if (this.m1) {
               int var5;
               if (var2 != null && (var5 = this.r4.u3(var2)) >= 0) {
                  throw new ArgumentException(
                     v3.n5("'{0}', hexadecimal value {1}, is an invalid character.", XmlException.buildCharExceptionArgs(var2, var5)), "pubid"
                  );
               }

               if (var3 != null && (var5 = this.r4.k5(var3)) >= 0) {
                  throw new ArgumentException(
                     v3.n5("'{0}', hexadecimal value {1}, is an invalid character.", XmlException.buildCharExceptionArgs(var3, var5)), "sysid"
                  );
               }

               if (var4 != null && (var5 = this.r4.k5(var4)) >= 0) {
                  throw new ArgumentException(
                     v3.n5("'{0}', hexadecimal value {1}, is an invalid character.", XmlException.buildCharExceptionArgs(var4, var5)), "subset"
                  );
               }
            }

            this.k5.n5(var1, var2, var3, var4);
            this.j5 = true;
         } else {
            throw new ArgumentException(v3.n5("The empty string '' is not a valid name."));
         }
      } catch (RuntimeException var6) {
         this.z3 = 16;
         throw var6;
      }
   }

   @Override
   public void n5(String var1, String var2, String var3) {
      try {
         if (var2 != null && var2.length() != 0) {
            this.n3(var2);
            this.u3(5);
            if (var1 == null) {
               if (var3 != null) {
                  var1 = this.n5(var3);
               }

               if (var1 == null) {
                  var1 = com.aspose.slides.ms.System.d1.n5;
               }
            } else if (var1.length() > 0) {
               this.n3(var1);
               if (var3 == null) {
                  var3 = this.u3(var1);
               }

               if (var3 == null || var3 != null && var3.length() == 0) {
                  throw new ArgumentException(v3.n5("Cannot use a prefix with an empty namespace."));
               }
            }

            if (var3 == null) {
               var3 = this.u3(var1);
               if (var3 == null) {
                  var3 = com.aspose.slides.ms.System.d1.n5;
               }
            }

            if (this.x8 == 0 && this.u3 != null) {
               this.u3.k5(this.z8);
            }

            this.k5.n5(var1, var2, var3);
            int var4 = ++this.x8;
            if (var4 == this.s7.length) {
               b6$k5[] var5 = (b6$k5[])com.aspose.slides.ms.System.u3.n5(
                  com.aspose.slides.ms.System.u3.n5(com.aspose.slides.internal.v6g.k5.n5(b6$k5.class), var4 * 2)
               );
               com.aspose.slides.ms.System.u3.n5(com.aspose.slides.ms.System.u3.n5((Object)(this.s7)), com.aspose.slides.ms.System.u3.n5((Object)(var5)), var4);
               this.s7 = var5;
            }

            this.s7[var4].n5(var1, var2, var3, this.h0);
            this.l6(var1, var3);
            if (this.y4 >= 14) {
               this.e2.clear();
            }

            this.y4 = 0;
         } else {
            throw new ArgumentException(v3.n5("The empty string '' is not a valid local name."));
         }
      } catch (RuntimeException var6) {
         this.z3 = 16;
         throw var6;
      }
   }

   @Override
   public void s7() {
      try {
         this.u3(6);
         int var1 = this.x8;
         if (var1 == 0) {
            throw new XmlException("There was no XML start tag open.", com.aspose.slides.ms.System.d1.n5);
         }

         if (this.u3 != null) {
            this.s7[var1].n5(this.u3);
         } else {
            this.k5.s7();
         }

         int var2 = this.s7[var1].n5;
         if (this.t2 && var2 < this.h0) {
            this.n5(var2 + 1, this.h0);
         }

         this.h0 = var2;
         this.x8 = --var1;
         if (var1 == 0) {
            if (this.z8 == 2) {
               this.z3 = 7;
            } else {
               this.z3 = 1;
            }
         }
      } catch (RuntimeException var3) {
         this.z3 = 16;
         throw var3;
      }
   }

   @Override
   public void x8() {
      try {
         this.u3(6);
         int var1 = this.x8;
         if (var1 == 0) {
            throw new XmlException("There was no XML start tag open.", com.aspose.slides.ms.System.d1.n5);
         }

         if (this.u3 != null) {
            this.s7[var1].l6(this.u3);
         } else {
            this.k5.x8();
         }

         int var2 = this.s7[var1].n5;
         if (this.t2 && var2 < this.h0) {
            this.n5(var2 + 1, this.h0);
         }

         this.h0 = var2;
         this.x8 = --var1;
         if (var1 == 0) {
            if (this.z8 == 2) {
               this.z3 = 7;
            } else {
               this.z3 = 1;
            }
         }
      } catch (RuntimeException var3) {
         this.z3 = 16;
         throw var3;
      }
   }

   @Override
   public void u3(String var1, String var2, String var3) {
      try {
         if (var2 == null || var2.length() == 0) {
            if (!"xmlns".equals(var1)) {
               throw new ArgumentException(v3.n5("The empty string '' is not a valid local name."));
            }

            var2 = "xmlns";
            var1 = com.aspose.slides.ms.System.d1.n5;
         }

         this.n3(var2);
         this.u3(7);
         if (var1 == null) {
            if (var3 != null && (!"xmlns".equals(var2) || !"http://www.w3.org/2000/xmlns/".equals(var3))) {
               var1 = this.n5(var3);
            }

            if (var1 == null) {
               var1 = com.aspose.slides.ms.System.d1.n5;
            }
         }

         if (var3 == null) {
            if (var1 != null && var1.length() > 0) {
               var3 = this.u3(var1);
            }

            if (var3 == null) {
               var3 = com.aspose.slides.ms.System.d1.n5;
            }
         }

         label100: {
            if (var1.length() == 0) {
               if (var2.charAt(0) == 'x' && "xmlns".equals(var2)) {
                  if (var3.length() > 0 && !"http://www.w3.org/2000/xmlns/".equals(var3)) {
                     throw new ArgumentException(v3.n5("Prefix \"xmlns\" is reserved for use by XML."));
                  }

                  this.t4 = com.aspose.slides.ms.System.d1.n5;
                  this.n5(1);
                  break label100;
               }

               if (var3.length() > 0) {
                  var1 = this.n5(var3);
                  if (var1 == null || var1.length() == 0) {
                     var1 = this.e2();
                  }
               }
            } else {
               if (var1.charAt(0) == 'x') {
                  if ("xmlns".equals(var1)) {
                     if (var3.length() > 0 && !"http://www.w3.org/2000/xmlns/".equals(var3)) {
                        throw new ArgumentException(v3.n5("Prefix \"xmlns\" is reserved for use by XML."));
                     }

                     this.t4 = var2;
                     this.n5(2);
                     break label100;
                  }

                  if ("xml".equals(var1)) {
                     if (var3.length() > 0 && !"http://www.w3.org/XML/1998/namespace".equals(var3)) {
                        throw new ArgumentException(
                           v3.n5("Prefix \"xml\" is reserved for use by XML and can be mapped only to namespace name \"http://www.w3.org/XML/1998/namespace\".")
                        );
                     }

                     switch (d2.n5(var2)) {
                        case 0:
                           this.n5(3);
                           break label100;
                        case 1:
                           this.n5(4);
                           break label100;
                     }
                  }
               }

               this.n3(var1);
               if (var3.length() == 0) {
                  var1 = com.aspose.slides.ms.System.d1.n5;
               } else {
                  String var4 = this.x8(var1);
                  if (var4 != null && !com.aspose.slides.ms.System.d1.a6(var4, var3)) {
                     var1 = this.e2();
                  }
               }
            }

            if (var1.length() != 0) {
               this.l6(var1, var3);
            }
         }

         this.l6(var1, var2, var3);
         if (this.t9 == 0) {
            this.k5.u3(var1, var2, var3);
         }
      } catch (RuntimeException var5) {
         this.z3 = 16;
         throw var5;
      }
   }

   @Override
   public void l6() {
      try {
         this.u3(8);
         if (this.t9 != 0) {
            switch (this.t9) {
               case 1:
                  String var5 = this.z1.n5();
                  if (this.u9(com.aspose.slides.ms.System.d1.n5, var5)) {
                     if (this.u3 != null) {
                        if (this.u3.aa_()) {
                           this.u3.u3(com.aspose.slides.ms.System.d1.n5);
                           this.z1.n5(this.u3);
                           this.u3.u3();
                        } else {
                           this.u3.l6(com.aspose.slides.ms.System.d1.n5, var5);
                        }
                     } else {
                        this.k5.u3(com.aspose.slides.ms.System.d1.n5, "xmlns", "http://www.w3.org/2000/xmlns/");
                        this.z1.n5(this.k5);
                        this.k5.l6();
                     }
                  }

                  this.t4 = null;
                  break;
               case 2:
                  String var4 = this.z1.n5();
                  if (var4.length() == 0) {
                     throw new ArgumentException(v3.n5("Cannot use a prefix with an empty namespace."));
                  }

                  if ("http://www.w3.org/2000/xmlns/".equals(var4) || "http://www.w3.org/XML/1998/namespace".equals(var4) && !"xml".equals(this.t4)) {
                     throw new ArgumentException(v3.n5("Cannot bind to the reserved namespace."));
                  }

                  if (this.u9(this.t4, var4)) {
                     if (this.u3 != null) {
                        if (this.u3.aa_()) {
                           this.u3.u3(this.t4);
                           this.z1.n5(this.u3);
                           this.u3.u3();
                        } else {
                           this.u3.l6(this.t4, var4);
                        }
                     } else {
                        this.k5.u3("xmlns", this.t4, "http://www.w3.org/2000/xmlns/");
                        this.z1.n5(this.k5);
                        this.k5.l6();
                     }
                  }

                  this.t4 = null;
                  break;
               case 3:
                  this.z1.l6();
                  String var3 = this.z1.n5();
                  if ("default".equals(var3)) {
                     this.s7[this.x8].a6 = 1;
                  } else {
                     if (!"preserve".equals(var3)) {
                        throw new ArgumentException(v3.n5("'{0}' is an invalid xml:space value.", var3));
                     }

                     this.s7[this.x8].a6 = 2;
                  }

                  this.k5.u3("xml", "space", "http://www.w3.org/XML/1998/namespace");
                  this.z1.n5(this.k5);
                  this.k5.l6();
                  break;
               case 4:
                  String var1 = this.z1.n5();
                  this.s7[this.x8].u9 = var1;
                  this.k5.u3("xml", "lang", "http://www.w3.org/XML/1998/namespace");
                  this.z1.n5(this.k5);
                  this.k5.l6();
            }

            this.t9 = 0;
            this.z1.k5();
         } else {
            this.k5.l6();
         }
      } catch (RuntimeException var2) {
         this.z3 = 16;
         throw var2;
      }
   }

   @Override
   public void a6(String var1) {
      try {
         if (var1 == null) {
            var1 = com.aspose.slides.ms.System.d1.n5;
         }

         this.u3(10);
         this.k5.a6(var1);
      } catch (RuntimeException var3) {
         this.z3 = 16;
         throw var3;
      }
   }

   @Override
   public void u9(String var1) {
      try {
         if (var1 == null) {
            var1 = com.aspose.slides.ms.System.d1.n5;
         }

         this.u3(3);
         this.k5.u9(var1);
      } catch (RuntimeException var3) {
         this.z3 = 16;
         throw var3;
      }
   }

   @Override
   public void n5(String var1, String var2) {
      try {
         if (var1 != null && var1.length() != 0) {
            this.n3(var1);
            if (var2 == null) {
               var2 = com.aspose.slides.ms.System.d1.n5;
            }

            if (var1.length() == 3 && com.aspose.slides.ms.System.d1.a6(var1, "xml", (short)5) == 0) {
               if (this.z3 != 0) {
                  throw new ArgumentException(
                     v3.n5(
                        this.z8 == 2
                           ? "Cannot write XML declaration. WriteStartDocument method has already written it."
                           : "Cannot write XML declaration. XML declaration can be only at the beginning of the document."
                     )
                  );
               }

               this.w1 = true;
               this.u3(2);
               if (this.u3 != null) {
                  this.u3.n5(var2);
               } else {
                  this.k5.n5(var1, var2);
               }
            } else {
               this.u3(2);
               this.k5.n5(var1, var2);
            }
         } else {
            throw new ArgumentException(v3.n5("The empty string '' is not a valid name."));
         }
      } catch (RuntimeException var4) {
         this.z3 = 16;
         throw var4;
      }
   }

   @Override
   public void k5(String var1) {
      try {
         if (var1 != null && var1.length() != 0) {
            this.n3(var1);
            this.u3(9);
            if (this.u3()) {
               this.z1.n5(var1);
            } else {
               this.k5.k5(var1);
            }
         } else {
            throw new ArgumentException(v3.n5("The empty string '' is not a valid name."));
         }
      } catch (RuntimeException var3) {
         this.z3 = 16;
         throw var3;
      }
   }

   @Override
   public void n5(char var1) {
      try {
         if (com.aspose.slides.ms.System.t9.y4(var1)) {
            throw new ArgumentException(v3.n5("The surrogate pair is invalid. Missing a low surrogate character."));
         }

         this.u3(9);
         if (this.u3()) {
            this.z1.n5(var1);
         } else {
            this.k5.n5(var1);
         }
      } catch (RuntimeException var3) {
         this.z3 = 16;
         throw var3;
      }
   }

   @Override
   public void n5(char var1, char var2) {
      try {
         if (!com.aspose.slides.ms.System.t9.k5(var2, var1)) {
            throw f4.n5(var1, var2);
         }

         this.u3(9);
         if (this.u3()) {
            this.z1.n5(var1, var2);
         } else {
            this.k5.n5(var1, var2);
         }
      } catch (RuntimeException var4) {
         this.z3 = 16;
         throw var4;
      }
   }

   @Override
   public void h0(String var1) {
      try {
         if (var1 == null) {
            var1 = com.aspose.slides.ms.System.d1.n5;
         }

         if (!u4.n5().n5(var1)) {
            throw new ArgumentException(v3.n5("Only white space characters should be used."));
         }

         this.u3(14);
         if (this.u3()) {
            this.z1.l6(var1);
         } else {
            this.k5.h0(var1);
         }
      } catch (RuntimeException var3) {
         this.z3 = 16;
         throw var3;
      }
   }

   @Override
   public void l6(String var1) {
      try {
         if (var1 != null) {
            this.u3(9);
            if (this.u3()) {
               this.z1.k5(var1);
            } else {
               this.k5.l6(var1);
            }
         }
      } catch (RuntimeException var3) {
         this.z3 = 16;
         throw var3;
      }
   }

   @Override
   public void n5(char[] var1, int var2, int var3) {
      try {
         if (var1 == null) {
            throw new ArgumentNullException("buffer");
         }

         if (var2 < 0) {
            throw new ArgumentOutOfRangeException("index");
         }

         if (var3 < 0) {
            throw new ArgumentOutOfRangeException("count");
         }

         if (var3 > var1.length - var2) {
            throw new ArgumentOutOfRangeException("count");
         }

         this.u3(9);
         if (this.u3()) {
            this.z1.n5(var1, var2, var3);
         } else {
            this.k5.n5(var1, var2, var3);
         }
      } catch (RuntimeException var5) {
         this.z3 = 16;
         throw var5;
      }
   }

   @Override
   public void a_(char[] var1, int var2, int var3) {
      try {
         if (var1 == null) {
            throw new ArgumentNullException("buffer");
         }

         if (var2 < 0) {
            throw new ArgumentOutOfRangeException("index");
         }

         if (var3 < 0) {
            throw new ArgumentOutOfRangeException("count");
         }

         if (var3 > var1.length - var2) {
            throw new ArgumentOutOfRangeException("count");
         }

         this.u3(13);
         if (this.u3()) {
            this.z1.l6(var1, var2, var3);
         } else {
            this.k5.a_(var1, var2, var3);
         }
      } catch (RuntimeException var5) {
         this.z3 = 16;
         throw var5;
      }
   }

   @Override
   public void c8(String var1) {
      try {
         if (var1 != null) {
            this.u3(13);
            if (this.u3()) {
               this.z1.u3(var1);
            } else {
               this.k5.c8(var1);
            }
         }
      } catch (RuntimeException var3) {
         this.z3 = 16;
         throw var3;
      }
   }

   @Override
   public void n5(byte[] var1, int var2, int var3) {
      try {
         if (var1 == null) {
            throw new ArgumentNullException("buffer");
         }

         if (var2 < 0) {
            throw new ArgumentOutOfRangeException("index");
         }

         if (var3 < 0) {
            throw new ArgumentOutOfRangeException("count");
         }

         if (var3 > var1.length - var2) {
            throw new ArgumentOutOfRangeException("count");
         }

         this.u3(12);
         this.k5.n5(var1, var2, var3);
      } catch (RuntimeException var5) {
         this.z3 = 16;
         throw var5;
      }
   }

   @Override
   public void a6() {
      if (this.z3 != 15) {
         try {
            if (this.m3) {
               while (this.z3 != 16 && this.x8 > 0) {
                  this.s7();
               }
            } else if (this.z3 != 16 && this.x8 > 0) {
               try {
                  this.u3(6);
               } catch (RuntimeException var18) {
                  this.z3 = 16;
                  throw var18;
               }
            }

            if (this.h0() && this.u3 != null) {
               this.u3.c8();
            }

            this.k5.u9();
         } finally {
            try {
               if (this.u3 != null) {
                  this.u3.u3(this.n3());
               } else {
                  this.k5.a6();
               }
            } finally {
               this.z3 = 15;
            }
         }
      }
   }

   @Override
   public void u9() {
      try {
         this.k5.u9();
      } catch (RuntimeException var2) {
         this.z3 = 16;
         throw var2;
      }
   }

   public String n5(String var1) {
      try {
         if (var1 == null) {
            throw new ArgumentNullException("ns");
         }

         for (int var2 = this.h0; var2 >= 0; var2--) {
            if (com.aspose.slides.ms.System.d1.a6(this.u9[var2].l6, var1)) {
               String var3 = this.u9[var2].n5;
               var2++;

               while (var2 <= this.h0) {
                  if (com.aspose.slides.ms.System.d1.a6(this.u9[var2].n5, var3)) {
                     return null;
                  }

                  var2++;
               }

               return var3;
            }
         }

         return this.a6 != null ? this.a6.l6(var1) : null;
      } catch (RuntimeException var4) {
         this.z3 = 16;
         throw var4;
      }
   }

   @Override
   public void t2(String var1) {
      try {
         if (var1 != null) {
            if (this.u3()) {
               this.u3(9);
               this.z1.a6(var1);
            } else {
               this.u3(11);
               this.k5.t2(var1);
            }
         }
      } catch (RuntimeException var3) {
         this.z3 = 16;
         throw var3;
      }
   }

   @Override
   public void l6(byte[] var1, int var2, int var3) {
      if (this.t9()) {
         throw new InvalidOperationException(v3.n5("The Writer is closed or in error state."));
      }

      try {
         this.u3(9);
         super.l6(var1, var2, var3);
      } catch (RuntimeException var5) {
         this.z3 = 16;
         throw var5;
      }
   }

   public final v9 n5() {
      return this.u3;
   }

   private boolean u3() {
      return this.t9 != 0;
   }

   private boolean h0() {
      return this.z3 == 5 || this.z3 == 6 || this.z3 == 13;
   }

   private void n5(int var1) {
      this.t9 = var1;
      if (8 == this.z3) {
         this.z3 = 9;
      } else if (11 == this.z3) {
         this.z3 = 12;
      } else if (this.z1 == null) {
         this.z1 = new b6$l6(null);
      }
   }

   private void l6(int var1) {
      try {
         this.u3(0);
         if (this.z8 == 0) {
            this.z8 = 2;
            this.q0 = y1;
         } else if (this.z8 == 1) {
            throw new InvalidOperationException(v3.n5("WriteStartDocument cannot be called on writers created with ConformanceLevel.Fragment."));
         }

         if (this.u3 != null) {
            if (!this.w1) {
               this.u3.n5(var1);
            }
         } else {
            this.k5.t2();
         }
      } catch (RuntimeException var3) {
         this.z3 = 16;
         throw var3;
      }
   }

   private void c8() {
      this.z8 = 1;
   }

   private void l6(String var1, String var2) {
      int var3 = this.s7(var1);
      byte var4;
      if (var3 != -1) {
         if (var3 > this.s7[this.x8].n5) {
            if (!com.aspose.slides.ms.System.d1.a6(this.u9[var3].l6, var2)) {
               throw new XmlException(
                  "The prefix '{0}' cannot be redefined from '{1}' to '{2}' within the same start element tag.", new String[]{var1, this.u9[var3].l6, var2}
               );
            }

            return;
         }

         if (this.u9[var3].k5 == 3) {
            if (!"xml".equals(var1)) {
               throw new ArgumentException(v3.n5("Prefix \"xmlns\" is reserved for use by XML."));
            }

            if (!com.aspose.slides.ms.System.d1.a6(var2, this.u9[var3].l6)) {
               throw new ArgumentException(
                  v3.n5("Prefix \"xml\" is reserved for use by XML and can be mapped only to namespace name \"http://www.w3.org/XML/1998/namespace\".")
               );
            }

            var4 = 2;
         } else {
            var4 = (byte)(com.aspose.slides.ms.System.d1.a6(this.u9[var3].l6, var2) ? 2 : 1);
         }
      } else {
         if ("http://www.w3.org/XML/1998/namespace".equals(var2) && !"xml".equals(var1)
            || "http://www.w3.org/2000/xmlns/".equals(var2) && !"xmlns".equals(var1)) {
            throw new ArgumentException(v3.n5("Prefix '{0}' cannot be mapped to namespace name reserved for \"xml\" or \"xmlns\".", var1));
         }

         if (this.a6 != null) {
            String var5 = this.a6.n5(var1);
            var4 = (byte)(com.aspose.slides.ms.System.d1.a6(var5, var2) ? 2 : 1);
         } else {
            var4 = 1;
         }
      }

      this.n5(var1, var2, var4);
   }

   private boolean u9(String var1, String var2) {
      boolean var3 = true;
      int var4 = this.s7(var1);
      if (var4 != -1) {
         if (var4 > this.s7[this.x8].n5) {
            if (!com.aspose.slides.ms.System.d1.a6(this.u9[var4].l6, var2)) {
               throw new XmlException(
                  "The prefix '{0}' cannot be redefined from '{1}' to '{2}' within the same start element tag.", new String[]{var1, this.u9[var4].l6, var2}
               );
            }

            int var5 = this.u9[var4].k5;
            if (var5 == 0) {
               throw h0(var1.length() == 0 ? com.aspose.slides.ms.System.d1.n5 : "xmlns", var1.length() == 0 ? "xmlns" : var1);
            }

            if (this.k7 && var5 != 1) {
               var3 = false;
            }

            this.u9[var4].k5 = 0;
            return var3;
         }

         if (com.aspose.slides.ms.System.d1.a6(this.u9[var4].l6, var2) && this.k7) {
            var3 = false;
         }
      } else if (this.a6 != null) {
         String var6 = this.a6.n5(var1);
         if (com.aspose.slides.ms.System.d1.a6(var6, var2) && this.k7) {
            var3 = false;
         }
      }

      if ((!"http://www.w3.org/XML/1998/namespace".equals(var2) || "xml".equals(var1))
         && (!"http://www.w3.org/2000/xmlns/".equals(var2) || "xmlns".equals(var1))) {
         if (var1.length() > 0 && var1.charAt(0) == 'x') {
            if ("xml".equals(var1)) {
               if (!"http://www.w3.org/XML/1998/namespace".equals(var2)) {
                  throw new ArgumentException(
                     v3.n5("Prefix \"xml\" is reserved for use by XML and can be mapped only to namespace name \"http://www.w3.org/XML/1998/namespace\".")
                  );
               }
            } else if ("xmlns".equals(var1)) {
               throw new ArgumentException(v3.n5("Prefix \"xmlns\" is reserved for use by XML."));
            }
         }

         this.n5(var1, var2, 0);
         return var3;
      } else {
         throw new ArgumentException(v3.n5("Prefix '{0}' cannot be mapped to namespace name reserved for \"xml\" or \"xmlns\".", var1));
      }
   }

   private void n5(String var1, String var2, int var3) {
      int var4 = ++this.h0;
      if (var4 == this.u9.length) {
         b6$u3[] var5 = (b6$u3[])com.aspose.slides.ms.System.u3.n5(
            com.aspose.slides.ms.System.u3.n5(com.aspose.slides.internal.v6g.k5.n5(b6$u3.class), var4 * 2)
         );
         com.aspose.slides.ms.System.u3.n5(com.aspose.slides.ms.System.u3.n5((Object)(this.u9)), com.aspose.slides.ms.System.u3.n5((Object)(var5)), var4);
         this.u9 = var5;
      }

      this.u9[var4].n5(var1, var2, var3);
      if (this.t2) {
         this.k5(this.h0);
      } else if (this.h0 == 16) {
         this.c8 = new Dictionary<>(this.c4);

         for (int var6 = 0; var6 <= this.h0; var6++) {
            this.k5(var6);
         }

         this.t2 = true;
      }
   }

   private void k5(int var1) {
      String var2 = this.u9[var1].n5;
      int var3 = 0;
      Integer[] var4 = new Integer[]{var3};
      boolean var5 = this.c8.tryGetValue(var2, var4);
      var3 = var4[0];
      if (var5) {
         this.u9[var1].u3 = var3;
      }

      this.c8.set_Item(var2, var1);
   }

   private int s7(String var1) {
      int var2 = 0;
      if (this.t2) {
         Integer[] var3 = new Integer[]{var2};
         boolean var4 = this.c8.tryGetValue(var1, var3);
         var2 = var3[0];
         if (var4) {
            return var2;
         }
      } else {
         for (int var6 = this.h0; var6 >= 0; var6--) {
            if (com.aspose.slides.ms.System.d1.a6(this.u9[var6].n5, var1)) {
               return var6;
            }
         }
      }

      return -1;
   }

   private void n5(int var1, int var2) {
      for (int var3 = var2; var3 >= var1; var3--) {
         if (this.u9[var3].u3 == -1) {
            this.c8.removeItemByKey(this.u9[var3].n5);
         } else {
            this.c8.set_Item(this.u9[var3].n5, this.u9[var3].u3);
         }
      }
   }

   private static XmlException h0(String var0, String var1) {
      com.aspose.slides.internal.l7h.a5 var2 = new com.aspose.slides.internal.l7h.a5();
      if (var0.length() > 0) {
         var2.n5(var0);
         var2.n5(':');
      }

      var2.n5(var1);
      return new XmlException("'{0}' is a duplicate attribute name.", var2.toString());
   }

   private void u3(int var1) {
      if (this.z3 >= 15) {
         if (this.z3 != 15 && this.z3 != 16) {
            throw new InvalidOperationException(v3.n5("Token {0} in state {1} would result in an invalid XML document.", l6[var1], a6(this.z3)));
         } else {
            throw new InvalidOperationException(v3.n5("The Writer is closed or in error state."));
         }
      } else {
         int var2;
         label51:
         while (true) {
            var2 = this.q0[(var1 << 4) + this.z3];
            if (var2 < 16) {
               break;
            }

            switch (var2) {
               case 16:
                  this.l6(var1, this.z3);
                  break label51;
               case 101:
                  this.y4();
                  var2 = 4;
                  break label51;
               case 102:
                  this.y4();
                  var2 = 3;
                  break label51;
               case 103:
                  this.y4();
                  var2 = 5;
                  break label51;
               case 104:
                  this.t2();
                  var2 = 2;
                  break label51;
               case 106:
                  this.t2();
                  var2 = 3;
                  break label51;
               case 107:
                  this.l6();
                  this.y4();
                  var2 = 3;
                  break label51;
               case 108:
                  this.l6();
                  this.y4();
                  var2 = 4;
                  break label51;
               case 109:
                  this.l6();
                  this.y4();
                  var2 = 4;
                  break label51;
               case 111:
                  this.l6();
                  var2 = 8;
                  break label51;
               case 112:
                  if (this.u3 != null) {
                     this.u3.c8();
                  }

                  this.z3 = 4;
                  break;
               case 113:
                  if (this.u3 != null) {
                     this.u3.c8();
                  }

                  this.z3 = 8;
                  break;
               case 114:
                  if (this.u3 != null) {
                     this.u3.c8();
                  }

                  this.z3 = 11;
                  break;
               case 115:
                  this.c8();
                  var2 = 3;
                  break label51;
               case 116:
                  this.c8();
                  var2 = 4;
                  break label51;
               case 117:
                  this.c8();
                  var2 = 5;
                  break label51;
               case 118:
                  this.l6();
                  var2 = 11;
               default:
                  break label51;
            }
         }

         this.z3 = var2;
      }
   }

   private void y4() {
      int var1 = this.s7[this.x8].n5;

      for (int var2 = this.h0; var2 > var1; var2--) {
         if (this.u9[var2].k5 == 1) {
            this.u9[var2].n5(this.k5, this.u3);
         }
      }

      if (this.u3 != null) {
         this.u3.n5();
      }
   }

   private static String a6(int var0) {
      return var0 >= 16 ? "Error" : n5[var0];
   }

   public final String u3(String var1) {
      for (int var2 = this.h0; var2 >= 0; var2--) {
         if (com.aspose.slides.ms.System.d1.a6(this.u9[var2].n5, var1)) {
            return this.u9[var2].l6;
         }
      }

      return this.a6 != null ? this.a6.n5(var1) : null;
   }

   private String x8(String var1) {
      for (int var2 = this.h0; var2 > this.s7[this.x8].n5; var2--) {
         if (com.aspose.slides.ms.System.d1.a6(this.u9[var2].n5, var1)) {
            return this.u9[var2].l6;
         }
      }

      return null;
   }

   private String e2() {
      String var1 = com.aspose.slides.ms.System.d1.n5(new String[]{"p", com.aspose.slides.ms.System.a3.n5(this.h0 - 2, "d", com.aspose.slides.internal.x7n.l6.k5())});
      if (this.u3(var1) == null) {
         return var1;
      }

      int var2 = 0;

      String var3;
      do {
         var3 = com.aspose.slides.ms.System.d1.n5(new String[]{var1, com.aspose.slides.ms.System.a3.n5(var2, com.aspose.slides.internal.x7n.l6.k5())});
         var2++;
      } while (this.u3(var3) != null);

      return var3;
   }

   private void n3(String var1) {
      int var2 = var1.length();
      if ((this.r4.n5[var1.charAt(0)] & 255 & 4) != 0) {
         for (int var3 = 1; var3 < var2; var3++) {
            if ((this.r4.n5[var1.charAt(var3)] & 255 & 8) == 0) {
               throw n5(var1, var3);
            }
         }
      } else {
         throw n5(var1, 0);
      }
   }

   private static Exception n5(String var0, int var1) {
      String[] var2 = XmlException.buildCharExceptionArgs(var0, var1);
      String[] var3 = new String[]{var0, var2[0], var2[1]};
      return new ArgumentException(v3.n5("Invalid name character in '{0}'. The '{1}' character, hexadecimal value {2}, cannot be included in a name.", var3));
   }

   private void l6(int var1, int var2) {
      String var3 = v3.n5("Token {0} in state {1} would result in an invalid XML document.", l6[var1], a6(var2));
      switch (var2) {
         case 0:
         case 7:
            if (this.z8 == 2) {
               throw new InvalidOperationException(
                  com.aspose.slides.ms.System.d1.n5(new Object[]{
                     var3,
                     ' ',
                     v3.n5(
                        "Make sure that the ConformanceLevel setting is set to ConformanceLevel.Fragment or ConformanceLevel.Auto if you want to write an XML fragment."
                     )
                  })
               );
            }
         default:
            throw new InvalidOperationException(var3);
      }
   }

   private boolean t9() {
      return this.z3 >= 15;
   }

   private void l6(String var1, String var2, String var3) {
      int var4 = this.y4++;
      if (var4 == this.n3.length) {
         b6$n5[] var5 = (b6$n5[])com.aspose.slides.ms.System.u3.n5(
            com.aspose.slides.ms.System.u3.n5(com.aspose.slides.internal.v6g.k5.n5(b6$n5.class), var4 * 2)
         );
         com.aspose.slides.ms.System.u3.n5(com.aspose.slides.ms.System.u3.n5((Object)(this.n3)), com.aspose.slides.ms.System.u3.n5((Object)(var5)), var4);
         this.n3 = var5;
      }

      this.n3[var4].n5(var1, var2, var3);
      if (this.y4 < 14) {
         for (int var6 = 0; var6 < var4; var6++) {
            if (this.n3[var6].l6(var1, var2, var3)) {
               throw h0(var1, var2);
            }
         }
      } else {
         if (this.y4 == 14) {
            if (this.e2 == null) {
               this.e2 = new Dictionary<>(this.c4);
            }

            for (int var7 = 0; var7 < var4; var7++) {
               this.u9(var7);
            }
         }

         this.u9(var4);

         for (int var8 = this.n3[var4].u3; var8 > 0; var8 = this.n3[var8].u3) {
            if (this.n3[--var8].l6(var1, var2, var3)) {
               throw h0(var1, var2);
            }
         }
      }
   }

   private void u9(int var1) {
      String var2 = this.n3[var1].k5;
      int var3 = this.e2.size();
      this.e2.set_Item(var2, 0);
      if (var3 == this.e2.size()) {
         int var4 = var1 - 1;

         while (var4 >= 0 && !com.aspose.slides.ms.System.d1.a6(this.n3[var4].k5, var2)) {
            var4--;
         }

         this.n3[var1].u3 = var4 + 1;
      }
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 k5() {
      return d2;
   }

   static {
      com.aspose.slides.internal.v6g.k5.n5(b6$u3.class, new v7());
      com.aspose.slides.internal.v6g.k5.n5(b6$k5.class, new t7());
      com.aspose.slides.internal.v6g.k5.n5(b6$n5.class, new c9());
   }
}

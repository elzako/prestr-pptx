package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.ms.System.IDisposable;

class r1b extends o5r {
   private com.aspose.slides.internal.l7h.a5 n5 = new com.aspose.slides.internal.l7h.a5();

   @Override
   public void n5(MathAccent var1) {
      if (f7r.l6(var1.getCharacter())) {
         String var2 = f7r.n5(var1.getCharacter());
         int var3 = com.aspose.slides.ms.System.d1.u3(var2, '0');
         if (var3 > 0) {
            this.n5.n5(com.aspose.slides.ms.System.d1.l6(var2, 0, var3));
            this.n5(var1.getBase());
            this.n5.n5(com.aspose.slides.ms.System.d1.k5(var2, var3 + 1));
         } else {
            this.n5.n5(com.aspose.slides.ms.System.d1.n5("\\text{{(Unknown char code 0x{0:X}) }}", new Object[]{var1.getCharacter()}));
         }
      } else {
         this.n5.n5(com.aspose.slides.ms.System.d1.n5("\\text{{(Unknown char code 0x{0:X}) }}", new Object[]{var1.getCharacter()}));
      }
   }

   @Override
   public void n5(MathArray var1) {
      r0g var2 = var1.getParent_Immediate();
      if (com.aspose.slides.internal.v6g.k5.l6(var2, MathNaryOperator.class)) {
         this.n5.n5("\\substack{");
      } else {
         this.n5.n5("\\begin{matrix}");
      }

      for (int var3 = 0; var3 < var1.getArguments().getCount(); var3++) {
         this.n5(var1.getArguments().get_Item(var3));
         if (var3 < var1.getArguments().getCount() - 1) {
            this.n5.n5("\\\\");
         }
      }

      if (com.aspose.slides.internal.v6g.k5.l6(var2, MathNaryOperator.class)) {
         this.n5.n5('}');
      } else {
         this.n5.n5("\\end{matrix}");
      }
   }

   @Override
   public void n5(MathBar var1) {
      boolean var2 = var1.getPosition() == 2;
      this.n5.n5(var2 ? "\\underline{" : "\\overline{");
      this.n5(var1.getBase());
      this.n5.n5('}');
   }

   @Override
   public void n5(MathBorderBox var1) {
      this.n5.n5("\\boxed{");
      this.n5(var1.getBase());
      this.n5.n5('}');
   }

   @Override
   public void n5(MathDelimiter var1) {
      if (var1.getBeginningCharacter() == '{') {
         this.n5.n5(com.aspose.slides.ms.System.d1.n5(new Object[]{"\\left\\", var1.getBeginningCharacter()}));
      } else if (var1.getBeginningCharacter() == 10216) {
         this.n5.n5("\\left\\langle ");
      } else if (var1.getBeginningCharacter() == 8970) {
         this.n5.n5("\\left\\lfloor ");
      } else if (var1.getBeginningCharacter() == 8968) {
         this.n5.n5("\\left\\lceil ");
      } else if (var1.getBeginningCharacter() == 8214) {
         this.n5.n5("\\left\\| ");
      } else if (var1.getBeginningCharacter() == 10214) {
         this.n5.n5("\\left\\lBrack ");
      } else if (var1.getBeginningCharacter() == 0) {
         this.n5.n5("\\left. ");
      } else {
         this.n5.n5(com.aspose.slides.ms.System.d1.n5(new Object[]{"\\left", var1.getBeginningCharacter()}));
      }

      for (int var2 = 0; var2 < var1.getArguments().getCount(); var2++) {
         this.n5(var1.getArguments().get_Item(var2));
         if (var2 < var1.getArguments().getCount() - 1) {
            this.n5.n5(var1.getSeparatorCharacter());
         }
      }

      if (var1.getEndingCharacter() == '}') {
         this.n5.n5(com.aspose.slides.ms.System.d1.n5(new Object[]{"\\right\\", var1.getEndingCharacter()}));
      } else if (var1.getEndingCharacter() == 10217) {
         this.n5.n5("\\right\\rangle ");
      } else if (var1.getEndingCharacter() == 8971) {
         this.n5.n5("\\right\\rfloor ");
      } else if (var1.getEndingCharacter() == 8969) {
         this.n5.n5("\\right\\rceil ");
      } else if (var1.getEndingCharacter() == 8214) {
         this.n5.n5("\\right\\| ");
      } else if (var1.getEndingCharacter() == 10215) {
         this.n5.n5("\\right\\rBrack ");
      } else if (var1.getEndingCharacter() == 0) {
         this.n5.n5("\\right. ");
      } else {
         this.n5.n5(com.aspose.slides.ms.System.d1.n5(new Object[]{"\\right", var1.getEndingCharacter()}));
      }
   }

   @Override
   public void n5(MathFraction var1) {
      switch (var1.getFractionType()) {
         case 1:
            this.n5.n5("\\frac");
            this.n5.n5('{');
            this.n5(var1.getNumerator());
            this.n5.n5('}');
            this.n5.n5('{');
            this.n5(var1.getDenominator());
            this.n5.n5('}');
            break;
         case 2:
         case 3:
            this.n5.n5("\\nicefrac{");
            this.n5(var1.getNumerator());
            this.n5.n5('}');
            this.n5.n5('{');
            this.n5(var1.getDenominator());
            this.n5.n5('}');
            break;
         case 4:
            this.n5.n5("\\begin{matrix}");
            this.n5(var1.getNumerator());
            this.n5.n5("\\\\");
            this.n5(var1.getDenominator());
            this.n5.n5("\\end{matrix}");
            break;
         default:
            throw new NotImplementedException();
      }
   }

   @Override
   public void n5(MathFunction var1) {
      this.n5.n5("\\");
      this.n5(var1.getName());
      this.n5.n5(' ');
      this.n5(var1.getBase());
   }

   @Override
   public void n5(MathBox var1) {
      this.n5(var1.getBase());
   }

   @Override
   public void n5(MathGroupingCharacter var1) {
      switch (var1.getCharacter()) {
         case '←':
            if (var1.getPosition() == 2) {
               this.n5.n5("\\underleftarrow{");
            } else {
               this.n5.n5("\\overleftarrow{");
            }
            break;
         case '→':
            if (var1.getPosition() == 2) {
               this.n5.n5("\\underrightarrow{");
            } else {
               this.n5.n5("\\overrightarrow{");
            }
            break;
         case '↔':
            if (var1.getPosition() == 2) {
               this.n5.n5("\\underleftrightarrow{");
            } else {
               this.n5.n5("\\overleftrightarrow{");
            }
            break;
         case '⇐':
            if (var1.getPosition() == 2) {
               this.n5.n5("\\underset{\\Leftarrow}{");
            } else {
               this.n5.n5("\\overset{\\Leftarrow}{");
            }
            break;
         case '⇒':
            if (var1.getPosition() == 2) {
               this.n5.n5("\\underset{\\Rightarrow}{");
            } else {
               this.n5.n5("\\overset{\\Rightarrow}{");
            }
            break;
         case '⇔':
            if (var1.getPosition() == 2) {
               this.n5.n5("\\underset{\\Leftrightarrow}{");
            } else {
               this.n5.n5("\\overset{\\Leftrightarrow}{");
            }
            break;
         case '⏞':
            this.n5.n5("\\overbrace{");
            break;
         case '⏟':
            this.n5.n5("\\underbrace{");
      }

      this.n5(var1.getBase());
      this.n5.n5('}');
   }

   @Override
   public void n5(MathLeftSubSuperscriptElement var1) {
      this.n5.n5("_{");
      this.n5(var1.getSubscript());
      this.n5.n5('}');
      this.n5.n5("^{");
      this.n5(var1.getSuperscript());
      this.n5.n5('}');
      this.n5(var1.getBase());
   }

   @Override
   public void n5(MathLimit var1) {
      this.n5(var1.getBase());
      if (var1.getUpperLimit()) {
         this.n5.n5("^{");
      } else {
         this.n5.n5("_{");
      }

      this.n5(var1.getLimit());
      this.n5.n5('}');
   }

   @Override
   public void n5(MathBlock var1) {
      IGenericEnumerator var2 = var1.iterator();

      try {
         while (var2.hasNext()) {
            IMathElement var3 = (IMathElement)var2.next();
            this.n5(var3);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }
   }

   @Override
   public void n5(MathematicalText var1) {
      String var2 = var1.getValue();

      for (int var3 = 0; var3 < var2.length(); var3++) {
         int var4 = this.n5(var2, var3);
         if (var4 > 0) {
            var3++;
         } else if (com.aspose.slides.ms.System.t9.a6(var2.charAt(var3))) {
            int var5 = com.aspose.slides.ms.System.t9.n5(var2.charAt(var3), var2.charAt(var3 + 1));
            this.n5.n5(f7r.n5(var5));
            var3++;
         } else {
            this.n5.n5(f7r.n5(var2.charAt(var3)));
         }
      }
   }

   @Override
   public void n5(MathMatrix var1) {
      if (this.n5.l6() > 0 && this.n5.l6(this.n5.l6() - 1) != '\n') {
         this.n5.n5("\n");
      }

      this.n5.n5("\\begin{matrix}\n");

      for (int var2 = 0; var2 < var1.getRowCount(); var2++) {
         for (int var3 = 0; var3 < var1.getColumnCount(); var3++) {
            if (var3 > 0) {
               this.n5.n5("&");
            }

            this.n5(var1.get_Item(var2, var3));
         }

         if (var2 < var1.getRowCount() - 1) {
            this.n5.n5("\\\\\n");
         }
      }

      this.n5.n5("\n\\end{matrix}\n");
   }

   @Override
   public void n5(MathNaryOperator var1) {
      boolean var2 = var1.getLimitLocation() == 1;
      boolean var3 = var1.getLimitLocation() == 2;
      String var4 = com.aspose.slides.ms.System.d1.n5(var1.getOperator(), 1);
      switch (var4.charAt(0)) {
         case '\u0000':
            this.n5.n5("\\int");
            if (var2) {
               this.n5.n5("\\limits");
            }
            break;
         case '∏':
            this.n5.n5("\\prod");
            if (var3) {
               this.n5.n5("\\nolimits");
            }
            break;
         case '∑':
            this.n5.n5("\\sum");
            break;
         case '∬':
            this.n5.n5("\\iint");
            if (var2) {
               this.n5.n5("\\limits");
            }
            break;
         case '∭':
            this.n5.n5("\\iiint");
            if (var2) {
               this.n5.n5("\\limits");
            }
            break;
         case '∮':
            this.n5.n5("\\oint");
            if (var2) {
               this.n5.n5("\\limits");
            }
            break;
         case '∯':
            this.n5.n5("\\oiint");
            if (var2) {
               this.n5.n5("\\limits");
            }
            break;
         case '∰':
            this.n5.n5("\\oiiint ");
            if (var2) {
               this.n5.n5("\\limits");
            }
            break;
         case '⋀':
            this.n5.n5("\\bigwedge");
            if (var3) {
               this.n5.n5("\\nolimits");
            }
            break;
         case '⋁':
            this.n5.n5("\\bigvee");
            if (var3) {
               this.n5.n5("\\nolimits");
            }
            break;
         case '⋂':
            this.n5.n5("\\bigcap");
            if (var3) {
               this.n5.n5("\\nolimits");
            }
            break;
         case '⋃':
            this.n5.n5("\\bigcup");
            if (var3) {
               this.n5.n5("\\nolimits");
            }
            break;
         default:
            this.n5.n5(com.aspose.slides.ms.System.d1.n5("\\text{{(Unknown operator code 0x{0:X}) }}", new Object[]{Integer.valueOf(var4.charAt(0))}));
      }

      this.n5.n5("_{");
      this.n5(var1.getSubscript());
      this.n5.n5("}^{");
      this.n5(var1.getSuperscript());
      this.n5.n5('}');
      this.n5(var1.getBase());
   }

   @Override
   public void n5(MathRadical var1) {
      boolean var2 = var1.getDegree() == null && var1.getHideDegree();
      this.n5.n5("\\sqrt");
      if (var2) {
         this.n5.n5('{');
         this.n5(var1.getBase());
         this.n5.n5('}');
      } else {
         this.n5.n5('[');
         this.n5(var1.getDegree());
         this.n5.n5(']');
         this.n5.n5('{');
         this.n5(var1.getBase());
         this.n5.n5('}');
      }
   }

   @Override
   public void n5(MathRightSubSuperscriptElement var1) {
      this.n5(var1.getBase());
      this.n5.n5("_{");
      this.n5(var1.getSubscript());
      this.n5.n5('}');
      this.n5.n5("^{");
      this.n5(var1.getSuperscript());
      this.n5.n5('}');
   }

   @Override
   public void n5(MathSubscriptElement var1) {
      this.n5(var1.getBase());
      this.n5.n5("_{");
      this.n5(var1.getSubscript());
      this.n5.n5('}');
   }

   @Override
   public void n5(MathSuperscriptElement var1) {
      this.n5(var1.getBase());
      this.n5.n5("^{");
      this.n5(var1.getSuperscript());
      this.n5.n5('}');
   }

   @Override
   public void n5(k3k var1) {
   }

   public void n5(IMathElement var1) {
      MathElementBase var2 = (MathElementBase)var1;
      if (var1 == null) {
         this.n5.n5("{}");
      } else {
         var2.n5(this);
      }
   }

   private int n5(String var1, int var2) {
      if (var2 > var1.length() - 1 && var1.charAt(var2 + 1) == '=') {
         if (var1.charAt(var2) == '+') {
            this.n5.n5("\\mathrel{+}=");
         }

         if (var1.charAt(var2) == '-' || var1.charAt(var2) == 8722) {
            this.n5.n5("\\mathrel{-}=");
         }

         return 1;
      } else {
         return 0;
      }
   }

   public final String n5(IMathParagraph var1) {
      if (var1.getCount() <= 0) {
         return com.aspose.slides.ms.System.d1.n5;
      }

      if (var1.getCount() > 1) {
         IGenericEnumerator var2 = var1.iterator();

         try {
            while (var2.hasNext()) {
               IMathBlock var3 = (IMathBlock)var2.next();
               this.n5.n5("&");
               this.n5(var3);
               this.n5.n5("\\\\\n");
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
               var2.dispose();
            }
         }

         this.n5.n5(0, "\\begin{align*}\n");
         if (this.n5.l6(this.n5.l6() - 1) != '\n') {
            this.n5.n5("\n");
         }

         this.n5.n5("\\end{align*}\n");
      } else {
         this.n5(var1.get_Item(0));
         this.n5.n5(0, "\\[\n");
         if (this.n5.l6(this.n5.l6() - 1) != '\n') {
            this.n5.n5("\n");
         }

         this.n5.n5("\\]\n");
      }

      return this.n5.toString();
   }

   @Override
   public void n5(MathPhantom var1) {
   }
}

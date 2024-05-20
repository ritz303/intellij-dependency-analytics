// This is a generated file. Not intended for manual editing.
package org.jboss.tools.intellij.componentanalysis.gradle.build.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static org.jboss.tools.intellij.componentanalysis.gradle.build.psi.BuildGradleTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import org.jboss.tools.intellij.componentanalysis.gradle.build.psi.*;

public class ArtifactImpl extends ASTWrapperPsiElement implements Artifact {

  public ArtifactImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull Visitor visitor) {
    visitor.visitArtifact(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof Visitor) accept((Visitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public ArtifactId getArtifactId() {
    return findNotNullChildByClass(ArtifactId.class);
  }

  @Override
  @Nullable
  public Comment getComment() {
    return findChildByClass(Comment.class);
  }

  @Override
  @NotNull
  public Group getGroup() {
    return findNotNullChildByClass(Group.class);
  }

  @Override
  @NotNull
  public Version getVersion() {
    return findNotNullChildByClass(Version.class);
  }

  @Override
  @Nullable
  public PsiElement getConfigName() {
    return findChildByType(CONFIG_NAME);
  }

  @Override
  @Nullable
  public PsiElement getWhiteSpace() {
    return findChildByType(WHITE_SPACE);
  }

}

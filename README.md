# TaskManagementSystem

When you are working on local without setting up git - down the line u have to use these commands when local branch exists but remote branch doesnt
# Step 1: Checkout your local develop branch
git checkout develop

# Step 2: Fetch latest changes from remote
git fetch origin

# Step 3: If you want to merge any changes from the main branch, do:
git merge origin/main  # or origin/master, depending on your default branch

# Step 4: Resolve any merge conflicts if they arise.

# Step 5: Push your local develop branch to the remote
git push origin develop

# Step 6: Set upstream tracking (optional but recommended)
git push --set-upstream origin develop

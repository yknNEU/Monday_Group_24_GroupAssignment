# Monday_Group_24_GroupAssignment

This is the repository for group assignment 2 - Pricing Model.

## Contribute

### rules

There should be 5 branches. One `main` branch, one `dev` branch and the other 3 personal branches.

The `main` branch should always be deployable. You cannot directly make any commits or pull requests to the `main` branch.

The `dev` branch contains our newest code, after you finish your code, you need to make a pull request to the `dev` branch, and we will merge it after we review it.

Only after we have made a careful test on the `dev` branch and make sure it can run properly, we then merge the `dev` branch to the `main` branch.

You should always make your own commits to your own branch.

Your commit message should be clearly state that what you have done in this commit.

### git

After others finished their work, and their code has been merged to the `dev` branch, then you can merge their code to your own branch:

```bash
git switch dev
git pull
git switch <Your branch name>
git merge dev
```

But remember that if there are some commits in your own branch that are still not merged to the `dev` branch, you might get a conflict if you run the command above. To avoid this, you'd better push your commits to github and open a pull request, after your commits have merged to the `dev` branch, then you can run the command above.

You can create and upload your own commits by:

```bash
git switch <Your branch name>
git add .
git commit -m "Commit Message"
git push
```

Then create a pull request in Github and just wait for these commits to be merged.

If you want to discard all your change, you can run:

```bash
git reset --hard <commit id>
```

If you just want to discard the change in a certain file, you can run:

```bash
git checkout HEAD <file name>
```

You can see your commit history by running:

```bash
git log
```

or

```bash
git log --graph --oneline
```

## Our work

### Kaining Yang Work

- Finish branch configuration

### Prasad Shinde Work

- Finished create git repository.

### Yao Zhang Work

- Finish branch configuration
